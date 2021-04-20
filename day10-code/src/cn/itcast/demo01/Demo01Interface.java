package cn.itcast.demo01;
/*
接口中内容包括
常量，抽象方法，默认方法，静态方法，私有方法
实现接口步骤
1.定义一个实现类
2实现类得重写接口中的抽象方法
3创建实现类对象使用
如果有一个抽象方法没有重写，那么实现类就得转为抽象类
 */
public class Demo01Interface {
    public static void main(String[] args) {
        MyInterfaceAbstractImpl impl = new MyInterfaceAbstractImpl();
        impl.methodAbs1();
    }
}
