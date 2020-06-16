package top.zlcxy.mybatis.plus;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.assertj.core.api.Assertions;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import top.zlcxy.mybatis.plus.domain.UserEntity;
import top.zlcxy.mybatis.plus.domain.UserSexEnum;
import top.zlcxy.mybatis.plus.mapper.UserEntityMapper;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MyBatisPlusTest {

    @Autowired
    private UserEntityMapper userEntityMapper;

    @Test
    public void testSelectOne() {
        UserEntity user = userEntityMapper.selectById(1L);
        System.out.println(user);
    }

    @Test
    public void testInsert() {
        UserEntity user = new UserEntity();
        user.setUserName("zl");
        user.setPassWord("123456");
        user.setNickName("老张");
        user.setUserSex(UserSexEnum.valueOf("WOMEN"));

        Assertions.assertThat(userEntityMapper.insert(user)).isGreaterThan(0);
        Assertions.assertThat(user.getId()).isNotNull();
    }

    @Test
    public void testDelete() {
        Assertions.assertThat(userEntityMapper.deleteById(1L)).isGreaterThan(0);
        Assertions.assertThat(userEntityMapper.delete(new QueryWrapper<UserEntity>()
                .lambda().eq(UserEntity::getUserName, "zhangl"))).isGreaterThan(0);
    }

    @Test
    public void testUpdate() {
        UserEntity user = userEntityMapper.selectById(1L);

        userEntityMapper.update(
                user,
                Wrappers.<UserEntity>lambdaUpdate().eq(UserEntity::getId,1L).set(UserEntity::getPassWord, "12345")
        );
        Assertions.assertThat(userEntityMapper.selectById(1L).getPassWord()).isEqualTo("12345");
    }

    @Test
    public void testSelectAll() {
        List<UserEntity> userList = userEntityMapper.selectList(null);
        userList.forEach(System.out::println);
    }

    @Test
    public void testPage() {
        Page<UserEntity> page = new Page<>(0, 10);
        IPage<UserEntity> userIPage = userEntityMapper.selectPage(page, new QueryWrapper<UserEntity>()
                .eq("userName", "zhangl"));
        Assertions.assertThat(page).isSameAs(userIPage);
        System.out.println("总条数 ------> " + userIPage.getTotal());
        System.out.println("当前页数 ------> " + userIPage.getCurrent());
        System.out.println("当前每页显示数 ------> " + userIPage.getSize());
        System.out.println("显示列表 ------> " + userIPage.getRecords());
    }
}
