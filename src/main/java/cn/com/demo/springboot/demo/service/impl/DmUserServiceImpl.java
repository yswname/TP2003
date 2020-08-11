package cn.com.demo.springboot.demo.service.impl;

import cn.com.demo.springboot.demo.entity.DmUser;
import cn.com.demo.springboot.demo.mapper.DmUserMapper;
import cn.com.demo.springboot.demo.service.IDmUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
@Transactional
public class DmUserServiceImpl implements IDmUserService {
    @Autowired
    private DmUserMapper userMapper;
    @Override
    @Transactional(readOnly = true)
    public boolean verify(String userName, String password) {
        boolean result = false;
        // 根据用户名找用户对象
        DmUser user = userMapper.selectByUserName(userName);
        // 如果未null-》抛异常
        if(user == null){
            throw new RuntimeException(userName +" 不存在!");
        }else {
            // 不为null-》比较密码
            result = user.getUrPassword().equals(password);
        }
        return result;
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public void register(DmUser user) {
        this.userMapper.insert(user);
    }

    @Override
    @Transactional(readOnly = true)
    public List<DmUser> searchAll() {
        return this.userMapper.selectByExample(null);
    }
}
