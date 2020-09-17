package top.zlcxy.blog;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author zhangl
 * @version 1.0
 * @description: Spring-Security初体验
 * @date 2020-09-17 21:43
 */
@SpringBootApplication //(exclude= SecurityAutoConfiguration.class)
public class SecurityApplication {
    public static void main(String[] args) {

        SpringApplication.run(SecurityApplication.class, args);
    }
}
