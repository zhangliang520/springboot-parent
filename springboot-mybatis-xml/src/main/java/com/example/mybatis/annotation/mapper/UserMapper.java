package com.example.mybatis.annotation.mapper;

import com.example.mybatis.annotation.domain.UserEntity;

import java.util.List;

public interface UserMapper {

    List<UserEntity> getAll();

    UserEntity getOne(Long id);

    int getCount();

    int insert(UserEntity user);

    int update(UserEntity user);

    int delete(Long id);

}
