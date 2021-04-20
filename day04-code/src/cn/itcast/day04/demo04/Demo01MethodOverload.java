package cn.itcast.day04.demo04;
/*
重载只看方法名和参数列表
有关
参数类型
参数个数
多类型的顺序不同
无关：
参数名称
返回值类型
 */
public class Demo01MethodOverload {
    public static void main(String[] args) {
        System.out.println(sum(10,20));
        System.out.println(sum(10,20,30));
        System.out.println(sum(10,20,30,40));
    }

    public static int sum(double a,int b){
        return (int)(a + b);
    }
    public static int sum(int a,double b){
        return (int)(a + b) ;
    }
    public static int sum(int a,int b){
        return a + b;
    }
    public static int sum(int a,int b,int c){
        return a + b + c;
    }
    public static int sum(int a,int b,int c,int d){
        return a + b + c + d;
    }
}
