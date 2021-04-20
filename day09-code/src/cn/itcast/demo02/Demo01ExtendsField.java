package cn.itcast.demo02;

/*
在父子类的继承关系中，如果成员变量重名，则，创建子类对象时访问有两种方式
1：直接通过子类访问成员变量：
    等号左边是谁就优先使用谁，没有则向上找
2：间接通过成员方法访问成员变量
方法定义在哪个类，就优先使用哪个类里的成员变量，没有则向上找
 */
public class Demo01ExtendsField {
    public static void main(String[] args) {
        //创建父类对象
        Fu fu = new Fu();
        System.out.println(fu.numFu);//10
        System.out.println("==========");
        //创建子类对象
        Zi zi = new Zi();
        System.out.println(zi.numFu);//10
        System.out.println(zi.numZi);//20
        System.out.println("==========");
        //等号左边是谁就优先使用谁
        System.out.println(zi.num);//200
        //System.out.println(zi.abc);//到处都没有，编译报错
        System.out.println("===========");
        //这个方法是子类中的，优先使用子类
        zi.methodZi();
        //这个方法是在父类子中的，优先使用父类
        zi.methodFu();
    }
}
