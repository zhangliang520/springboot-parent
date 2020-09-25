package top.zlcxy.blog.service;

import top.zlcxy.blog.beans.UserInfo;

/**
 * @author zhangl
 * @version 1.0
 * @description: TODO
 * @date 2020-09-23 21:19
 */
public interface IUserInfoService {

    UserInfo findByUsername(String userName);
}
