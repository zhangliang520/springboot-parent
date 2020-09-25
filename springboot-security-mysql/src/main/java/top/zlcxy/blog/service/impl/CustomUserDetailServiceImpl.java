package top.zlcxy.blog.service.impl;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import top.zlcxy.blog.service.IUserDetailsService;

/**
 * @author zhangl
 * @version 1.0
 * @description: TODO
 * @date 2020-09-23 21:18
 */
@Service
public class CustomUserDetailServiceImpl implements IUserDetailsService {

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        return null;
    }
}
