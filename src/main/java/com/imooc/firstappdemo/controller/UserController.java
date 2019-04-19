package com.imooc.firstappdemo.controller;

import com.imooc.firstappdemo.domain.User;
import com.imooc.firstappdemo.repository.UserRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


/**
 * @ClassName UserController
 * @Description TODO
 * @Author xiaohui.huang
 * @Date 2019/4/17 15:17
 * @Version 1.0
 */
@RestController
public class UserController {

    private final static Logger log = LoggerFactory.getLogger(UserController.class);

    private final UserRepository userRepository;


    @Autowired
    public UserController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @PostMapping("/user/save")
    public User save(@RequestParam String name) {
        User user = new User();
        user.setName(name);
        if (userRepository.save(user)) {
            log.info("用户信息保存成功:"+user.toString());
        }

        return user;
    }
}
