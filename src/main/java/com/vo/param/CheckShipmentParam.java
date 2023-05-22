package com.vo.param;
import lombok.Getter;
/**
 * FileName: CheckShipmentParam
 * Date: 2023/05/22
 * Description: 该类用于封装 根据订单号查找快递信息 请求提交的数据
 */
@Getter
public class CheckShipmentParam {

    private String carrier; // 订单号


    public CheckShipmentParam(String carrier){
        this.carrier = carrier;
    }

}
