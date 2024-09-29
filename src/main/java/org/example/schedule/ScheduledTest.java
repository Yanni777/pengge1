package org.example.schedule;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class ScheduledTest {
    @Scheduled(cron = "0/5 * * * * *")
    public void test() {
        System.out.println("schedule测试。。。。");
    }
}
