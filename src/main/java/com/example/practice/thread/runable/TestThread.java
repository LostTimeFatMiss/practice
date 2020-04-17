package com.example.practice.thread.runable;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author: Song Yimin
 * @description: 实现runable
 * @date: 2020/4/15
 */
public class TestThread implements Runnable {
    private static AtomicInteger count = new AtomicInteger(0);

    public static CountDownLatch countDownLatch = new CountDownLatch(20);

    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            count.incrementAndGet();
        }
        countDownLatch.countDown();
    }

    public static void main(String[] args) {
        TestThread testThread = new TestThread();

        for (int i = 0; i < 20; i++) {
            Thread thread = new Thread(testThread);
            thread.start();
        }
        try {
            countDownLatch.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(count.get());
    }
}
