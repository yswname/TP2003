package cn.com.demo.springboot.demo.service;

import cn.com.demo.springboot.demo.entity.DmUser;

import java.util.List;

public interface IDmUserService {
    /**
     * 匹配密码
     * */
    public boolean verify(String userName,String password);
    /**
     * 注册
     * */
    public void register(DmUser user);
    /**
     * 查找所有用户
     * */
    public List<DmUser> searchAll();
}
