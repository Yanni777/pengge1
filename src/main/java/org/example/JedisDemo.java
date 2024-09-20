package org.example;
import redis.clients.jedis.Jedis;

public class JedisDemo {
    public static void main(String[] args) {
        Jedis jedis = new Jedis("localhost",6379);
//        jedis.set("person","张三");
//        jedis.lpush("cities","珠海","深圳");
//        System.out.println("jedis.get(\"person\") = " + jedis.get("person"));
//        List<String> cities = jedis.lrange("cities", 0, -1);
//        System.out.println("cities = " + cities);
        jedis.del("person");
        System.out.println(jedis.get("person"));
        jedis.close();

    }
}
