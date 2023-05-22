package com.vo.param.object;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

/**
 * FileName: Item
 * Date: 2023/05/22
 * Description: 该类用作 封装item 的类
 */

@Getter
@Setter
public class Item {
    private String type;
    private String weight;
    private Boolean insuranceOrNot;
    private String notes; //备注，例如缺文件袋，请带胶带，请带面带等

    public Item(String type,String weight,Boolean insuranceOrNot,String notes){
        this.type = type;
        this.weight = weight;
        this.insuranceOrNot = insuranceOrNot;
        this.notes = notes;
    }

}
