package cn.com.demo.springboot.demo.service.impl;

import cn.com.demo.springboot.demo.SpringbootDemoApplication;
import cn.com.demo.springboot.demo.entity.DmUser;
import cn.com.demo.springboot.demo.mapper.DmUserMapper;
import cn.com.demo.springboot.demo.service.IDmUserService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = SpringbootDemoApplication.class)
public class TestDmUserServiceImpl {
    @Autowired
    private IDmUserService userService;
    @Autowired
    private DmUserMapper userMapper;
    @Test
    public void testVerify(){
        // 测试数据
        String userName = "z";
        String password = "z";

        // 期望
        boolean result = true;
        // 获取实际结果
        result = userService.verify(userName,password);
        // 断言
        Assert.assertTrue(result);
    }
    @Test
    public void testRegister(){
         DmUser user = new DmUser();
         user.setUrAge(20);
         user.setUrName("李四");
         user.setUrPassword("123");
         user.setUrPhone("111111");
         user.setUrSex("男");
         user.setUrUserName("lisi");

         this.userService.register(user);

         user = userMapper.selectByUserName("lisi");
         Assert.assertNotNull(user);
    }
    @Test
    public void testSearchAll(){
        List<DmUser> userList = this.userService.searchAll();
        int size = userList.size();
        boolean bool = size == 4 || size == 5;
        Assert.assertTrue(bool);
    }
}
