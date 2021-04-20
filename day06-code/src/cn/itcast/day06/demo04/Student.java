package cn.itcast.day06.demo04;
/*
构造方法
public 类名称（参数类型 参数名）{方法体}
方法名和类名同
不写返回值
不能return一个具体的返回值
如果没有编写构造方法，编辑器会默认赠送一个构造方法public Student(){}
一旦编写了一个构造方法，编译器不会赠送
构造方法可以重载
 */
public class Student {
    //成员变量
    private String name;
    private int age;
    //无参构造
    public Student(){
        System.out.println("无参构造方法执行了！！");
    }
//有参构造
    public Student(String name,int age){
        System.out.println("有参构造方法执行了！！");
        this.name = name;
        this.age = age;
    }
    //getter setter
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }

    public void setAge(int age){
        this.age = age;
    }
    public int getAge(){
        return age;
    }
}
