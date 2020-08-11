package cn.com.demo.springboot.demo.mapper;

import cn.com.demo.springboot.demo.SpringbootDemoApplication;
import cn.com.demo.springboot.demo.entity.DmUser;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = SpringbootDemoApplication.class)
public class TestDmUserMapper {
    @Autowired
    private DmUserMapper userMapper;
    @Test
    public void testSelectByPrimaryKey(){
        // 准备测试数据
        int id= 1;//long
        // 准备期望值
        // z  张三
        String userName = "z";
        String name = "张三";
        // 获取实际值
        DmUser user = userMapper.selectByPrimaryKey(id);//Long
        String actUserName= user.getUrUserName();
        String actName = user.getUrName();
        Assert.assertEquals(userName, actUserName);
        Assert.assertEquals(name,actName);
    }
}
