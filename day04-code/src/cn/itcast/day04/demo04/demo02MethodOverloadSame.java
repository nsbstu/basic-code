package cn.itcast.day04.demo04;

/*
比较两个数据是否相等
参数类型为两个byte，两个short，两个int，两个long
 */
public class demo02MethodOverloadSame {
    public static void main(String[] args) {
        byte a = 10;
        byte b = 20;
        System.out.println(isSame(a, b));

        System.out.println(isSame((short)10,(short )20));

        System.out.println(isSame(11,12));

        System.out.println(isSame(10l,20l));
    }

    public static boolean isSame(byte a, byte b) {
        System.out.println("两个BYTE参数执行！！");
        boolean same;
        if (a == b) {
            same = true;
        } else {
            same = false;
        }
        return same;
    }

    public static boolean isSame(short a, short b) {
        System.out.println("两个SHORT参数执行！！");
        boolean same = a == b ? true : false;
        return same;
    }

    public static boolean isSame(int a, int b) {
        System.out.println("两个INT参数执行！！");
        return a == b;
    }

    public static boolean isSame(long a, long b) {
        System.out.println("两个LONG参数执行！！");
        if (a == b) {
            return true;
        } else {
            return false;
        }
    }
}
