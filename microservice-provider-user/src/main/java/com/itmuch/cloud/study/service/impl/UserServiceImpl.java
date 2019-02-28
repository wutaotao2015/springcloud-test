package com.itmuch.cloud.study.service.impl;

import com.itmuch.cloud.study.dao.UserDao;
import com.itmuch.cloud.study.entity.User;
import com.itmuch.cloud.study.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by wutt
 * 2019/2/28 16:53
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public User findById(Long id) {
        return userDao.findById(id);
    }
}
