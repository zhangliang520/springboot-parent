package top.zlcxy.blog.service;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

/**
 * @author zhangl
 * @version 1.0
 * @description: TODO
 * @date 2020-09-23 21:16
 */
public interface IUserDetailsService {

    public UserDetails loadUserByUsername(String username)  throws UsernameNotFoundException;
}
