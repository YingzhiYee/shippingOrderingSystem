package com.vo.param;
import lombok.Getter;
/**
 * FileName: GetShippingFeeParam
 * Date: 2023/05/22
 * Description: 该类用于封装 获取支付运费 请求提交的数据
 */
@Getter
public class GetShippingFeeParam {
    private String shipmentCode;

    private String token;

    public GetShippingFeeParam(String shipmentCode,String token){
        this.shipmentCode = shipmentCode;
        this.token = token;
    }
}

