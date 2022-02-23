package com.example.design.builder;

import com.example.design.builder.method1.ConcreteBuilder;
import com.example.design.builder.method1.Director;
import com.example.design.builder.method1.Product;
import com.example.design.builder.method2.ProductB;
import com.example.design.builder.method2.ServiceBuilder;

/**
 * @author hongjiangming
 * @date 2022/2/22 4:34 下午
 * @copyright (C), 2011-2031, 上海聚音信息科技有限公司
 */
public class Test {
    public static void main(String[] args) {
        Director director = new Director();
        Product create = director.create(new ConcreteBuilder());
        System.out.println(create.toString());

        ProductB productB = new ServiceBuilder().
        bulidA("牛约煲")
        .bulidB("薯条")
        .bulidC("可乐")
        .bulidD("汉堡包").build();

        System.out.println(productB);
    }
}
