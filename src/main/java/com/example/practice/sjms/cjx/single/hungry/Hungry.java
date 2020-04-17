package com.example.practice.sjms.cjx.single.hungry;

import sun.security.jca.GetInstance;

/**
 * @author: Song Yimin
 * @description: 饿汉模式 线程安全
 * @date: 2020/4/16
 */
public class Hungry {

    private static Hungry hungry = new Hungry();

    public static Hungry getInstance() {
        return hungry;
    }

    /**
     * 构造器私有化, 不能通过Hungry hungry = new Hungry();的方式创建对象
     */
    private Hungry() {
    }

}
