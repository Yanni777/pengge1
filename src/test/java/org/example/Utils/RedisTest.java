package org.example.Utils;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @author hp
 * @date 2024/10/14
 * @Description
 */
@SpringBootTest
public class RedisTest {



    @Autowired
    private RedisUtils redisUtils;
    @Test
    public void test() {


        redisUtils.hPut("aHash","Lily","12");
        redisUtils.hPut("aHash","Melody","13");
        System.out.println(redisUtils.hGet("aHash", "Lily"));
    }
}
