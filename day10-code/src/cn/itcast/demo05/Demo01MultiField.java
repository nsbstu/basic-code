package cn.itcast.demo05;
/*
访问成员变量的两种方式
：直接通过对象名访问成员变量：
    等号左边是谁就优先使用谁，没有则向上找
2：间接通过成员方法访问成员变量
方法属于哪个类，就优先使用哪个类里的成员变量，没有则向上找
 */
public class Demo01MultiField {
    public static void main(String[] args) {
        Fu obj = new Zi();
        System.out.println(obj.num);//10
        System.out.println("=========");
        //子类没有覆盖重写
        obj.showNum();//10
        //子类覆盖重写
        obj.showNum();//10 20
    }
}
