package cn.itcast.demo05;
/*
多态代码中，成员方法访问规则：
看new的是谁，优先用谁，没有则向上找
口诀：编译看左，运行看右（成员方法）
编译看左，运行看左（成员变量）
 */
public class Demo02MultiMethod {
    public static void main(String[] args) {
        Fu obj = new Zi();
        obj.method();//父子都有优先用子
        obj.methodFu();//子类没有，父类有，向上
        //编译看左Fu,Fu中没有，编译出错
        //obj.methodZi();
    }
}
