package cn.itcast.day04.demo03;

/*定义一个方法求出1-100之间所有数字的值
 */
public class Demo02MethodSum {
    public static void main(String[] args) {

        System.out.println("结果是："+ getSum());
    }
    public static int getSum(){
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            sum += i;
        }
        return sum;
    }
}
