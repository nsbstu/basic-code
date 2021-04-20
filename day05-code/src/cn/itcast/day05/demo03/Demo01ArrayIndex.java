package cn.itcast.day05.demo03;
/*
索引越界异常
 */
public class Demo01ArrayIndex {
    public static void main(String[] args) {
        int [] array = {15,25,35};
        System.out.println(array[0]);//15
        System.out.println(array[1]);//25
        System.out.println(array[2]);//35
        System.out.println(array[3]);//ArrayIndexOutOfBoundsException
    }
}
