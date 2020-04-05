package com.example.multi.datasource.mapper.db1;

import com.example.multi.datasource.domain.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

@Component
@Mapper
public interface UserMapper {

    void insert(User user);

}
