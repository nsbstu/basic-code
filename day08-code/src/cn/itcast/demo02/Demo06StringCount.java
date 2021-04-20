package cn.itcast.demo02;

import java.util.Scanner;

public class Demo06StringCount {
    public static void main(String[] args) {
        //键盘录入一个字符串数据
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串数据：");
        String s = sc.nextLine();
        //定义三个统计变量，初始化值都是0
        int bigCount = 0;
        int smallCount = 0;
        int numberCount = 0;
        int otherCount = 0;
        //遍历字符串，得到每一个字符
        for (int x = 0; x < s.length(); x++) {
            char ch = s.charAt(x);
        //拿字符进行判断
            if (ch >= 'A' && ch <= 'Z') {
                bigCount++;
            } else if (ch >= 'a' && ch <= 'z') {
                smallCount++;
            } else if (ch >= '0' && ch <= '9') {
                numberCount++;
            } else {
                otherCount++;
            }
        }
//输出结果
        System.out.println("大写字符：" + bigCount + "个");
        System.out.println("小写字符：" + smallCount + "个");
        System.out.println("数字字符：" + numberCount + "个");
        System.out.println("其他字符：" + otherCount + "个");
    }
}


