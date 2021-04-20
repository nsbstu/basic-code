package cn.itcast.demo04;
/*
1.外部类：public/（default）
成员内部类public/protected/（default）
局部内部类什么也不写
 */
public class DemoMain {
    public static void main(String[] args) {
        Outer obj = new Outer();
        obj.methodOuter();

    }
}
