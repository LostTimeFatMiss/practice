package com.example.practice.sjms.cjx.factory.simple;

/**
 * @author: Song Yimin
 * @description:
 * @date: 2020/4/16
 */
public class Factory {

    public static Car creat(String s) {

        if ("byd".equals(s)) {
            return new BYD();
        } else {
            return new BSJ();
        }
    }
}
