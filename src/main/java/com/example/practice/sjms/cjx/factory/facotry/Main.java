package com.example.practice.sjms.cjx.factory.facotry;

/**
 * @author: Song Yimin
 * @description:
 * @date: 2020/4/16
 */
public class Main {
    public static void main(String[] args) {

        Car creat = new BSJFactory().creat();
        Car creat1 = new BYDFactory().creat();

        creat.run();
        creat1.run();
    }
}
