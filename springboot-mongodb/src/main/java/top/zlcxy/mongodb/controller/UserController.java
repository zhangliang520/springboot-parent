package top.zlcxy.mongodb.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import top.zlcxy.mongodb.domain.User;
import top.zlcxy.mongodb.repository.UserRepository;

@RestController
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @RequestMapping("/add")
    public String add(){
        User user = new User();
        user.setId(1L);
        user.setUserName("小明");
        user.setPassWord("123");
        userRepository.saveUser(user);
        return "新增成功";
    }

}
