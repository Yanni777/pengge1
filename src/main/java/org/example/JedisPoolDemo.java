package org.example;

import org.example.Utils.JedisUtil;
import redis.clients.jedis.Jedis;

public class JedisPoolDemo {
    public static void main(String[] args) {
        Jedis jedis = JedisUtil.getJedis();
        jedis.set("food", "rice");
        System.out.println("jedis.get(\"food\") = " + jedis.get("food"));
        jedis.close();
    }
}
