package com.example.practice.sjms.cjx.factory.abstractfactory;

/**
 * @author: Song Yimin
 * @description:
 * @date: 2020/4/16
 */
public class Main {
    public static void main(String[] args) {
        Factory factory = new BSJFactory();
        Car creat = factory.creat();
        creat.run();


        Factory factory1 = new BYDFactory();
        Airplane airplane = factory1.creatPlane();
        airplane.fly();


        Factory factory2 = new DZFactory();
        Car creat1 = factory2.creat();
        creat1.run();
    }
}
