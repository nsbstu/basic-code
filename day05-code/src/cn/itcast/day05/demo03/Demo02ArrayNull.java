package cn.itcast.day05.demo03;
/*
所有的引用类型变量都可以赋值null
 */
public class Demo02ArrayNull {
    public static void main(String[] args) {
        int[] array = null;
//        array = new int[3];
        System.out.println(array[0]);//NullPointerException
    }
}
