package cn.itcast.demo03;
//有四个抽象方法
/*method
methodA
methodB
methodCommon
*/
public interface MyInterface extends   MyInterfaceA,MyInterfaceB {
    public abstract void method();

    @Override
    default void methodDefault() {

    }
}
