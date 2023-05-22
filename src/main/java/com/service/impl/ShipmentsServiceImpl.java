package com.service.impl;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.entity.Shipments;
import com.mapper.ShipmentsMapper;
import com.vo.R;
import com.vo.param.CancelShippingOrderParam;
import com.vo.param.CreateShippingOrderParam;
import com.vo.param.ModefyShipmentParam;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import com.service.ShipmentsService;


/**
 * FileName: ShipmentsServiceImpl
 * Date: 2023/05/22
 */
@Service
@AllArgsConstructor
public class ShipmentsServiceImpl extends ServiceImpl<ShipmentsMapper, Shipments> implements ShipmentsService {
    private final ShipmentsMapper shipmentsMapper;

    // 用户根据订单号查找快递信息
    @Override
    public R checkShipment(String token){
        R r = new R();
        return r;
    }

    @Override
    public R trackingShipment(String shipmentCode){
        R r = new R();
        return  r;
    }

    @Override
    public R createShippingOrder(CreateShippingOrderParam createShippingOrderParam){
        R r = new R();
        return  r;
    }

    @Override
    public R cancelShippingOrder(CancelShippingOrderParam cancelShippingOrderParam){
        R r = new R();
        return  r;
    }

    @Override
    public R modifyShipment(ModefyShipmentParam modefyShipmentParam){
        R r = new R();
        return  r;
    }

}
