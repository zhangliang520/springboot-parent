package top.zlcxy.blog.init;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/**
 * @author zhangl
 * @version 1.0
 * @description: 实现CommandLineRunner接口的初始化类
 * @date 2020-09-14 19:43
 */

@Component
public class Runner  implements CommandLineRunner {

    @Override
    public void run(String... args) throws Exception {
        System.out.println("The Runner start to initialize");
    }
}
