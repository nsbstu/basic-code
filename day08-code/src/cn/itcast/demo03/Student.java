package cn.itcast.demo03;

public class Student {
    private int sid;
    private String name;
    private int age;
    static String address;
    public static int idCount = 0;//学号计数器,每当new新对象是idCount++；

    public Student() {
        this.sid = ++idCount;
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
        this.sid = ++idCount;
    }

    public int getSid() {
        return sid;
    }

    public void setSid(int sid) {
        this.sid = sid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
