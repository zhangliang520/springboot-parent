package com.example.demo.model;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserBeanRepository extends JpaRepository<UserBean, Long> {
    /**
     * 根据用户名查询用户
     * @param userName
     * @return
     */
    UserBean findByUserName(String userName);

    /**
     * 根据用户名或邮箱查询用户
     * @param username
     * @param email
     * @return
     */
    UserBean findByUserNameOrEmail(String username, String email);
}
