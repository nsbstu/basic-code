package cn.itcast.demo04;

/*
多态
父类名称 对象名 = new 子类名称（）；
接口名称 对象名 = new 实现类名称（）；
 */
public class Demo01Multi {
    public static void main(String[] args) {
        Fu obj = new Zi();
        obj.method();
        obj.methodD();
    }
}
