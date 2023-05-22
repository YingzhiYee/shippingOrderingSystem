package com.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * FileName: Shipments
 * Date: 2023/5/22
 * Description: Shipments实体
 */
@Data
@TableName("shipments")
public class Shipments {

    private String shipmentcode; // 快递单号

    private String placeanordertime; // 下单时间

    private String choosesecourier; // 选择快递员

    private String expectedtime; // 预计上门时间

    private String paymentmethod; // 支付方式

    private String estimatedcost; // 预估支付金额

}
