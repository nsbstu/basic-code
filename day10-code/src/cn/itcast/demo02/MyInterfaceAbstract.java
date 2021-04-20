package cn.itcast.demo02;

public abstract class MyInterfaceAbstract implements MyInterfaceA,MyInterfaceB{



    @Override
    public void methodAbs() {
        System.out.println("重写了AB方法");
    }

    @Override
    public void methodDefault() {
        System.out.println("对多个接口中冲突的默认方法重写");
    }

    @Override
    public void methodB() {
        System.out.println("重写了B方法");
    }

}
