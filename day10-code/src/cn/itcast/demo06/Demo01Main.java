package cn.itcast.demo06;

import java.util.concurrent.Callable;

/*
对象一旦向上转型，就不能调用子类特有的方法
可以通过向下转型实现，（还原）
 */
public class Demo01Main {
    public static void main(String[] args) {
        //对象的向上转型是安全的
        //父类引用指向子类对象
        Animal animal = new Cat();//创建的是猫
        animal.eat();
        //animal.catchMouse();错误

        //向下转型
       Cat cat = (Cat) animal;//创建的猫，还原必须是猫
       cat.catchMouse();
        //错误的向下转型ClassCastException
       Dog dog = (Dog) animal;//编译不会报错，运行会异常
    }
}
