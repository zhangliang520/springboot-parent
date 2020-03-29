package com.example.demo.repository;
import com.example.demo.model.UserBean;
import com.example.demo.model.UserBeanRepository;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.text.DateFormat;
import java.util.Date;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class UserRepositoryTests {

    @Autowired
    private UserBeanRepository userBeanRepository;

    @Test
    public void testSave() throws Exception {
        Date date = new Date();
        DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG);
        String formattedDate = dateFormat.format(date);
        userBeanRepository.save(new UserBean("张亮", "13128600812", "1796969389@qq.com", "zhangl", 29, formattedDate));
 }

    @Test
    public void testFindAll() throws Exception {
        Assert.assertEquals(1, userBeanRepository.findAll().size());

    }

    @Test
    public void testFindByUserNameOrEmail() throws Exception {
        Assert.assertEquals("zhangl", userBeanRepository.findByUserNameOrEmail("张亮", "cc@126.com").getNickName());
    }

    @Test
    public void testDelete() throws Exception {
        userBeanRepository.delete(userBeanRepository.findByUserName("aa1"));
    }
}
