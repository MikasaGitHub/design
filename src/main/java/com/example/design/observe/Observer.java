package com.example.design.observe;

/**
 * @author hongjiangming
 * @date 2022/2/22 6:02 下午
 * @copyright (C), 2011-2031, 上海聚音信息科技有限公司
 */
public abstract class Observer {

    /**
     * 收到消息
     * @param message
     */
    public abstract void receive(String message);

}
