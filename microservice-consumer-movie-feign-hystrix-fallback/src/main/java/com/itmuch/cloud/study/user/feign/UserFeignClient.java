package com.itmuch.cloud.study.user.feign;

import com.itmuch.cloud.config.FeignLogConfiguration;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;

import com.itmuch.cloud.study.user.entity.User;

import java.util.Map;

/**
 * Feign的fallback测试
 * 使用@FeignClient的fallback属性指定回退类
 *
 * @author 周立
 */
@FeignClient(name = "microservice-provider-user",
        fallback = FeignClientFallback.class,
        configuration = {FeignLogConfiguration.class})
public interface UserFeignClient {

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public User findById(@PathVariable("id") Long id);

    // 该请求不会成功
//  @RequestMapping(value = "/get", method = RequestMethod.GET)
//  public User get0(User user);

    @RequestMapping(value = "/get", method = RequestMethod.GET)
    public User get1(@RequestParam("id") Long id, @RequestParam("username") String username);

    @RequestMapping(value = "/get", method = RequestMethod.GET)
    public User get2(@RequestParam Map<String, Object> map);

    @RequestMapping(value = "/post", method = RequestMethod.POST)
    public User post(@RequestBody User user);

}

/**
 * 回退类FeignClientFallback需实现Feign Client接口
 * FeignClientFallback也可以是public class，没有区别
 *
 * @author 周立
 */
@Component
class FeignClientFallback implements UserFeignClient {

    private User defaultUser() {
        User user = new User();
        user.setId(-1L);
        user.setUsername("默认用户");
        return user;
    }

    @Override
    public User findById(Long id) {
        return defaultUser();
    }

    @Override
    public User get1(Long id, String username) {
        return defaultUser();
    }

    @Override
    public User get2(Map<String, Object> map) {
        return defaultUser();
    }

    @Override
    public User post(User user) {
        return defaultUser();
    }
}