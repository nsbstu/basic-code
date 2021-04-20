package cn.itcast.demo08;
/*
super用法
1.在子类的成员方法中访问父类成员变量
2.在子类的成员方法中访问父类成员方法
3.再子构造方法中访问父类构造方法
 */
public class Zi extends Fu{
    int num = 20;
    //1
    public void methodZi(){
        System.out.println(super.num);
    }
    //2
    public void method(){
        super.method();
        System.out.println("子类方法");
    }
    //3
    public Zi(){
        super();
    }

}
