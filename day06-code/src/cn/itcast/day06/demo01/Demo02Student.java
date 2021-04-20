package cn.itcast.day06.demo01;

/*
导包；import  包名 类名
import cn.itcast.day06.demo01.Student
同一个包可以省略导包语句
创建；类名 对象名 = new 类名（）；
使用；1：使用成员变量 对象名.成员变量名
2：使用成员方法 对象名.成员方法名
 */
public class Demo02Student {
    public static void main(String[] args) {
        Student stu = new Student();//创建对象
        //使用
        System.out.println(stu.name);//null
        System.out.println(stu.age);//0
        System.out.println("========");

        //将右侧的字符串赋值给Stu对象的name成员变量
        stu.name = "赵丽颖";
        stu.age = 18;
        System.out.println(stu.name);//赵丽颖
        System.out.println(stu.age);//18
        System.out.println("========");

        //使用成员方法
        stu.eat();
        stu.sleep();
        stu.study();
    }
}
