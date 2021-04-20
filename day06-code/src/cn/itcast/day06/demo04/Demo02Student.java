package cn.itcast.day06.demo04;

public class Demo02Student {
    public static void main(String[] args) {
        Student student1 = new Student();
        System.out.println("==========");
        Student student2 = new Student("赵丽颖", 20);
        System.out.println("姓名：" + student2.getName() + "  年龄：" + student2.getAge());
        student2.setAge(21);
        System.out.println("姓名：" + student2.getName() + "  年龄：" + student2.getAge());
    }


}
