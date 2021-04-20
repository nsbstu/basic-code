package cn.itcast.demo06;

public class NewPhone extends Phone{
    @Override
    public void show() {
        super.show();//继承的方法
        //新加的内容
        System.out.println("显示电话号码");
        System.out.println("显示头像");
    }
}
