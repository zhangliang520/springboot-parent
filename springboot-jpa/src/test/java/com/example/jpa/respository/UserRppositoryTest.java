package com.example.jpa.respository;

import com.example.jpa.BaseTest;
import com.example.jpa.domain.User;
import com.example.jpa.repository.UserRepository;
import org.junit.Assert;
import org.junit.Test;

import javax.annotation.Resource;
import java.text.SimpleDateFormat;
import java.util.Date;


public class UserRppositoryTest extends BaseTest {

    @Resource
    private UserRepository userRepository;

    /**
     * 新增
     */
    @Test
    public void testSave(){
        User user = new User();
        user.setAge(30);
        user.setNickName("zhangl1");
        user.setUserName("zhangl1");
        user.setPassWord("123456");
        user.setEmail("17969693891@qq.com");
        user.setRegTime(new SimpleDateFormat("yyyy-MM-dd").format(new Date()));
        Assert.assertNotNull(userRepository.save(user));//true
    }

    /**
     * 查询所有
     */
    @Test
    public void testFindAll(){
        Assert.assertEquals(2, userRepository.findAll().size());
    }

    /**
     * 根据主键查询
     */
    @Test
    public void testFindById(){
        Assert.assertEquals("13128600812",  userRepository.findById(1L).get().getPassWord());
    }

    /**
     * 根据用户名查询
     */
    @Test
    public void testFindByUserName(){
        Assert.assertNotNull( userRepository.findByUserName("zhangl1") );
    }

}
