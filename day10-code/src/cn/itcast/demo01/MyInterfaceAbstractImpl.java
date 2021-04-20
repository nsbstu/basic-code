package cn.itcast.demo01;
/*
实现接口步骤
1.定义一个实现类
2实现类得重写接口中的抽象方法
3创建实现类对象使用
 */
public class MyInterfaceAbstractImpl implements MyInterfaceAbstract{
    @Override
    public void methodAbs1() {
        System.out.println("这是第一个方法");
    }

    @Override
    public void methodAbs2() {
        System.out.println("这是第二个方法");
    }

    @Override
    public void methodAbs3() {
        System.out.println("这是第三个方法");
    }

    @Override
    public void methodAbs4() {
        System.out.println("这是第四个方法");
    }
}
