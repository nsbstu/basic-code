package cn.itcast.demo01;
/*
对于成员变量，如果使用final这个变量照样不可变
1；成员变量有默认值，所以用了final之后必须手动赋值，不会再给默认值
 2:对于final的成员变量 （二选一） 要么直接赋值，要么使用构造方法赋值
 3:必须保证所有的重载的构造方法最终都会对final修饰的成员变量赋值
 */
public class Person {
    private final String name ;

    public Person() {
        name = "关晓彤";
    }

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    /*public void setName(String name) {
        this.name = name;
    }*/
}
