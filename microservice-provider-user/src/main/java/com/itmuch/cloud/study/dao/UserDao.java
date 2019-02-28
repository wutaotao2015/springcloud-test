package com.itmuch.cloud.study.dao;

import com.itmuch.cloud.study.entity.User;
import org.apache.ibatis.annotations.Param;

public interface UserDao {

    User findById(@Param("id") Long id);
}
