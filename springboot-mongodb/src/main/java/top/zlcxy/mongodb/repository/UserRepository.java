package top.zlcxy.mongodb.repository;

import top.zlcxy.mongodb.domain.User;

public interface UserRepository {
    /**
     * 新增用户
     * @param user
     */
    long saveUser(User user);

    /**
     * 用户名查询
     * @param userName
     * @return
     */
     User findUserByUserName(String userName);

    /**
     * 更新用户
     * @param user
     * @return
     */
    long updateUser(User user);

    /**
     * 删除用户
     * @param id
     */
    long deleteUserById(Long id);
}
