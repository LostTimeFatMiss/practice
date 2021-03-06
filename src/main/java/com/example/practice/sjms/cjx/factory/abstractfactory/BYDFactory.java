package com.example.practice.sjms.cjx.factory.abstractfactory;

/**
 * @author: Song Yimin
 * @description:
 * @date: 2020/4/16
 */
public class BYDFactory implements Factory {
    @Override
    public Car creat() {
        return new BYDCar();
    }

    @Override
    public Airplane creatPlane() {
        return new BYDPlane();
    }
}
