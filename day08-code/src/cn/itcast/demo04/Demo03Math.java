package cn.itcast.demo04;
/*
Math.abs():绝对值
Math.ceil()：向上取整
Math.floor()：向下取整
Math.round()：四舍五入
Math.PI 圆周率
 */
public class Demo03Math {
    public static void main(String[] args) {
        //绝对值
        System.out.println(Math.abs(3.14));//3.14
        System.out.println(Math.abs(-4.3));//4.3
        System.out.println("=========");
       // 向上取整
        System.out.println(Math.ceil(4.2));//5.0
        System.out.println(Math.ceil(4.6));//5.0
        System.out.println(Math.ceil(-4.2));//-4.0
        System.out.println(Math.ceil(-4.6));//-4.0
        System.out.println("=========");

        //向下取整
        System.out.println(Math.floor(4.2));//4.0
        System.out.println(Math.floor(4.6));//4.0
        System.out.println(Math.floor(-4.2));//-5.0
        System.out.println(Math.floor(-4.6));//-5.0
        System.out.println("=========");
        //四舍五入
        System.out.println(Math.round(4.2));//4
        System.out.println(Math.round(4.6));//5
        System.out.println(Math.round(-4.2));//-4
        System.out.println(Math.round(-4.6));//-5
    }
}
