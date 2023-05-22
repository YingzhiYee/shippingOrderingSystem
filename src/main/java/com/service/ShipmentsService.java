package com.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.entity.Shipments;
import com.entity.User;
import com.vo.R;
import com.vo.param.*;

public interface ShipmentsService extends IService<Shipments> {
    /**
     * 1.用户根据订单号查找快递信息
     * @get
     * @return
     */
    R checkShipment(String token);

    /**
     * 2. 用户根据订单id追踪订单
     * @get
     */

    R trackingShipment(String shipmentCode);

    /**
     * 3. 用户寄件
     * @post
     */
    R createShippingOrder(CreateShippingOrderParam createShippingOrderParam);

    /**
     * 4.用户取消寄件
     * @del
     */
    R cancelShippingOrder(CancelShippingOrderParam cancelShippingOrderParam);

    /**
     * 5.用户根据订单id修改订单
     * @put
     */
    R modifyShipment(ModefyShipmentParam modefyShipmentParam);

}