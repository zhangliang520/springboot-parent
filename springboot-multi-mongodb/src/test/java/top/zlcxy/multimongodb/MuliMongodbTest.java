package top.zlcxy.multimongodb;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import top.zlcxy.multimongodb.domain.User;
import top.zlcxy.multimongodb.repository.primary.UserPrimaryRepository;
import top.zlcxy.multimongodb.repository.secondary.UserSecondaryRepository;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MuliMongodbTest {

    @Autowired
    private UserPrimaryRepository userPrimaryRepository;

    @Autowired
    private UserSecondaryRepository userSecondaryRepository;

    @Test
    public void testUser() {
        userPrimaryRepository.save(new User(1L,"张三", "123456"));
        List<User> primaryUsers = userPrimaryRepository.findAll();
        for (User user : primaryUsers) {
            System.out.println(user);
        }

        userSecondaryRepository.save(new User(2L,"李四", "123456"));
        List<User> secondaryUsers = userSecondaryRepository.findAll();
        for (User user : secondaryUsers) {
            System.out.println(user);
        }

    }

}
