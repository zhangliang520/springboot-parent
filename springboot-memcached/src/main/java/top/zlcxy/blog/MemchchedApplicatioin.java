package top.zlcxy.blog;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.concurrent.CountDownLatch;

/**
 * @author zhangl
 * @version 1.0
 * @description: TODO
 * @date 2020-09-16 19:33
 */
@SpringBootApplication
public class MemchchedApplicatioin {

    public static void main(String[] args) throws Exception {
        SpringApplication.run(MemchchedApplicatioin.class, args);
        new CountDownLatch(1).await();
    }
}
