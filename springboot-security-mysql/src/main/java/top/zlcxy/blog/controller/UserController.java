package top.zlcxy.blog.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zhangl
 * @version 1.0
 * @description: TODO
 * @date 2020-09-23 21:00
 */

@RestController
public class UserController {

    @GetMapping("/hello")
    public String getHello() {
        return "Hello,Spring Security";
    }


}
