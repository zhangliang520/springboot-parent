package top.zlcxy.blog.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @author zhangl
 * @version 1.0
 * @description: 获取配置文件数据
 * @date 2020-09-17 23:45
 */

@Component
@ConfigurationProperties(prefix = "security.user3")
public class SecurityUser {

    private String name;
    private String password;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
