package top.zlcxy.blog.service.impl;

import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;
import top.zlcxy.blog.interceptor.AccessKey;
import top.zlcxy.blog.service.RedisService;

import javax.annotation.Resource;
import java.util.concurrent.TimeUnit;

/**
 * @author zhangl
 * @version 1.0
 * @description: 实现redis操作
 * @date 2020-09-24 21:57
 */
@Service
public class RedisServiceImpl<T> implements RedisService {

    @Resource  //不能用Autowired
    private RedisTemplate<String, Integer> redisTemplate;

    @Override
    public   T get(AccessKey ak, String key)  {
        return (T) redisTemplate.opsForValue().get(key);
    }

    @Override
    public void set(AccessKey ak, String key, int i) {
        redisTemplate.opsForValue().set(key, i, ak.getSeconds(), TimeUnit.SECONDS);
    }

    @Override
    public void incr(AccessKey ak, String key) {
        if (redisTemplate.hasKey(key)) {
            redisTemplate.opsForValue().set(key,   redisTemplate.opsForValue().get(key) + 1, ak.getSeconds(), TimeUnit.SECONDS);
        }
    }
}
