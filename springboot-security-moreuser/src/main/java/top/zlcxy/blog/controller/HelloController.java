package top.zlcxy.blog.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zhangl
 * @version 1.0
 * @description: 请求资源
 * @date 2020-09-17 21:44
 */

@RestController
public class HelloController {

    @GetMapping("/hello")
    public String getHello() {
        return "Hello,Spring Security";
    }
}
