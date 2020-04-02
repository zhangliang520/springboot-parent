package com.example.jpa.repository;

import com.example.jpa.domain.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import javax.transaction.Transactional;
import java.util.List;

public interface UserRepository extends JpaRepository<User, Long> {

    User findByUserName(String userName);

    /**
     * 用户名或邮箱查询
     */
    List<User> findByUserNameOrEmail(String username, String email);

    /**
     *根据主键删除
     */
    void deleteById(Long id);

    /**
     * 邮箱模糊查询
     */
    List<User> findByEmailLike(String email);

    /**
     * 取前10条数据
     */
    Page<User> queryFirst10ByUserName(String userName, Pageable pageable);

    /**
     * 取年龄最大
     */
    User findTopByOrderByAgeDesc();

    /**
     * 更新用户名
     */
    @Transactional
    @Modifying
    @Query("update com.example.jpa.domain.User u set u.userName = ?1 where u.id = ?2")
    int updateUserNameById(String  userName, Long id);

    /**
     * 用户名模糊查询
     */
    @Query("select u from com.example.jpa.domain.User u where u.userName like ?1")
    List<User>  findByUserNameLike(String userName);

    /**
     * 删除
     */
    @Transactional
    @Modifying
    @Query("delete from com.example.jpa.domain.User where id = ?1")
    int deleteByUserId(Long id);

    @Query("select u from com.example.jpa.domain.User u where u.id=?1")
    User findUserHobby(Long id);
}
