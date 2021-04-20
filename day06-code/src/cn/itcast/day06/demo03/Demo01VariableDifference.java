package cn.itcast.day06.demo03;
/*
没赋值的局部变量不能用
 */
public class Demo01VariableDifference {
    String name;//成员变量
        public void methodA(){
            int num = 20;
            System.out.println(num);
            System.out.println(name);
        }
        public void methodB(int  param){//方法的参数就是局部变量
            //参数在方法调用的时候，必然会被赋值
            System.out.println(param);
            int age;
          //  System.out.println(num);//错误写法
            System.out.println(name);
          //  System.out.println(age);//没赋值不能用
        }
    }
