package com.vo.param;
import lombok.Getter;

/**
 * FileName: registerParam
 * Date: 2023/05/22
 * Description: 该类用于封装注册表单提交的数据
 */
@Getter
public class RegisterParam {
    // 注册
    private String userNickName; // 用户名

//    private String userTrueName; // 用户名

//    private String userIDNumber; // 用户身份证号

    private String phone; // 用户电话号码
    private String password; // 密码

    public RegisterParam(String userNickName,String phone, String password){
        this.userNickName = userNickName;
//        this.userTrueName = userTrueName;
//        this.userIDNumber = userIDNumber;
        this.phone = phone;
        this.password = password;
    }

}
