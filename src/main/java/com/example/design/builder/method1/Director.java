package com.example.design.builder.method1;

import lombok.Getter;
import lombok.Setter;

/**
 * @author hongjiangming
 * @date 2022/2/22 4:34 下午
 * @copyright (C), 2011-2031, 上海聚音信息科技有限公司
 */
@Getter
@Setter
public class Director {
    //指挥工人按顺序造房
    public Product create(Builder builder) {
        builder.bulidA();
        builder.bulidB();
        builder.bulidC();
        builder.bulidD();
        return builder.getProduct();
    }
}
