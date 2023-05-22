package com.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * FileName: Parcl
 * Date: 2023/5/22
 * Description: Parcel实体
 */
@Data
@TableName("parcel")
public class Parcel {
    private String shippingregion;

    private String shippingcurrent;

    private String shippingdestination;

    private String shipmentcode;

    private String type;

    private double weight;

    private String issuranceornot; // 报价与否

    private String notes; // 备注
}
