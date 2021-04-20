package cn.itcast.demo01;
/*
注意：不能通过接口实现类的对象调用接口中的静态方法
正确：使用接口名.静态方法名（参数）
 */
public class Demo03Interface {
    public static void main(String[] args) {
        MyInterfaceStaticImpl nn = new MyInterfaceStaticImpl();
       // nn.method();
        MyInterfaceStatic.method();
    }
}
