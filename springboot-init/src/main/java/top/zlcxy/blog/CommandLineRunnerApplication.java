package top.zlcxy.blog;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author zhangl
 * @version 1.0
 * @description: 启动类
 * @date 2020-09-14 19:41
 */
@SpringBootApplication
public class CommandLineRunnerApplication {

    public static void main(String[] args) {
        System.out.println("The service to start");
        SpringApplication.run(CommandLineRunnerApplication.class, args);
        System.out.println("The service has started");
    }
}
