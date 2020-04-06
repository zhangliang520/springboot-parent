package com.example.mybatis.xml.mapper;

import com.example.mybatis.xml.domain.UserEntity;
import com.example.mybatis.xml.enums.UserSexEnum;
import org.apache.ibatis.annotations.*;

import java.util.List;

public interface UserMapper {

    @Select("SELECT * FROM tb_user")
    @Results({
            @Result(property = "userSex",  column = "user_sex", javaType = UserSexEnum.class),
            @Result(property = "nickName", column = "nick_name")
    })
    List<UserEntity> getAll();

    @Select("SELECT * FROM tb_user WHERE id = #{id}")
    @Results({
            @Result(property = "userSex",  column = "user_sex", javaType = UserSexEnum.class),
            @Result(property = "nickName", column = "nick_name")
    })
    UserEntity getOne(Long id);

    @Select("SELECT count(*) FROM tb_user")
    int getCount();

    @Insert("INSERT INTO tb_user(userName,passWord,user_sex,nick_name) VALUES(#{userName}, #{passWord}, #{userSex},#{nickName})")
    int insert(UserEntity user);

    @Update("UPDATE tb_user SET userName=#{userName},nick_name=#{nickName} WHERE id =#{id}")
    int update(UserEntity user);

    @Delete("DELETE FROM tb_user WHERE id =#{id}")
    int delete(Long id);

}
