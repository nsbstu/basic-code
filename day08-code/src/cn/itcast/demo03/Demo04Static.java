package cn.itcast.demo03;
/*
静态代码块只有在使用类是使用唯一一次‘
静态内容优先于一切非静态内容
静态代码块用来一次性的对静态成员变量进行赋值
 */
public class Demo04Static {
    public static void main(String[] args) {
        Person one = new Person();
        Person two = new Person();
    }
}
