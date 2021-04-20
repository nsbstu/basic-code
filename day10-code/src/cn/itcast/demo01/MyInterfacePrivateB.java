package cn.itcast.demo01;

/*
普通私有方法：解决多个默认方法之间重复的代码
private 返回值类型 方法名（）{}
静态私有方法：解决多个静态方法之间重复的代码
private static返回值类型 方法名（）{}
 */
public interface MyInterfacePrivateB {
    public static void methodStatic1() {
        System.out.println("静态方法1");
        methodCommon();
    }

    public static void methodStatic2() {
        System.out.println("静态方法2");
        methodCommon();
    }

    private static void methodCommon() {
        System.out.println("aaa");
        System.out.println("aaa");
        System.out.println("aaa");
    }

}
