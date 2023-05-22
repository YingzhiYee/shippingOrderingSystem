package com.vo.param.object;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

/**
 * FileName: ReceiverAfterModify
 * Date: 2023/05/22
 * Description: 该类用作 封装ReceiverAfterModify 的类
 */

@Getter
@Setter
public class ReceiverAfterModify {
    private String receiverName;
    private String receiverPhone;
    private String receiverProvince;
    private String receiverDetailAddress;

    public ReceiverAfterModify(String receiverName,String receiverPhone,String receiverProvince,String receiverDetailAddress){
        this.receiverName = receiverName;
        this.receiverPhone = receiverPhone;
        this.receiverProvince = receiverProvince;
        this.receiverDetailAddress = receiverDetailAddress;
    }

}
