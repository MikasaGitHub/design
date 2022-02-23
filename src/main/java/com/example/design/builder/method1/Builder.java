package com.example.design.builder.method1;

/**
 * @author hongjiangming
 * @date 2022/2/22 4:12 下午
 * @copyright (C), 2011-2031, 上海聚音信息科技有限公司
 */
public abstract class Builder {
    //地基
    abstract void bulidA();
    //钢筋工程
    abstract void bulidB();
    //铺电线
    abstract void bulidC();
    //粉刷
    abstract void bulidD();
    //完工-获取产品
    abstract Product getProduct();
}
