package com.gpvip.mybatisplus.mybatisplusdemo.mapper;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

/**
 * ClassName:UserMapperTest
 * Package:com.pvip.mybatisplus.mybatisplusdemo.mapper
 * description
 * Created by zhangbin on 2019/9/4.
 *
 * @author: zhangbin q243132465@163.com
 * @Version 1.0.0
 * @CreateTime： 2019/9/4 9:57
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class UserMapperTest {
/*    @Autowired
    private UserMapper userMapper;
    @Test
    public void userTest(){
        QueryWrapper<User> queryWrapper=new QueryWrapper<>();
        queryWrapper.eq("name","张三").lt("age","32");
        List<User> users = userMapper.selectList(queryWrapper);
        for (User user : users) {
            System.out.println(user);
        }


    }*/
}