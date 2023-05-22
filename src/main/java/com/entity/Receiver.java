package com.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * FileName: Receiver
 * Date: 2023/5/22
 * Description: Receiver实体
 */
@Data
@TableName("receiver")
public class Receiver {
    private String phone;

    private String receivername;

    private String receiverprovince;

    private String receiverdetailaddress;

}
