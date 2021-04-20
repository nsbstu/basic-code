package cn.itcast.demo04;
/*
父子类重名方法会使用对像中的方法，如果没有就向上找，子类没有就去父类找，优先用new里边的方法

重写：方法名和参数列表一样；重写覆盖
重载:方法名相同，参数列表不同

重写的方法优先调用对象所在的地方
 */
public class Demo01ExtendsMethod {
    public static void main(String[] args) {
        Zi zi = new Zi();
        zi.methodZi();
        zi.methodFu();
        zi.method();
    }

}
