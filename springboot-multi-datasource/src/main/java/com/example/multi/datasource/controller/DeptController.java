package com.example.multi.datasource.controller;

import com.example.multi.datasource.domain.Dept;
import com.example.multi.datasource.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DeptController {
    @Autowired
    private DeptService deptService;

    @RequestMapping("/dept-add")
    public String add(){
        Dept dept = new Dept();
        dept.setName("开发部");
        return deptService.addDept(dept)?"插入成功":"插入失败";
    }

}
