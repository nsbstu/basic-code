package cn.itcast.demo03;

public class MyClass {

    int num;
    static  int numStatic;
    public void method(){
        System.out.println("这是成员方法");
        //成员方法可以访问成员变量和静态变量
        System.out.println(num);
        System.out.println(numStatic);
    }
    public static void methodStatic(){
        System.out.println("这是静态方法");
        //静态方法只可以静态变量
        //System.out.println(num);
        System.out.println(numStatic);
    }
}
