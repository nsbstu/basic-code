package cn.itcast.demo01;

public class MyInterfaceDefaultB implements MyInterfaceDefault {
    @Override
    public void methodAbs1() {
        System.out.println("执行抽象方法bbb");
    }

    @Override
    public void methodDefault() {
        System.out.println("执行重写的默认方法");
    }
}
