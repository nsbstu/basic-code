package cn.itcast.demo01;

/*
final最终不可改变
修饰类，
修饰类public final class
这个类不能有任何子类（太监类）
一个类如果是final，其中的成员方法不能重写覆盖，没儿子

方法，final修饰方法，这个是最终方法public final void，不能覆盖重写
对于一个类或方法abstract和final不能同时使用，矛盾

局部变量，final修饰局部变量，不能修改
对于基本类型，不可变是变量中的数据不可变
        //对于引用类型，不可变是变量中的地址值不可变,内容可以变
成员变量
对于成员变量，如果使用final这个变量照样不可变
1；成员变量有默认值，所以用了final之后必须手动赋值，不会再给默认值
 2:对于final的成员变量 （二选一） 要么直接赋值，要么使用构造方法赋值
 3:必须保证所有的重载的构造方法最终都会对final修饰的成员变量赋值
 */
public class Demo01Final {
    public static void main(String[] args) {
        int num1 = 10;
        System.out.println(num1);
        num1 = 20;
        System.out.println(num1);

        //final修饰局部变量，不能修改
        final int num2 = 200;
        System.out.println(num2);

        // num2 =300;//错误
        //  num2 = 200;//错误

        final int num3;
        num3 = 30;//正确
        System.out.println("==========");
        //对于基本类型，不可变是变量中的数据不可变
        //对于引用类型，不可变是变量中的地址值不可变,内容可以变

        Student stu1 = new Student("赵丽颖");
        System.out.println(stu1);
        System.out.println(stu1.getName());//赵丽颖
        stu1 = new Student("霍建华");
        System.out.println(stu1);
        System.out.println(stu1.getName());//霍建华
        System.out.println("========");

       final Student stu2 = new Student("高圆圆");
        System.out.println(stu2);
        System.out.println(stu2.getName());//赵丽颖
       // stu1 = new Student("霍建华");错误
        stu2.setName("高圆圆圆圆");
        System.out.println(stu2);
        System.out.println(stu2.getName());//霍建华
    }
}
