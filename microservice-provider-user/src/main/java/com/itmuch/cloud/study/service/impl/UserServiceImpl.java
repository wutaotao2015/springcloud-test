package com.itmuch.cloud.study.service.impl;

import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;
import com.itmuch.cloud.study.dao.UserDao;
import com.itmuch.cloud.study.entity.User;
import com.itmuch.cloud.study.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

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

    @Override
    public void insert(User user) {
        userDao.insertTest(user);
    }

    @Override
    public List<User> selectUserList(Page<User> page, String name) {
        return userDao.selectUserList(page, name);
    }

}
