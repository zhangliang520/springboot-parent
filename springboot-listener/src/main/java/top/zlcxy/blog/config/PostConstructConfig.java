package top.zlcxy.blog.config;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

/**
 * @author zhangl
 * @version 1.0
 * @description: TODO
 * @date 2020-09-16 1:29
 */
@Component
public class InitConfig {

    @PostConstruct
    public void init() {
        System.out.println("The InitConfig  init to start.");
    }

    @PostConstruct
    public void init2() {
        System.out.println("The InitConfig init2 to start.");
    }
}
