package com.vo.param;
import lombok.Getter;
/**
 * FileName: CancelShippingOrderParam
 * Date: 2023/05/22
 * Description: 该类用于封装 用户取消寄件 请求提交的数据
 */
@Getter
public class CancelShippingOrderParam {
    private String shipmentCode;
    private String cancellationReason;

    public CancelShippingOrderParam(String shipmentCode,String cancellationReason){
        this.shipmentCode = shipmentCode;
        this.cancellationReason = cancellationReason;
    }
}
