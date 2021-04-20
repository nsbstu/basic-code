package cn.itcast.demo05;

public class Zi extends Fu{
    int num = 20;

    @Override
    public void showNum() {
        super.showNum();
        System.out.println(num);
    }

    public void method(){
        System.out.println("子类方法");
    }
    public void methodZi(){
        System.out.println("子类特有方法");
    }
}
