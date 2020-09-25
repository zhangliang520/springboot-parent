package top.zlcxy.blog.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import top.zlcxy.blog.interceptor.AccessLimitInterceptor;

/**
 * @author zhangl
 * @version 1.0
 * @description: TODO
 * @date 2020-09-24 21:44
 */
@Configuration
public class WebConfig extends WebMvcConfigurerAdapter {

    @Autowired
    private AccessLimitInterceptor accessLimitInterceptor;

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(accessLimitInterceptor);
    }
}
