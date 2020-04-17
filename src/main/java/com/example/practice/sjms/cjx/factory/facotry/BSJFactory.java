package com.example.practice.sjms.cjx.factory.facotry;

/**
 * @author: Song Yimin
 * @description:
 * @date: 2020/4/16
 */
public class BSJFactory implements Factory {
    @Override
    public Car creat() {
        return new BSJ();
    }
}
