package cn.itcast.demo02;

import jdk.swing.interop.SwingInterOpUtils;

public class MyInterfaceImpl implements MyInterfaceA,MyInterfaceB{
    @Override
    public void methodA() {
        System.out.println("重写了A方法");
    }

    @Override
    public void methodAbs() {
        System.out.println("重写了AB方法");
    }

    @Override
    public void methodB() {
        System.out.println("重写了B方法");
    }

    @Override
    public void methodDefault() {
        System.out.println("对多个接口中冲突的默认方法重写");
    }
}
