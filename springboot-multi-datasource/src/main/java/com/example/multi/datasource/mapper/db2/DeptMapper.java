package com.example.multi.datasource.mapper.db2;

import com.example.multi.datasource.domain.Dept;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

@Component
@Mapper
public interface DeptMapper {

    void insert(Dept dept);

}
