package cn.itcast.demo04;

public class Outer {//外部类
    public void methodOuter(){
        class Inner{//局部内部类
            int num = 10;
            public void methodInner(){
                System.out.println(num);
            }
        }
        Inner inner = new Inner();
        inner.methodInner();
    }
}
