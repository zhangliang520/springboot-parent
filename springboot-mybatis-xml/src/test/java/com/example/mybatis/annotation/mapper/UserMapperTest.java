package com.example.mybatis.annotation.mapper;

import com.example.mybatis.annotation.domain.UserEntity;
import com.example.mybatis.annotation.enums.UserSexEnum;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserMapperTest {

    @Autowired
    private UserMapper userMapper;

    @Test
    public void testInsert() throws Exception {
        int count = userMapper.getCount();
        userMapper.insert(new UserEntity("zhangl", "jackson", UserSexEnum.MAN));
        Assert.assertEquals(count+1, userMapper.getAll().size());
    }

    @Test
    public void testQuery() throws Exception {
        List<UserEntity> users = userMapper.getAll();
        Assert.assertNotNull(users);
    }


    @Test
    public void testUpdate() throws Exception {
        UserEntity user = userMapper.getOne(1L);
        user.setNickName("张亮");
        userMapper.update(user);
        Assert.assertTrue(("张亮".equals(userMapper.getOne(1L).getNickName())));
    }

    @Test
    public void testDelete(){
        Assert.assertTrue(userMapper.delete(9L)>0);
    }
}
