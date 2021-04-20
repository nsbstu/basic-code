package src.cn.itcast.demo01;

import java.util.Scanner;

/*
键盘输入两个数字，求和
 */
public class Demo02ScannerSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int result = a + b;
        System.out.println("结果是" + result);
    }
}
