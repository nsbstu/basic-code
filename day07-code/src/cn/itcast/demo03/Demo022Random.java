package cn.itcast.demo03;

import java.util.Random;

public class Demo022Random {
    public static void main(String[] args) {
        Random r = new Random();
        for (int i = 0; i < 100; i++) {
            int num = r.nextInt(10);//[0,10)
            System.out.println(num);
        }
    }
}
