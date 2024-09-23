package org.example.Utils;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;

public class Threads {

    public static void shutdownAndAwaitTermination(ExecutorService pool) {
        pool.shutdown(); // 启动有序的关闭过程
        try {
            // 等待一段时间以让现有任务终止
            if (!pool.awaitTermination(60, TimeUnit.SECONDS)) {
                pool.shutdownNow(); // 取消当前正在执行的任务
                // 等待一段时间以让任务响应被取消
                if (!pool.awaitTermination(60, TimeUnit.SECONDS)) {
                    System.err.println("线程池没有正常终止");
                }
            }
        } catch (InterruptedException ie) {
            // 如果当前线程也被中断，则重新取消
            pool.shutdownNow();
            // 保留中断状态
            Thread.currentThread().interrupt();
        }
    }
}
