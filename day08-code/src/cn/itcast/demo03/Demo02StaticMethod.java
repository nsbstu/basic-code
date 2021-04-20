package cn.itcast.demo03;
/*
static的静态方法属于类，不属于对象
没有static的方法，必须创建对象后在调用
有static修饰的方法，不需要创建对象

静态不能直接访问非静态
内存先有的静态再有的非静态，”先人不知道后人，后人知道先人'
静态方法中不能使用this
 */
public class Demo02StaticMethod {
    public static void main(String[] args) {
        MyClass obj = new MyClass();
        obj.method();
        //
        obj.methodStatic();//静态方法可以使用对象名.方法名调用（不推荐）javac会转为类名.方法名
        MyClass.methodStatic();//静态方法使用类名.方法名调用
        //对于本类中的静态方法可以省略类名
        myMethod();
    }
    public static void myMethod(){
        System.out.println("自己的方法！！");
    }
}
