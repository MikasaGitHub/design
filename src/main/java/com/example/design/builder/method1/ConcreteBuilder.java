package com.example.design.builder.method1;

/**
 * @author hongjiangming
 * @date 2022/2/22 4:13 下午
 * @copyright (C), 2011-2031, 上海聚音信息科技有限公司
 */
public class ConcreteBuilder extends Builder{

    private Product product;

    public ConcreteBuilder() {
        product = new Product();
    }
    @Override
    void bulidA() {
        product.setBuildA("地基");
    }
    @Override
    void bulidB() {
        product.setBuildB("钢筋工程");
    }
    @Override
    void bulidC() {
        product.setBuildC("铺电线");
    }
    @Override
    void bulidD() {
        product.setBuildD("粉刷");
    }
    @Override
    Product getProduct() {
        return product;
    }
}
