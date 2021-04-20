package cn.itcast.demo01;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.Scanner;
/*
int  nextInt();
String  next();
 */
public class Demo01Scanner {
    public static void main(String[] args) {
         //System.in 从键盘进行输入
        Scanner sc = new Scanner(System.in);

                int num = sc.nextInt();
        System.out.println("输入的数字是" + num);
        String str = sc.next();
        System.out.println("输入的字符串是" + str);
    }
}
