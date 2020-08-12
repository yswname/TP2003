package cn.com.demo.springboot.demo.constroller;

import cn.com.demo.springboot.demo.entity.DmUser;
import cn.com.demo.springboot.demo.service.IDmUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import javax.servlet.http.HttpSession;
import java.util.List;
import java.util.concurrent.TimeUnit;

@Controller
public class DmUserController {
    @Autowired
    private IDmUserService userService;
    @Autowired
    @Qualifier("myRedisTemplate") // @Resource
    private RedisTemplate<String,Object> redisTemplate;
    /**
     * 显示登录页面的请求方法
     * */
    @GetMapping("/loginPage")
    public String loginPage(){
        return "login";
    }
    /**
     * 处理登录验证的方法
     * */
    @PostMapping("/login")
    public String login(String userName,String password, Model model, HttpSession session){
        String result = "redirect:/userList?id=1";
        boolean bool = false ;
        String msg = null;
        try {
            bool = this.userService.verify(userName, password);
            if(!bool){
                msg = "登录失败：密码不匹配";
            }else{
                // 在Session中保存当前的用户名
                session.setAttribute("userName",userName);
                // 往Redis中添加登录标记
                this.redisTemplate.opsForValue().set(userName,"hasLogin");
                // 有bug
                this.redisTemplate.expire(userName, 1000, TimeUnit.SECONDS);
            }
        }catch(Exception e){
            msg = "登录失败：" + e.getMessage();
        }
        if(!bool){
            model.addAttribute("msg",msg);
            result = "redirect:/loginPage";
        }
        return result;
    }
    /**
     * 注册页面的方法
     * */
    @GetMapping("/registePage")
    public String registePage(){
        return "register";
    }
    /**
     * 处理注册功能的方法
     * */
    @PostMapping("/registe")
    public String registe(DmUser user, Model model){
        String result = "redirect:/loginPage";
        String msg = null;
        try {
            this.userService.register(user);
        }catch(Exception e){
            msg = "注册失败:" + e.getMessage();
            model.addAttribute("msg",msg);
            result = "redirect:/registePage";
        }
        return result;
    }
    /**
     * 显示用户列表的方法
     * */
    @GetMapping("/userList")
    public String userList(Model model,HttpSession session){
        String result ="userList";
        // 判断是否有登录，如果没有登录，转向到login页面，有登录，继续跑
        // 知道哪个
        try {
            String userName = (String) session.getAttribute("userName");
            Object loginFlag = this.redisTemplate.opsForValue().get(userName);
            if (loginFlag == null) {
                result = "redirect:/loginPage";
            } else {
                List<DmUser> userList = this.userService.searchAll();
                for (DmUser u : userList) {
                    System.out.println(u.getUrName());
                }
                model.addAttribute("userList", userList);
                model.addAttribute("welcome", "Welcome......");
            }
        }catch(Exception e){
            result = "redirect:/loginPage";
        }
        return result;
    }
}
