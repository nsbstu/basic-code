package cn.itcast.demo09;
/*
this三种用法：
1.在本类的成员方法中调用本类成员变量
2.在本类的成员方法中调用本类另一个成员方法
3.在本类的构造方法中，访问本类另一个构造方法
注意：
A:this(..)调用必须是构造方法的第一个语句也是唯一一个
B:super和this不能同时使用
 */
public class Zi extends Fu{
    int num = 20;
    //3
    public Zi(){
        this(13);
    }
    public Zi(int num){
        this(12,13);
    }
    public Zi(int num,int n){

    }
    public void methodA(){
        //1
        System.out.println(this.num);
    }
    //2
    public void methodB(){
        this.methodA();

    }

}
