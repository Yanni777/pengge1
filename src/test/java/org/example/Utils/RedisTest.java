package org.example.Utils;

import org.example.domain.Device;
import org.example.mapper.NewsUserMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Map;

/**
 * @author hp
 * @date 2024/10/14
 * @Description
 */
@SpringBootTest
public class RedisTest {

    @Autowired
    private RedisUtils redisUtils;
    @Autowired
    private NewsUserMapper newsUserMapper;
    @Test
    public void test() {

//        redisUtils.hPut("aHash","Lily","12");
//        redisUtils.hPut("aHash","Melody","13");
//        System.out.println(redisUtils.hGet("aHash", "Lily"));

//        redisUtils.set("test1", );
//        redisUtils.get("test1");

//        NewsUser user1=newsUserMapper.selectById(1);
//        NewsUser user2=newsUserMapper.selectById(2);
//        redisUtils.hPut("user", "user1", user1);
//        redisUtils.hPut("user", "user2", user2);
//        Map<Object, Object> userMap = redisUtils.hGetAll("user");
//        userMap.forEach((k,v)->{
//            System.out.println(k);
//            System.out.println(v);
//        });


        //复杂类序列化与反序列化测试
        Device device = new Device();
        device.setId(1);
        device.setPoint(new Device.Point(1,"巴拉巴啊"));

        redisUtils.set("device", device);
        Device device1 = (Device) redisUtils.get("device");
        System.out.println(device1);

        redisUtils.hPut("device","device1", device);
        Map<Object, Object> deviceMap = redisUtils.hGetAll("device");
        deviceMap.forEach((k,v)->{
            System.out.println(k);
            System.out.println(v);
        });

    }
}
