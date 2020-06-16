package top.zlcxy.mybatis.plus.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

@TableName("tb_user")
public class UserEntity {

    @TableId(type= IdType.AUTO)
    private Long id;

    private UserSexEnum userSex;
    @TableField(value="userName")
    private String userName;
    private String nickName;

    @TableField(value="passWord")
    private String passWord;

    public UserEntity(){}

    public UserEntity(String userName, String nickName, UserSexEnum userSex) {
        this.nickName = nickName;
        this.userName = userName;
        this.userSex = userSex;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public UserSexEnum getUserSex() {
        return userSex;
    }

    public void setUserSex(UserSexEnum userSex) {
        this.userSex = userSex;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("UserEntity{");
        sb.append("id=").append(id);
        sb.append(", userSex=").append(userSex);
        sb.append(", userName='").append(userName).append('\'');
        sb.append(", nickName='").append(nickName).append('\'');
        sb.append(", passWord='").append(passWord).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
