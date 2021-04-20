package cn.itcast.demo01;
/*
默认方法可以通过接口实现类对象直接调用
默认方法可以 被接口实现类重写
 */
public class Demo02Interface {
    public static void main(String[] args) {
        MyInterfaceDefaultA a = new MyInterfaceDefaultA();
        a.methodAbs1();
        a.methodDefault();
        System.out.println("==============");
        MyInterfaceDefaultB b = new MyInterfaceDefaultB();
        b.methodAbs1();
        b.methodDefault();
    }
}
