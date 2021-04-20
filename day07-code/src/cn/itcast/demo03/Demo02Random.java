package cn.itcast.demo03;

import org.w3c.dom.ls.LSOutput;

import java.util.Random;

/*
Random类用来生成随机数
无参：int所有范围，有正有负
有参int num = r.nextInt(3) ,[0,3),也就是0~2
 */
public class Demo02Random {
    public static void main(String[] args) {
        Random r = new Random();

        int num = r.nextInt();//整个int,有正数负数
        System.out.println("随机数是：" + num);
        System.out.println("=======");
    }

}
