package org.example.domain;

import lombok.Data;

/**
 * @author hp
 * @date 2024/10/14
 * @Description
 */
@Data
public class Device {
    private int id;
    private Point point;
    @Data
    public static class Point{
        int pid;
        String name;

        public Point(int i, String name) {
            this.pid = i;
            this.name = name;
        }
        public Point(){}
    }

}
