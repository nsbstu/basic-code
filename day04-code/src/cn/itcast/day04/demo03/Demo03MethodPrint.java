package cn.itcast.day04.demo03;
/*
定义一个方法，打印指定次数的HelloWorld
 */
public class Demo03MethodPrint {
    public static void main(String[] args) {
        printCount(5);
    }
    public static void printCount(int num){
        for (int i = 0; i < num; i++){
            System.out.println("HelloWorld" + (i + 1));
        }
    }
}
