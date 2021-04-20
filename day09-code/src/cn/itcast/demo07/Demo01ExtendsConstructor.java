package cn.itcast.demo07;
/*
父子类构造方法的访问特点
1：子类构造中隐含了super（）; 所以一定是先调用父类构造，再执行子类
2：子类构造可以通过super关键字调用父类重载构造；
3：super的父类构造调用，必须是子类构造方法的第一个语句，不能一个子类构造调用多次super
总结
子类构造必须调用父类构造，不写会赠送，写了就用写的super，super只能有一个，还必须是第一个
 */
public class Demo01ExtendsConstructor {
    public static void main(String[] args) {
        Zi zi = new Zi();
    }
}
