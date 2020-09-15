package top.zlcxy.blog.config;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

/**
 * @author zhangl
 * @version 1.0
 * @description: PostConstruct注解初始化资源
 * @date 2020-09-16 1:29
 */
@Component
public class PostConstructConfig {

    @PostConstruct
    public void init1() {
        System.out.println("The PostConstructConfig init1 to start.");
    }

    @PostConstruct
    public void init2() {
        System.out.println("The PostConstructConfig init2 to start.");
    }
}
