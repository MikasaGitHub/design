package com.example.design.builder.method2;

/**
 * @author hongjiangming
 * @date 2022/2/22 4:38 下午
 * @copyright (C), 2011-2031, 上海聚音信息科技有限公司
 */
public abstract class BuilderB {
    //汉堡
    public abstract BuilderB bulidA(String mes);
    //饮料
    public abstract BuilderB bulidB(String mes);
    //薯条
    public abstract BuilderB bulidC(String mes);
    //甜品
    public abstract BuilderB bulidD(String mes);
    //获取套餐
    public abstract ProductB build();
}
