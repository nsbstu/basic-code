package cn.itcast.day05.demo01;

public class Demo05ArrayUse {
    public static void main(String[] args) {
        int [] array = new int[3];
        System.out.println(array);//[I@16b98e56
        System.out.println(array[0]);//0
        System.out.println(array[1]);//0
        System.out.println(array[2]);//0
        System.out.println("==============");
        array[1] = 121;
        System.out.println(array[0]);//0
        System.out.println(array[1]);//121
        System.out.println(array[2]);//0
    }
}



