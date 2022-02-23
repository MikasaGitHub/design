package com.example.design.observe;

/**
 * @author hongjiangming
 * @date 2022/2/22 6:10 下午
 * @copyright (C), 2011-2031, 上海聚音信息科技有限公司
 */
public class Test {
    public static void main(String[] args) {
        SchoolObservable schoolObservable = new SchoolObservable();

        schoolObservable.registerReceiver(new StudentA());
        schoolObservable.registerReceiver(new StudentB());

        // 被观察者发布消息
        schoolObservable.sendMessage("大家都来吃饭");
    }
}
