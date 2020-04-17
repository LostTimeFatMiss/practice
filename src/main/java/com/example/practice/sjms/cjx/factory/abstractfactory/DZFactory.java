package com.example.practice.sjms.cjx.factory.abstractfactory;

/**
 * @author: Song Yimin
 * @description:
 * @date: 2020/4/16
 */
public class DZFactory implements Factory {
    @Override
    public Car creat() {
        return new DZCar();
    }

    @Override
    public Airplane creatPlane() {
        return null;
    }
}
