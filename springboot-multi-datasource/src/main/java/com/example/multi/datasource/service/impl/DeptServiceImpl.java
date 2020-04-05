package com.example.multi.datasource.service.impl;

import com.example.multi.datasource.domain.Dept;
import com.example.multi.datasource.mapper.db2.DeptMapper;
import com.example.multi.datasource.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DeptServiceImpl implements DeptService {

    @Autowired
    private DeptMapper deptMapper;

    @Override
    public boolean addDept(Dept dept) {
        deptMapper.insert(dept);
        return true;
    }
}
