package cn.itcast.demo01;

/*
继承：子类是一个父类，也就是说子类可以当做父类看待is-a关系
 */
public class Demo01Extends {
    public static void main(String[] args) {
        Teacher teacher = new Teacher();
        teacher.method();

        Assistant assistant = new Assistant();
        assistant.method();
    }
}
