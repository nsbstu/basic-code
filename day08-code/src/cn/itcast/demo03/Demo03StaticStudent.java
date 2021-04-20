package cn.itcast.demo03;

public class Demo03StaticStudent {
    public static void main(String[] args) {
        Student.address = " 101教室";
        Student stu1 = new Student("郭靖", 19);
        System.out.println("姓名：" + stu1.getName());
        System.out.println("年龄：" + stu1.getAge());
        System.out.println("教室：" + Student.address);
        System.out.println("==========");
        Student stu2 = new Student("黄蓉", 29);
        System.out.println("姓名：" + stu2.getName());
        System.out.println("年龄：" + stu2.getAge());
        System.out.println("教室：" + Student.address);

    }
}
