package cn.itcast.demo03;

public class Demo02InnerClass {
    public static void main(String[] args) {
        //创建对象
        Outer.Inner inner = new Outer().new Inner();
        inner.method();
    }
}
