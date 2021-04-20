package cn.itcast.day06.demo04;
/*
当方法局部变量和成员变量一样时，就近原则，使用局部变量
如果需要访问本类中的成员变量需要使用格式
this.成员变量名

通过  谁调用的方法，谁就是this
 */
public class Person {
    String name;

    public void sayHello(String name){
        System.out.println(name + "，你好，我是" + this.name);
        System.out.println(this);
    }
}
