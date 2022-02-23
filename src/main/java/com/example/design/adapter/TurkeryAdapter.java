package com.example.design.adapter;

/**
 * @author hongjiangming
 * @date 2022/2/22 6:20 下午
 * @copyright (C), 2011-2031, 上海聚音信息科技有限公司
 */
public class TurkeryAdapter implements Duck{

    private final Turkey turkey;

    public TurkeryAdapter(Turkey turkey) {
        this.turkey = turkey;
    }

    @Override
    public void duckEat(String message) {
        turkey.eatMore(message);
    }

    @Override
    public void duckFly(String message) {
        for (int i = 0; i< 10; i++) {
            turkey.flyMore("fly");
        }
    }
}
