package cn.itcast.day05.demo04;

public class Demo02Return {
    public static void main(String[] args) {
        int[] result = calculate(10,20,30);
        System.out.println("main接受的返回值数组");
        System.out.println(result);
        System.out.println("总和：" + result[0]);
        System.out.println("平均数：" + result[1]);
    }
    public static int[] calculate(int a,int b,int c){
        int sum = a + b + c;//总和
        int avg = sum / 3;//平均数
        //两个结果都希望进行返回
       // return sum,avg;
        //需要一个数组可以保存多个结果
     /*   int[] array = new int[2];
        array[0] = sum;
        array[1] = avg;*/

        int[] array = {sum,avg};
        System.out.println("calculate方法内部数组是");
        System.out.println(array);//地址值
        return array;
    }
}
