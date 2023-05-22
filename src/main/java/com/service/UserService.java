package com.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.entity.User;
import com.vo.R;
import com.vo.param.*;

//@Service
//public class UserService {
//
//    @Autowired
//    private Usermapper usermapper=(Usermapper)  ApplicationContextHelperUtil.getBean(Usermapper.class);
//    public boolean Login(user user1){
//        QueryWrapper<user> userQueryWrapper = new QueryWrapper<>();
//        userQueryWrapper.eq("email",user1.getEmail()).eq("password",user1.getPassword());
//        return usermapper.equals(userQueryWrapper);
//    }
//}

public interface UserService extends IService<User> {
    /**
     * 1.登陆
     *
     * @param loginParam（token,用户名,密码）
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
