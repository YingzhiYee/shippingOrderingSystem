package com.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * FileName: Sender
 * Date: 2023/5/22
 * Description: Sender实体
 */
@Data
@TableName("sender")
public class Sender {

    private String phone; // 电话号码

    private String snederidnum; // 寄件人身份证号

    private String sendername; // 寄件人姓名

    private String senderprovince; // 寄件人省份

    private String senderdetailaddress; // 寄件人具体地址

}
