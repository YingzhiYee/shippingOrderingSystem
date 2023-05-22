package com.controller;

import com.service.FeeService;
import com.service.ShipmentsService;
import com.vo.R;
import com.vo.param.GetShippingFeeParam;
import com.vo.param.PayShippingFeeParam;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * FileName:  UserController
 * Date: 2023/05/22
 */

@RestController
@RequestMapping("/fees")
//@CrossOrigin
@AllArgsConstructor
public class FeesController {

    @Autowired
    private FeeService feeService;

    // 支付运费--post
    @PostMapping("pay-shipping-fee")
    public R payShippingFee(@RequestBody PayShippingFeeParam payShippingFeeParam){
        return feeService.payShippingFee(payShippingFeeParam);
    }

    // 获取支付运费--get
    @GetMapping("get-shipping-fee")
    public R getShippingFee(@RequestParam(value = "token")String token, @RequestBody GetShippingFeeParam getShippingFeeParam){
        return feeService.getShippingFee(getShippingFeeParam);
    }

}
