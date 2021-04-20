package cn.itcast.demo01;
/*
final修饰方法，这个是最终方法public final void，不能覆盖重写

对于一个类或方法abstract和final不能同时使用，矛盾

 */
public class Fu {
    public final void method() {
        System.out.println("父类方法执行");
    }
}
    //public abstract void methodAbs();
