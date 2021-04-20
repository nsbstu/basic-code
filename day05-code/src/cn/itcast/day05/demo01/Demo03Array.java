package cn.itcast.day05.demo01;

/*
静态省略格式不能拆分两步
 */
public class Demo03Array {
    public static void main(String[] args) {
        int[] arrayA = {10, 20, 30};
        //静态分两步
        int[] arrayB;
        arrayB = new int[]{11,21,31};
        //动态两步
        int[] arrayC;
        arrayC = new int[5];
    }
}
