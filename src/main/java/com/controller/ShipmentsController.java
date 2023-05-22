package com.controller;

import com.service.ShipmentsService;
import com.service.UserService;
import com.vo.R;
import com.vo.param.*;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.support.SimpleTriggerContext;
import org.springframework.web.bind.annotation.*;

import java.security.PublicKey;

/**
 * FileName: ShipmentsController
 * Date: 2023/05/22
 */

@RestController
@RequestMapping("/shipments")
@AllArgsConstructor
public class ShipmentsController {

    @Autowired
    private ShipmentsService shipmentsService;

    // 用户根据订单号查找快递信息--get
    @GetMapping("check-shipment")
    public R checkShipment(@RequestParam(value = "token")String token) {
        return shipmentsService.checkShipment(token);
    }

    // 用户寄件--post
    @PostMapping("create-shipping-order")
    public R createShippingOrder(@RequestBody CreateShippingOrderParam createShippingOrderParam){
        return shipmentsService.createShippingOrder(createShippingOrderParam);
    }

    // 用户取消寄件--del
//    @DeleteMapping("cancel-shipping=order")
//    public R

    // 用户根据订单ID修改订单
//    @PutMapping("modify-shipment")
//    public R modifyShipment()







}
