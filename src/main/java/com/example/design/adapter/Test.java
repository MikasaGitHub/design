package com.example.design.adapter;

/**
 * @author hongjiangming
 * @date 2022/2/22 6:24 下午
 * @copyright (C), 2011-2031, 上海聚音信息科技有限公司
 */
public class Test {

    public static void main(String[] args) {
        TurkeryAdapter turkeryAdapter = new TurkeryAdapter(new WildTurkery());
        turkeryAdapter.duckEat("正在吃");
        turkeryAdapter.duckFly("正在飞");
    }
}
