package cn.itcast.demo11;

import java.util.concurrent.Callable;

//抽象方法不能直接new创建对象
//必须用子类继承抽象父类
//子类必须覆盖抽象父类中的所有抽象方法，去掉abstract关键字，补上大括号
//创建子类对象使用
public class DemoMain {
    public static void main(String[] args) {
        //Animal animal = new Animal();
        Cat cat = new Cat();
        cat.method();
        cat.normalMethod();



    }
}
