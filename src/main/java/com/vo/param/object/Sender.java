package com.vo.param.object;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

/**
 * FileName: Sender
 * Date: 2023/05/22
 * Description: 该类用作 封装sender 的类
 */

@Getter
@Setter
public class Sender {

    private String senderName;
    private String senderIDNumber;
    private String senderPhone;
    private String senderProvince;
    private String senderDetailAddress;

    public Sender(String senderName,String senderIDNumber,String senderPhone,String senderProvince,String senderDetailAddress){
        this.senderName = senderName;
        this.senderIDNumber = senderIDNumber;
        this.senderPhone = senderPhone;
        this.senderProvince = senderProvince;
        this.senderDetailAddress = senderDetailAddress;
    }
}
