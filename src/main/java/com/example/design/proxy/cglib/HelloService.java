package com.example.design.proxy.cglib;

/**
 * @author hongjiangming
 * @date 2022/2/21 4:51 下午
 * @copyright (C), 2011-2031, 上海聚音信息科技有限公司
 */
public class HelloService {

    public HelloService() {
        System.out.println("HelloService构造方法");
    }

    /**
     * 该方法不能被子类覆盖,Cglib是无法代理final修饰的方法的
     */
    final public String sayOthers(String name) {
        System.out.println("HelloService:sayOthers>>"+name);
        return null;
    }

    public void sayHello() {
        System.out.println("HelloService:sayHello");
    }

}
