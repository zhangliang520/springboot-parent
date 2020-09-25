package top.zlcxy.blog.service;

import top.zlcxy.blog.interceptor.AccessKey;

/**
 * @author zhangl
 * @version 1.0
 * @description: TODO
 * @date 2020-09-24 21:43
 */
public interface RedisService<T> {

    public  T  get(AccessKey ak, String key) ;

    void set(AccessKey ak, String key, int i);

    void incr(AccessKey ak, String key);
}
