package com.vo.param;
import com.vo.param.object.Item;
import com.vo.param.object.Receiver;
import com.vo.param.object.Sender;
import lombok.Getter;
/**
 * FileName: CreateShippingOrderParam
 * Date: 2023/05/22
 * Description: 该类用于封装 用户寄件 请求提交的数据
 */
@Getter
public class CreateShippingOrderParam {

    private Sender sender;

    private Receiver receiver;

    private Item item;

    private String placeAnOrderTime;

    private String chooseCourier;

    private String expectedTime;

    private String paymentMethod;

    private String estimatedCost;

    public CreateShippingOrderParam(Sender sender,Receiver receiver,Item item,String placeAnOrderTime,
                              String chooseCourier,String expectedTime,String paymentMethod,String estimatedCost){
        this.sender = sender;
        this.receiver = receiver;
        this.item = item;
        this.placeAnOrderTime = placeAnOrderTime;
        this.chooseCourier = chooseCourier;
        this.expectedTime = expectedTime;
        this.paymentMethod = paymentMethod;
        this.estimatedCost = estimatedCost;
    }



}
