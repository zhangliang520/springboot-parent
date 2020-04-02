package com.example.jpa.domain;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Data
@Entity(name = "tb_user")
public class User implements Serializable {

    @Id
    @GeneratedValue
    private Long id;
    @Column(nullable = false, unique = true)
    private String userName;
    @Column(nullable = false)
    private String passWord;
    @Column(nullable = false, unique = true)
    private String email;
    @Column(nullable = true, unique = true)
    private String nickName;
    @Column(nullable = false)
    private String regTime;
    @Column(nullable = false)
    private Integer age;

    @OneToMany(fetch=FetchType.EAGER)
    @JoinColumn(name="user_id",referencedColumnName="id")
    private List<Hobby> hobbies;

}
