package com.itmuch.cloud.study.dao;

import com.baomidou.mybatisplus.plugins.pagination.Pagination;
import com.itmuch.cloud.study.dto.Criteria;
import com.itmuch.cloud.study.entity.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserDao {

    User findById(@Param("id") Long id);

    int insertTest(User user);

    List<User> selectUserList(Pagination page, Criteria criteria);
}
