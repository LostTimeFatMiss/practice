package com.example.practice.sjms.cjx.factory.facotry;

/**
 * @author: Song Yimin
 * @description:
 * @date: 2020/4/16
 */
public class BYDFactory implements Factory {
    @Override
    public Car creat() {
        return new BYD();
    }
}
