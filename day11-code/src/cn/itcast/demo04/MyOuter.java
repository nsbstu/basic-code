package cn.itcast.demo04;
/*
局部内部类如果希望访问呢所在方法的局部变量，那么这个局部变量必须是final
从java8开始，只要局部变量事实不变，那么final关键字就可以省略
 原因：
 1.new的对象在堆里
 2.局部变量跟着方法进栈
 3.方法运行结束之后，局部变量立马消失
 4.new出的对象在堆中持续存在，直到垃圾回收
 */
public class MyOuter {
    public void methodOuter(){
        final int num = 10;
        //num = 20;
        class Inner{
            public void methodInner(){
                System.out.println(num);
            }
        }
    }
}
