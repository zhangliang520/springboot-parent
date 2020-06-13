package top.zlcxy.mongodb;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import top.zlcxy.mongodb.domain.User;
import top.zlcxy.mongodb.repository.UserRepository;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserRepositoryTest {

    @Autowired
    private UserRepository userRepository;

    @Test
    public void testSaveUser() throws Exception {
        User user = new User();
        user.setId(1l);
        user.setUserName("小明");
        user.setPassWord("123");
        Assert.assertEquals("新增操作",userRepository.saveUser(user),1L);
    }

    @Test
    public void findUserByUserName() {
        User user = userRepository.findUserByUserName("小明");
        Assert.assertNotNull(user);
    }

    @Test
    public void updateUser() {
        User user = new User();
        user.setId(1l);
        user.setUserName("小红");
        user.setPassWord("456");
        Assert.assertEquals("更新操作",userRepository.updateUser(user),1L);
    }

    @Test
    public void deleteUserById() {
        Assert.assertEquals("删除操作",userRepository.deleteUserById(1l),1L);
    }
}
