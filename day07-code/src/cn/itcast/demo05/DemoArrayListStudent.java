package src.cn.itcast.demo05;

import java.util.ArrayList;

/*
自定义4个学生对象,添加到集合,并遍历
 */
public class DemoArrayListStudent {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        Student one = new Student("洪七公", 20);
        Student two = new Student("欧阳锋", 22);
        Student three = new Student("黄药师", 22);
        Student four = new Student("段执行", 23);
        list.add(one);
        list.add(two);
        list.add(three);
        list.add(four);


        //遍历集合
        for (int i = 0; i < list.size(); i++) {
            Student stu = list.get(i);
            System.out.println("姓名：" + stu.getName() + "年龄" + stu.getAge());
        }

    }
}
