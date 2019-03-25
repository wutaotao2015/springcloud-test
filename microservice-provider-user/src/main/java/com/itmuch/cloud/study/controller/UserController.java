package com.itmuch.cloud.study.controller;

import com.baomidou.mybatisplus.plugins.Page;
import com.google.gson.Gson;
import com.itmuch.cloud.study.entity.User;
import com.itmuch.cloud.study.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;
import java.util.List;

@RestController
public class UserController {
  @Autowired
  private UserService userService;

  @GetMapping("/{id}")
  public User findById(@PathVariable Long id) {
    User findOne = this.userService.findById(id);
    return findOne;
  }
  @GetMapping("/insert")
  public void insertTest(){
    User user = new User();
    user.setId(1L);
    user.setUsername("user");
    user.setName("name");
    user.setBalance(new BigDecimal(44));
    this.userService.insert(user);
  }
  @GetMapping("/page")
  public String page(@RequestParam String name) {
    Page<User> userPage = new Page<>();
    userPage.setSize(3);
    userPage.setCurrent(2);
    List<User> list = this.userService.selectUserList(userPage, name);
    return new Gson().toJson(list);
  }
}
