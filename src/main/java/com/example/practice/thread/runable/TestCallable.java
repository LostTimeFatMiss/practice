package com.example.practice.thread.runable;

import javax.security.auth.callback.Callback;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

/**
 * @author: Song Yimin
 * @description:
 * @date: 2020/4/15
 */
public class TestCallable implements Callable {

    @Override
    public Object call() throws Exception {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("callable");
        return "callable-result";
    }

    public static void main(String[] args) {
        ExecutorService threadPool = Executors.newFixedThreadPool(10);
        List<Future> list = new ArrayList<Future>();
        for (int i = 0; i < 10; i++) {
            Future submit = threadPool.submit(new TestCallable());
            //为什么要这样加，是因为如果每次都直接future.get()，多线程就变成了单线程
            list.add(submit);

        }

        for (Future future : list) {
            try {
                System.out.println(future.get());
            } catch (InterruptedException e) {
                e.printStackTrace();
            } catch (ExecutionException e) {
                e.printStackTrace();
            }
        }
    }
}
