package com.example.domain;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class User implements Serializable {
        private static final long serialVersionUID = 1L;

        private Long id;
        private String userName;
        private String password;
        private String email;
        private String nickname;
        private Date regTime;

        public User() {
        }

        public User(Long id, String userName, String password, String email, String nickname, Date regTime) {
                this.id = id;
                this.userName = userName;
                this.password = password;
                this.email = email;
                this.nickname = nickname;
                this.regTime = regTime;
        }
}
