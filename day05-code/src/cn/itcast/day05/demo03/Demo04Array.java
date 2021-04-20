package cn.itcast.day05.demo03;
/*
遍历数组
 */
public class Demo04Array {
    public static void main(String[] args) {
        int [] array = {15,25,30,40,50,60,75};
        //原始方法
        System.out.println(array[0]);//15
        System.out.println(array[1]);//25
        System.out.println(array[2]);//30
        System.out.println(array[3]);//40
        System.out.println(array[4]);//50
        System.out.println(array[5]);//60
        System.out.println("===============");
        //使用循环
        for (int i = 0; i < 6; i++) {
            System.out.println(array[i]);
        }
        System.out.println("==============");
        int len = array.length;
        for (int i = 0; i < len; i++) {
            System.out.println(array[i]);
        }
        System.out.println("=======================");
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
