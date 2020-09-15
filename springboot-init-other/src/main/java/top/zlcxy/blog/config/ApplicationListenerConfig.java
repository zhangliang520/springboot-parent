package top.zlcxy.blog.config;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

/**
 * @author zhangl
 * @version 1.0
 * @description: 监听应用事件
 * @date 2020-09-16 1:22
 */
@Component
public class ApplicationListenerConfig implements ApplicationListener<ContextRefreshedEvent>  {

    @Override
    public void onApplicationEvent(ContextRefreshedEvent  contextRefreshedEvent) {
        System.out.println("The ApplicationListenerConfig to start.");
    }
}
