package com.example.jpa.respository;

import com.example.jpa.BaseTest;
import com.example.jpa.domain.User;
import com.example.jpa.repository.UserRepository;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import javax.annotation.Resource;
import java.text.SimpleDateFormat;
import java.util.Date;


public class UserRppositoryTest extends BaseTest {

    @Resource
    private UserRepository userRepository;

    /**
     * 新增
     */
    @Test
    public void testSave(){
        User user = new User();
        user.setAge(30);
        user.setNickName("zhangl1");
        user.setUserName("zhangl1");
        user.setPassWord("123456");
        user.setEmail("17969693891@qq.com");
        user.setRegTime(new SimpleDateFormat("yyyy-MM-dd").format(new Date()));
        Assert.assertNotNull(userRepository.save(user));//true
    }

    /**
     * 查询所有
     */
    @Test
    public void testFindAll(){
        Assert.assertEquals(2, userRepository.findAll().size());
    }

    /**
     * 根据主键查询
     */
    @Test
    public void testFindById(){
        Assert.assertEquals("13128600812",  userRepository.findById(1L).get().getPassWord());
    }

    /**
     * 根据用户名查询
     */
    @Test
    public void testFindByUserName(){
        Assert.assertNotNull( userRepository.findByUserName("zhangl1") );
    }

    @Test
    public void testFindByUserNameOrEmail(){
        Assert.assertEquals(2,userRepository.findByUserNameOrEmail("zhangl1", "1796969389@qq.com").size());
    }

    @Test
    public void testDeleteById(){
        userRepository.deleteById(11L);
        Assert.assertFalse(userRepository.findById(11L).isPresent());
    }


    @Test
    public void testFindByEmailLike(){
        Assert.assertEquals(2,userRepository.findByEmailLike("%1796969389%").size());
    }

    @Test
    public void testFindAllByPage(){
        Pageable pageable = PageRequest.of(0, 10, new Sort(Sort.Direction.DESC, "id"));
        Assert.assertEquals(2,userRepository.findAll(pageable).getTotalElements());
    }

    @Test
    public void testQueryFirst10ByUserName(){
        Pageable pageable = PageRequest.of(0, 10, new Sort(Sort.Direction.DESC, "id"));
        Page<User> userPage = userRepository.queryFirst10ByUserName("zhangl1", pageable);
        Assert.assertEquals(1,userRepository.queryFirst10ByUserName("zhangl1", pageable).getSize() );
    }

    @Test
    public void testFindTopByOrderByAgeDesc(){
        Assert.assertEquals(30,(int)userRepository.findTopByOrderByAgeDesc().getAge());
    }

    @Test
    public void testUpdateUserNameById(){
        Assert.assertEquals(1,userRepository.updateUserNameById("zhangl",1L));
    }

    @Test
    public void testFindByUserNameLike(){
        Assert.assertEquals(2,userRepository.findByUserNameLike("%zhang%").size());
    }

    @Test
    public void testDeleteByUserId(){
        Assert.assertEquals(0,userRepository.deleteByUserId(0L));
    }

    @Test
    public void testFindUserHobby(){
        Assert.assertEquals(2,userRepository.findUserHobby(1L).getHobbies().size());
    }
}
