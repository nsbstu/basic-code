package cn.itcast.demo02;
/*
接口中没有静态代码块和构造方法
一个子类只有一个父类
实现类可以同时实现多个接口
在两个继承的接口中都有同名的抽象方法只需要实现一个就行
如果没有覆盖重写全部抽象方法，那么实现类必须是抽象类
 如果实现的多个接口存在重复的默认方法，一定要对冲突的默认方法覆盖重写
 如果父类和接口中的默认方法冲突优先用父类里的方法
 */
public class Demo01Interface {
    public static void main(String[] args) {
        Zi zi = new Zi();
        zi.method();
    }
}
