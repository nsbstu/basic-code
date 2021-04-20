package cn.itcast.demo03;

public class Zi extends Fu {
    int num = 20;
    public void method(){
       int num = 30;
        System.out.println(num);//直接变量名==》局部变量
        System.out.println(this.num);//this.num==>子类成员变量
        System.out.println(super.num);//super.num==>父类成员变量
    }
}
