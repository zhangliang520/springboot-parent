package com.example.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;

@Entity(name = "tb_user")
public class UserBean implements Serializable {

    @Id
    @GeneratedValue
    private Long id;

    //用户名
    @Column(nullable = false, unique = true)
    private String userName;

    //密码
    @Column(nullable = false)
    private String passWord;

    //邮箱
    @Column(nullable = false, unique = true)
    private String email;

    //昵称
    @Column(nullable = true, unique = true)
    private String nickName;

    //年龄
    @Column
    private int age;

    //注册时间
    @Column(nullable = false)
    private String regTime;

    public UserBean() {
    }

    public UserBean(String userName, String passWord, String email, String nickName, int age, String regTime) {
        this.userName = userName;
        this.passWord = passWord;
        this.email = email;
        this.nickName = nickName;
        this.age = age;
        this.regTime = regTime;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getRegTime() {
        return regTime;
    }

    public void setRegTime(String regTime) {
        this.regTime = regTime;
    }
}
