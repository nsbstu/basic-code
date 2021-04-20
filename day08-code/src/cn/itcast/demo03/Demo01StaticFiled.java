package cn.itcast.demo03;
//当 static 修饰成员变量时，该变量称为类变量。该类的每个对象都共享同一个类变量的值。
//idCount使用this.id= ++idCount;不用对id赋值就会按顺序自动生成，只要new就会加1
public class Demo01StaticFiled {
    public static void main(String[] args) {
        Student stu1 = new Student("郭靖",19);
        stu1.address = "101";
        System.out.println("姓名：" + stu1.getName() + ",学号" + stu1.getSid() +
                ",年龄：" + stu1.getName() +
                ",教室：" + stu1.address);
        Student stu2 = new Student("黄蓉",14);
        System.out.println("姓名：" + stu2.getName() + ",学号" + stu2.getSid() +
                ",年龄：" + stu2.getName() +
                ",教室：" + stu2.address);


    }
}
