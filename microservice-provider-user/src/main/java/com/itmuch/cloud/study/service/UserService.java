package com.itmuch.cloud.study.service;

import com.itmuch.cloud.study.entity.User;

/**
 * Created by wutt
 * 2019/2/28 16:52
 */
public interface UserService {

    User findById(Long id);
}
