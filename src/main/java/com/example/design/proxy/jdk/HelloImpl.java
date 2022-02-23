package com.example.design.proxy.jdk;

/**
 * @author hongjiangming
 * @date 2022/2/21 4:30 下午
 * @copyright (C), 2011-2031, 上海聚音信息科技有限公司
 */
public class HelloImpl implements IHello {

    @Override
    public void sayHello() {
        System.out.println("Hello world!");
    }
}
