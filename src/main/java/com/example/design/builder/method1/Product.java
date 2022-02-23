package com.example.design.builder.method1;

import lombok.Getter;
import lombok.Setter;

/**
 * @author hongjiangming
 * @date 2022/2/22 4:13 下午
 * @copyright (C), 2011-2031, 上海聚音信息科技有限公司
 */
@Getter
@Setter
public class Product {
    private String buildA;
    private String buildB;
    private String buildC;
    private String buildD;
    @Override
    public String toString() {
        return buildA+"\n"+buildB+"\n"+buildC+"\n"+buildD+"\n"+"房子验收完成";
    }
}
