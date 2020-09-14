package top.zlcxy.blog.init;

import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * @author zhangl
 * @version 1.0
 * @description: 第二个启动初始化参数类
 * @date 2020-09-14 19:44
 */
@Component
@Order(2)
public class SecondRunner implements CommandLineRunner {

    @Override
    public void run(String... args) throws Exception {
        System.out.println("The SecondRunner start to initialize");
    }
}
