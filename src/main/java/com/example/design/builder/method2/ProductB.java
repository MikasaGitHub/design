package com.example.design.builder.method2;

import lombok.Getter;
import lombok.Setter;

/**
 * @author hongjiangming
 * @date 2022/2/22 4:39 下午
 * @copyright (C), 2011-2031, 上海聚音信息科技有限公司
 */
@Getter
@Setter
public class ProductB {
    private String buildA="汉堡";
    private String buildB="饮料";
    private String buildC="薯条";
    private String buildD="甜品";
    public String getBuildA() {
        return buildA;
    }
    @Override
    public String toString() {
        return buildA+"\n"+buildB+"\n"+buildC+"\n"+buildD+"\n"+"组成套餐";
    }
}
