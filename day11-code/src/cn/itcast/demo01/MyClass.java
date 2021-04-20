package cn.itcast.demo01;
/*
修饰类public final class
这个类不能有任何子类（太监类）
一个类如果是final，其中的成员方法不能重写覆盖，没儿子

 */
public final class MyClass /*extends Object*/{
public void method(){
    System.out.println("方法执行");
}
}
