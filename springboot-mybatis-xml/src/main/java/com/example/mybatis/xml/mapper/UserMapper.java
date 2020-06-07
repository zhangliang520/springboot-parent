package com.example.mybatis.xml.mapper;

import com.example.mybatis.xml.domain.UserEntity;

import java.util.List;

public interface UserMapper {

    List<UserEntity> getAll();

    UserEntity getOne(Long id);

    int getCount();

    int insert(UserEntity user);

    int update(UserEntity user);

    int delete(Long id);

}
