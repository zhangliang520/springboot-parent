package top.zlcxy.blog;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.concurrent.CountDownLatch;

/**
 * @author zhangl
 * @version 1.0
 * @description: 启动类
 * @date 2020-09-16 1:18
 */
@SpringBootApplication
public class ApplicationListener {

    public static void main(String[] args) throws Exception {
        System.out.println("The service to start");
        SpringApplication.run(ApplicationListener.class, args);
        new CountDownLatch(1).await();
    }
}
