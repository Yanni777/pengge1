package org.example.Utils;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;

import java.util.ResourceBundle;

public class JedisUtil {
    private static JedisPool jedisPool;
    static {
        //得到资源绑定对象
        ResourceBundle bundle = ResourceBundle.getBundle("jedis");
        JedisPoolConfig config = new JedisPoolConfig();
//        config.setMaxIdle(Integer.parseInt(bundle.getString("jedisPool.maxIdle")));
        config.setMaxTotal(Integer.parseInt(bundle.getString("maxTotal")));
        config.setMaxWaitMillis(Integer.parseInt(bundle.getString("maxWaitMillis")));
//        config.setTestOnBorrow(true);
//        config.setTestOnReturn(true);
//        config.setTestWhileIdle(true);
        jedisPool=new JedisPool(config,bundle.getString("host"),Integer.parseInt(bundle.getString("port")));
    }
    public static Jedis getJedis(){
        return jedisPool.getResource();
    }

}
