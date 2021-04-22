package com.gjy.threadpool;

import java.util.concurrent.*;

public class ThreadPoolUserTest1 {

    public static void main(String[] args) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(2,10,3,TimeUnit.SECONDS,
                new LinkedBlockingQueue<>(10),Executors.defaultThreadFactory(),
                new ThreadPoolExecutor.AbortPolicy());
        for (int i = 0; i < 222; i++) {
            threadPoolExecutor.execute(()->{
                System.out.println(Thread.currentThread().getName());
            });
        }
        threadPoolExecutor.shutdown();
    }

    private static void scheduled() {
        ScheduledExecutorService pool = Executors.newScheduledThreadPool(3);
        for (int i = 0; i < 10; i++) {
            pool.schedule(()->{
                System.out.println(Thread.currentThread().getName());
                try {
                    TimeUnit.SECONDS.sleep(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            },1,TimeUnit.SECONDS);
        }
        pool.shutdown();
    }

    private static void cached(ExecutorService executorService) {
        ExecutorService pool = executorService;
        for (int i = 0; i < 10; i++) {
            pool.execute(() -> {
                System.out.println(Thread.currentThread().getName());
                try {
                    TimeUnit.SECONDS.sleep(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            });
        }
        pool.shutdown();
    }

    private static void fiexd() {
        cached(Executors.newFixedThreadPool(2));
    }
}
