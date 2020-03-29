package com.example.redis.test;

import com.example.domain.User;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;
import java.util.concurrent.TimeUnit;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TestRedis {

    @Autowired
    private StringRedisTemplate stringRedisTemplate;
    @Autowired
    private RedisTemplate redisTemplate;

    @Test
    public void testRedisSet() throws Exception {
        stringRedisTemplate.opsForValue().set("aaa", "111");
        Assert.assertEquals("111", stringRedisTemplate.opsForValue().get("aaa"));
    }

    /**
     * 测试对象是否存在
     */
    @Test
    public void testUserExist() throws Exception {
        User user=new User(1L,"zhangl", "123456", "1796969389@qq.com", "zhangl",new Date());
        redisTemplate.opsForValue().set("User::"+ user.getId(), user);
        Assert.assertEquals(true, redisTemplate.hasKey("User::"+ user.getId()));
    }

    /**
     * 测试获取对象属性
     */
    @Test
    public void testUserName() throws Exception {
        User user=new User(1L,"zhangl", "123456", "1796969389@qq.com", "zhangl",new Date());
        redisTemplate.opsForValue().set("User::"+ user.getId(), user);
        Assert.assertEquals("zhangl", ((User)redisTemplate.opsForValue().get("User::"+ user.getId())).getUserName());
    }

    /**
     * 测试删除对象
     * @throws Exception
     */
    @Test
    public void testUserDelete() throws Exception {
        User user=new User(1L,"zhangl", "123456", "1796969389@qq.com", "zhangl",new Date());
        redisTemplate.opsForValue().set("User::"+ user.getId(), user);
        redisTemplate.delete("User::"+ user.getId());
        Assert.assertEquals(false, redisTemplate.hasKey("User::"+ user.getId()));
    }

    /**
     * 测试过期时间
     * @throws Exception
     */
    @Test
    public void testUserSetTime() throws Exception {
        User user=new User(1L,"zhangl", "123456", "1796969389@qq.com", "zhangl",new Date());
        redisTemplate.opsForValue().set("User::"+ user.getId(), user,1, TimeUnit.SECONDS);
        Assert.assertEquals(true, redisTemplate.hasKey("User::"+ user.getId()));
        //等待1s
        Thread.sleep(1000L);
        Assert.assertEquals(false, redisTemplate.hasKey("User::"+ user.getId()));
    }

}
