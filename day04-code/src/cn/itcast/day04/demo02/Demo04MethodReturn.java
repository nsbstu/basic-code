package cn.itcast.day04.demo02;
/*
定义一个方法，用来求出两数之和（你帮我算，算完结果告诉我）
题目变形：定义一个方法，用来打印两数之和（你算，你显示结果）
 */
public class Demo04MethodReturn {
    public static void main(String[] args) {
      int num = getSum(10,20);
        System.out.println("返回值是："+ num);
        System.out.println("===========");
        Printsum(100,200);
    }

    public static int getSum(int a,int b){
        int result = a + b;
        return result;
    }
    public static void Printsum(int a,int b){
        int result = a + b;
        System.out.println("结果是：" + result);
    }
}
