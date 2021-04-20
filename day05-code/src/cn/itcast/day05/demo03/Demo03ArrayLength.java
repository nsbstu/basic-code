package cn.itcast.day05.demo03;

import org.w3c.dom.ls.LSOutput;

public class Demo03ArrayLength {
    public static void main(String[] args) {
        int[] arrayA = new int[3];
        int[] arrayB = {10,20,25,2,3,5,1,5,};
        int len = arrayB.length;
        System.out.println("arrayB数组的长度：" + len);
        System.out.println("=============");

        int[] arrayC = new int[3];
        System.out.println(arrayC.length);//3
        arrayC = new int[5];
        System.out.println(arrayC.length);//5
    }

}
