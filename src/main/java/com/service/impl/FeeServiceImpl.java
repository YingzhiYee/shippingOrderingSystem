package com.service.impl;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.entity.Fee;
import com.mapper.FeeMapper;
import com.service.FeeService;
import com.vo.R;
import com.vo.param.GetShippingFeeParam;
import com.vo.param.PayShippingFeeParam;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


/**
 * FileName:  FeeServiceImpl
 * Date: 2023/05/22
 * @author yyz叶颖芝
 */
@Service
@AllArgsConstructor
public class FeeServiceImpl extends ServiceImpl<FeeMapper, Fee> implements FeeService {
    private final FeeMapper feeMapper;

    @Override
    public R payShippingFee(PayShippingFeeParam payShippingFeeParam){
        R r = new R();
        return r;
    }

    @Override
    public  R getShippingFee(GetShippingFeeParam getShippingFeeParam){
        R r = new R();
        return r;
    }




}
