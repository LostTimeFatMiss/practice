package com.example.practice.sjms.cjx.single.lazy;

/**
 * @author: Song Yimin
 * @description: 懒汉模式，线程不安全，需要加双重锁和volatile
 * @date: 2020/4/16
 */
public class Lazy {

    /**
     * 为什么加volatile，因为要禁止重拍，new 一个对象分为 分配内存，初始化默认值，返回内存地址，当优化排序的时候就变成了，分配内存，返回内存地址，初始化默认值
     */
    private static volatile Lazy lazy;

    /**
     * 构造器私有化, 不能通过Hungry hungry = new Hungry();的方式创建对象
     */
    private Lazy() {

    }

    public static Lazy getInstance() {
        if (lazy == null) {
            synchronized (Lazy.class) {
                if (lazy == null) {
                    lazy = new Lazy();
                }
            }
        }
        return lazy;
    }

}
