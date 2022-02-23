package com.example.design.adapter;

/**
 * @author hongjiangming
 * @date 2022/2/23 1:29 下午
 * @copyright (C), 2011-2031, 上海聚音信息科技有限公司
 */
public class WildTurkery implements Turkey{

    @Override
    public void eatMore(String message) {
        System.out.println("WildTurkery eatMore" + message);
    }

    @Override
    public void flyMore(String message) {
        System.out.println("WildTurkery flyMore" + message);
    }

}
