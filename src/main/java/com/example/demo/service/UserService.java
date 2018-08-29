package com.example.demo.service;

import com.example.demo.entity.User;
import java.util.List;

/**
 * 用户服务
 *
 * @author gavincook
 * @date 2018-08-29 14:57
 * @since 1.0.0
 */
public interface UserService {

    /**
     * 搜索所有的用户
     */
    List<User> searchAll();

    /**
     * 新增用户
     *
     * @param user 用户对象
     * @return 新增是否成功
     */
    boolean add(User user);
}
