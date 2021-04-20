package cn.itcast.demo03;
/*
成员内部类
局部内部类（匿名内部类）
//内用外，随意访问，外用内，需要内部类对象
使用成员内部类
1.间接方式：使用外部类的方法中使用内部类，再用main调用外部类方法
2，直接方式：外部类。内部类  对象名 = new外部类（）。new 内部类（）；
 */
public class Demo01InnerClass {
    public static void main(String[] args) {

        //间接方式
        Body body = new Body();
        body.methodBody();

        System.out.println("==========");

        Body.Heart heart = new Body().new Heart();
        heart.beat();
    }
}
