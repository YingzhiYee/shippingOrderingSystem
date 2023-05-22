package com.controller;

import com.service.UserService;
import com.vo.R;
import com.vo.param.*;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.support.SimpleTriggerContext;
import org.springframework.web.bind.annotation.*;

import java.security.PublicKey;

/**
 * FileName:  UserController
 * Date: 2023/05/22
 */

@RestController
@RequestMapping("/user")
//@CrossOrigin
@AllArgsConstructor
public class UserController {

    @Autowired
    private UserService userService;

    // 登陆--post保存
    @PostMapping("login")
    public R login(@RequestBody LoginParam loginParam) {
        return userService.login(loginParam);
    }

    // 注册--post保存
    @PostMapping("register")
    public R register(@RequestBody RegisterParam registerParam) {
        return userService.register(registerParam);
    }

}
