package com.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * FileName: Fee
 * Date: 2023/5/22
 * Description: Fee实体
 */
@Data
@TableName("fee")
public class Fee {
    private String shipmenntcode;

    private String shippingfee;

    private String ispayornot;

    private String senderphone;
}
