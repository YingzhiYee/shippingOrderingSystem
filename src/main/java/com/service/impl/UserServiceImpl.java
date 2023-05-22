package com.service.impl;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.entity.User;
import com.mapper.UserMapper;
import com.service.UserService;
import com.vo.R;
import com.vo.param.*;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


/**
 * FileName:  UserServiceImpl
 * Date: 2023/05/22
 */
@Service
//@Transactional
@AllArgsConstructor
public class UserServiceImpl extends ServiceImpl<UserMapper,User> implements UserService {
    private final UserMapper userMapper;

    // 登陆
    @Override
    public R login(LoginParam loginParam){
        QueryWrapper<User> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("phone",loginParam.getPhone()).eq("password",loginParam.getPassword());
        User user = userMapper.selectOne(queryWrapper);
        R r = new R();
        if (user != null && user.getPassword().equals(loginParam.getPassword())){
            String token= user.getToken(user);
            r.data("token",token);
            r.data("errorCode","200");
            r.data("errorMessage","登陆成功");
        } else {
            r.data("token","0");
            r.data("errorCode","404");
            r.data("errorMessage","登陆失败");
        }
        return r;
    }

    // 注册
    @Override
    public R register(RegisterParam registerParam) {
        R r= new R();
//        QueryWrapper<User> queryWrapper=new QueryWrapper<>();
//        queryWrapper.eq("username",registerParam.getUsername());
//        boolean u = userMapper.exists(queryWrapper);
//        System.out.println(u);
//        if(!u)
//        {
//            User user=new User();
//            user.setUsername(registerParam.getUsername());
//            user.setPassword(registerParam.getPassword());
//            userMapper.insert(user);
//            r.data("status_code",true);
//            return r;
//        }
//        else {
//            r.data("status_code",false);
//            return r;
//        }
        return R.error();
    }
}
