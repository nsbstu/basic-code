package cn.itcast.demo04;

//计算在 -10.8 到 5.9 之间，绝对值大于 6 或者小于 2.1 的整数有多少个？
public class Demo04MathPractise {
    public static void main(String[] args) {
        double min = -10.8;
        // 定义最大值
        double max = 5.9;
        // 定义变量计数
        int count = 0;
        // 范围内循环
        for (int i = (int)min; i <= max; i++) {//(int)min====Math.ceil(min)
        // 获取绝对值并判断
            if (Math.abs(i) > 6 || Math.abs(i) < 2.1) {
        // 计数
                System.out.println(i);
                count++;
            }
        }
        System.out.println("个数为: " + count + " 个");
    }
}
