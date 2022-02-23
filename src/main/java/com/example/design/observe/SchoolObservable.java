package com.example.design.observe;

import java.util.ArrayList;
import java.util.List;

/**
 * @author hongjiangming
 * @date 2022/2/22 6:00 下午
 * @copyright (C), 2011-2031, 上海聚音信息科技有限公司
 */
public class SchoolObservable extends Observable{

    //用来存储观察者
    private final List<Observer> observers = new ArrayList<>();

    @Override
    public void sendMessage(String message) {
        System.out.println("学校发出通知："+message);
        observers.forEach(observer -> {
            observer.receive(message);
        });
    }

    //绑定观察者（可以移动到抽象被观察者中）
    public void registerReceiver(Observer observer) {
        observers.add(observer);
    }

    //解绑观察者（可以移动到抽象被观察者中）
    public void unRegisterReceiver(Observer observer) {
        if(observers.contains(observer)) {
            observers.remove(observer);
        }
    }
}
