package cn.itcast.demo03;
/*
Outer.this.num
 */
public class Outer {//外部类
    int num = 10;
    public  class Inner{//成员内部类
        int num = 20;
        public void method(){
            int num = 30;
            System.out.println(num);//局部变量
            System.out.println(this.num);//内部类变量
            System.out.println(Outer.this.num);//外部类变量
        }
    }
}
