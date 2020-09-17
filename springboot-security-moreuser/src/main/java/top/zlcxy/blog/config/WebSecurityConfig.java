package top.zlcxy.blog.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

import javax.annotation.Resource;

/**
 * @author zhangl
 * @version 1.0
 * @description: 配置多用户验证
 * @date 2020-09-17 23:33
 */
@Configuration
@EnableWebSecurity //开启security
@EnableGlobalMethodSecurity(prePostEnabled=true) //开启security角色访问
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {

    @Resource
    private SecurityUser securityUser;


    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder(); //密码加密
    }

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        /*
         * 这里配置了两个用户 admin和user
         */
        auth.inMemoryAuthentication()
                .withUser("admin")
                .password(passwordEncoder().encode("123456"))
                .roles("admin");

        auth.inMemoryAuthentication()
                .withUser("user")
                .password(passwordEncoder().encode("123456"))
                .roles();

        auth.inMemoryAuthentication()
                .withUser(securityUser.getName())
                .password(passwordEncoder().encode(securityUser.getPassword()))
                .roles("normal");
    }

}
