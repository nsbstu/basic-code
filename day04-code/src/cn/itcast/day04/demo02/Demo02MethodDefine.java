package cn.itcast.day04.demo02;

import jdk.swing.interop.SwingInterOpUtils;

public class Demo02MethodDefine {
    public static void main(String[] args) {
       //单独调用
        sum(10,20);
        System.out.println("=========");
        //打印调用
        System.out.println(sum(10,20));
        System.out.println("======");
        //赋值调用
        int number = sum(15,25);
        number += 100;
        System.out.println("变量的值:" + number);

    }
    public static int sum(int a,int b){
        System.out.println("方法执行");
       int result =  a + b;
        return result;
  }
}
