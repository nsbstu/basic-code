package cn.itcast.demo01;

import jdk.swing.interop.SwingInterOpUtils;

/*
接口中的默认方法可以解决接口升级问题
 */
public interface MyInterfaceDefault {
    public abstract void methodAbs1();
    //新增一个抽象方法
   // public abstract void methodAbs2();
    //定义一个默认方法
    public default void methodDefault(){
        System.out.println("执行默认方法");
    }
}
