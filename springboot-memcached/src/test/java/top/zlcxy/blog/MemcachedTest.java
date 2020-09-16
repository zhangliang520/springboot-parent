package top.zlcxy.blog;

import net.spy.memcached.MemcachedClient;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import top.zlcxy.blog.init.MemcachedRunner;

import javax.annotation.Resource;

/**
 * @author zhangl
 * @version 1.0
 * @description: 测试memcached初体验
 * @date 2020-09-16 19:35
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class MemcachedTest {
    @Resource
    private MemcachedRunner memcachedRunner;

    @Test
    public void testSetGet()  {
        MemcachedClient memcachedClient = memcachedRunner.getClient();
        memcachedClient.set("tel",1000,"13128600812");
        System.out.println("作者微信号：" + memcachedClient.get("tel"));
    }
}
