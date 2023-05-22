package com.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.entity.Fee;
import com.entity.User;
import com.vo.R;
import com.vo.param.*;

public interface FeeService extends IService<Fee> {
    /**
     * 1.支付运费
     * @put
     */
    R payShippingFee(PayShippingFeeParam payShippingFeeParam);

    /**
     * 2.获取支付运费
     * @get
     */
    R getShippingFee(GetShippingFeeParam getShippingFeeParam);

}
