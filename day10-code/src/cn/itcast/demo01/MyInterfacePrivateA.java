package cn.itcast.demo01;

/*
普通私有方法：解决多个默认方法之间重复的代码
private 返回值类型 方法名（）{}
静态私有方法：解决多个静态方法之间重复的代码
private static返回值类型 方法名（）{}
 */
public interface MyInterfacePrivateA {
    public default void methodDefaultA() {
        System.out.println("默认方法1");
        methodCommon();
    }

    public default void methodDefaultB() {
        System.out.println("默认方法2");
        methodCommon();
    }

    private void methodCommon() {
        System.out.println("aaa");
        System.out.println("aaa");
        System.out.println("aaa");
    }

}
