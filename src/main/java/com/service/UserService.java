package com.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.entity.User;
import com.vo.R;
import com.vo.param.*;

public interface UserService extends IService<User> {
    /**
     * 1.登陆
     * @param loginParam（token,电话号,密码）
     * @return
     */
    R login(LoginParam loginParam);

    /**
     * 2.注册
     * @param registerParam(用户名,密码）
     * @return
     */
    R register(RegisterParam registerParam);
}
