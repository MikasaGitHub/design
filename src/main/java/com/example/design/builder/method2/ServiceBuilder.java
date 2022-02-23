package com.example.design.builder.method2;

import lombok.Getter;
import lombok.Setter;

/**
 * @author hongjiangming
 * @date 2022/2/22 4:40 下午
 * @copyright (C), 2011-2031, 上海聚音信息科技有限公司
 */
@Getter
@Setter
public class ServiceBuilder extends BuilderB{

    private ProductB productB;

    public ServiceBuilder() {
        productB = new ProductB();
    }

    @Override
    public BuilderB bulidA(String mes) {
        productB.setBuildA(mes);
        return this;
    }

    @Override
    public BuilderB bulidB(String mes) {
        productB.setBuildB(mes);
        return this;
    }

    @Override
    public BuilderB bulidC(String mes) {
        productB.setBuildC(mes);
        return this;
    }

    @Override
    public BuilderB bulidD(String mes) {
        productB.setBuildD(mes);
        return this;
    }

    @Override
    public ProductB build() {
        return productB;
    }
}
