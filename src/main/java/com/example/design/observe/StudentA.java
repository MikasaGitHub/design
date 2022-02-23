package com.example.design.observe;

/**
 * @author hongjiangming
 * @date 2022/2/22 6:05 下午
 * @copyright (C), 2011-2031, 上海聚音信息科技有限公司
 */
public class StudentA extends Observer{

    @Override
    public void receive(String message) {
        System.out.println("学生A收到消息" + message);
    }
}
