package com.example.multi.datasource.domain;

import lombok.Data;

import java.io.Serializable;

@Data
public class User implements Serializable {
    private static final long serialVersionUID = 1L;

    private Long id;
    private String userName;
    private String passWord;
    private String nickName;
}
