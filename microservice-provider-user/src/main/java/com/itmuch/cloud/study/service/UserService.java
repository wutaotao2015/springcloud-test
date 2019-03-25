package com.itmuch.cloud.study.service;

import com.baomidou.mybatisplus.plugins.Page;
import com.itmuch.cloud.study.entity.User;

import java.util.List;

/**
 * Created by wutt
 * 2019/2/28 16:52
 */
public interface UserService {

    User findById(Long id);

    void insert(User user);

    List<User> selectUserList(Page<User> page, String name);
}
