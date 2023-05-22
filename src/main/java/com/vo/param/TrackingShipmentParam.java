package com.vo.param;
import lombok.Getter;

/**
 * FileName: TrackingShipmentParam
 * Date: 2023/05/22
 * Description: 该类用于封装根据订单id追踪订单表单提交的数据
 */
@Getter
public class TrackingShipmentParam {
    private String shipmentCode;

    public TrackingShipmentParam(String shipmentCode){
        this.shipmentCode = shipmentCode;
    }


}
