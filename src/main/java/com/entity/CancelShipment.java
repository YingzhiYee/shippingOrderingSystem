package com.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * FileName: CancelShipment
 * Date: 2023/5/22
 * Description: CancelShipment实体
 */
@Data
@TableName("cancelshipment")
public class CancelShipment {

    private String shipmentcode;

    private Boolean cancelornot;

    private String cancelreason;

    private String canceltime;

    private String modifyanordertime;

}
