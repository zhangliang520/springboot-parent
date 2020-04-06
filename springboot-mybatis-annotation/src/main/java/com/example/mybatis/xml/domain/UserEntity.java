package com.example.mybatis.xml.domain;

import com.example.mybatis.xml.enums.UserSexEnum;
import lombok.Data;

@Data
public class UserEntity {
    private Long id;
    private UserSexEnum userSex;
    private String userName;
    private String nickName;
    private String passWord;

    public UserEntity(){}

    public UserEntity(String userName, String nickName, UserSexEnum userSex) {
        this.nickName = nickName;
        this.userName = userName;
        this.userSex = userSex;
    }
}
