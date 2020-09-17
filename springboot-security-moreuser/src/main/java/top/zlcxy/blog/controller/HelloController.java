package top.zlcxy.blog.controller;

import org.springframework.security.access.prepost.PreAuthorize;
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

    @GetMapping("/admin/hello")
    @PreAuthorize("hasAnyRole('admin')")
    public String getAdminHello() {
        return "Hello admin,Spring Security";
    }

    @GetMapping("/normal/hello")
    @PreAuthorize("hasAnyRole('normal')")
    public String getNormalHello() {
        return "Hello normal,Spring Security";
    }

    @GetMapping("/all/hello")
    @PreAuthorize("hasAnyRole('admin','normal')")
    public String getAllHello() {
        return "Hello roles,Spring Security";
    }

}
