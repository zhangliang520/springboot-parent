package top.zlcxy.blog.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import top.zlcxy.blog.beans.Result;
import top.zlcxy.blog.beans.User;
import top.zlcxy.blog.config.Contant;
import top.zlcxy.blog.interceptor.AccessLimit;

import javax.servlet.http.HttpServletRequest;

/**
 * @author zhangl
 * @version 1.0
 * @description: TODO
 * @date 2020-09-24 21:51
 */
@RestController
public class UserController {

    @AccessLimit(seconds=5, maxCount=5, needLogin=true)
    @RequestMapping("/getUser")
    public Result getUser(){
        return Result.success("请求成功");
    }


    @AccessLimit(seconds=5, maxCount=5, needLogin=false)
    @RequestMapping("/login")
    public Result login(HttpServletRequest request){
        User user = new User();
        user.setUserName("admin");
        user.setPassword("adminn");
        request.getSession().setAttribute(Contant.CURRENT_USER,user);
        return Result.success("登录成功");
    }
}
