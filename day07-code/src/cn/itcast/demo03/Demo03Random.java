package cn.itcast.demo03;
//根据int变量n的值，获取随机数字【1，n】

import java.util.Random;

public class Demo03Random {
    public static void main(String[] args) {
        int num = 5;
        Random r = new Random();
        for (int i = 0; i < 100; i++) {
            //[1,11)就是[1,10]
            int result = r.nextInt(num) + 1;
            System.out.println(result);
        }

    }
}
