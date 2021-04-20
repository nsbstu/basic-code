package cn.itcast.demo04;

import java.util.Arrays;

/*
Arrays.toString（数组）顺序输出数组
Arrays.sort（数组）升序数组由小到大
1.int 按数字由小到大
2.String 按照字母由小到大。中文按照字有小到大
3.自定义类的对象需要在自定义类中写Comparable/Comparator的接口支持
 */
public class Demo01Arrays {
    public static void main(String[] args) {
        int[] intArray = {1,2,3};
        String str1 = Arrays.toString(intArray);
        System.out.println(str1);
        System.out.println("==========");
        int[] array1 = {1,5,2,7,23,4};
        Arrays.sort(array1);
        System.out.println(Arrays.toString(array1));
        System.out.println("===========");

        String[] str2 = {"aaa","ccc","bbb"};
        Arrays.sort(str2);
        System.out.println(Arrays.toString(str2));
    }
}
