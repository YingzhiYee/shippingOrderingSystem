package com.vo.param;
import lombok.Getter;
/**
 * FileName: PayShippingFeeParam
 * Date: 2023/05/22
 * Description: 该类用于封装 支付运费 请求提交的数据
 */
@Getter
public class PayShippingFeeParam {
    private String token;

    private String timeStamp;

    private String shippingFee;

    public PayShippingFeeParam(String token,String timeStamp,String shippingFee){
        this.token = token;
        this.timeStamp = timeStamp;
        this.shippingFee = shippingFee;
    }
}
