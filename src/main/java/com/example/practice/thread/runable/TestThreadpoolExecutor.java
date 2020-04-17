package com.example.practice.thread.runable;

import java.util.Queue;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * @author: Song Yimin
 * @description:
 * @date: 2020/4/15
 */
public class TestThreadpoolExecutor implements Runnable {

    private static CountDownLatch countDownLatch = new CountDownLatch(10);

    @Override
    public void run() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("通过ThreadpoolExecutor创建线程池");
        countDownLatch.countDown();
    }


    public static void main(String[] args) throws InterruptedException {

        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(10, 50, 6000, TimeUnit.MILLISECONDS, new LinkedBlockingQueue<Runnable>(60));
        //计数器

        for (int i = 0; i < 20; i++) {
            threadPoolExecutor.execute(new TestThreadpoolExecutor());
        }
        countDownLatch.await();
    }
}
