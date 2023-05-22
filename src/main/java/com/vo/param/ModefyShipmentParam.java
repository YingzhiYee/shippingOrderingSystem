package com.vo.param;
import com.vo.param.object.ReceiverAfterModify;
import lombok.Getter;
/**
 * FileName: ModefyShipmentParam
 * Date: 2023/05/22
 * Description: 该类用于封装 用户根据订单id修改订单 请求提交的数据
 */
@Getter
public class ModefyShipmentParam {

    private ReceiverAfterModify receiverAfterModify;

    private String modifyAnOrderTime;

    public ModefyShipmentParam(ReceiverAfterModify receiverAfterModify,String modifyAnOrderTime){
        this.receiverAfterModify = receiverAfterModify;
        this.modifyAnOrderTime =modifyAnOrderTime;
    }

}
