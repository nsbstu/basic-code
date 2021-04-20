package cn.itcast.demo01;

import java.util.Scanner;

/*
键盘输入三个字，求出最大值
 */
public class Demo03ScannerMax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一个数字");
        int a = sc.nextInt();
        System.out.println("请输入第二个数字");
        int b = sc.nextInt();
        System.out.println("请输入第三个数字");
        int c = sc.nextInt();
        int max = a;
        if (max < b) {
            max = b;
        } else {
            max = max;
        }
        if (max < c) {
            max = c;
        } else {
            max = max;
        }
        System.out.println("最大值是：" + max);
    }
}
