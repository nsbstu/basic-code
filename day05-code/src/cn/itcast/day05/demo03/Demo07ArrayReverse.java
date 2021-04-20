package cn.itcast.day05.demo03;
//反转本来1234反转4321(同一数组）
public class Demo07ArrayReverse {
    public static void main(String[] args) {
        int[] array = {10,20,30,40,50};
        //遍历数组本来的样子
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
        System.out.println("=========");

        /*
        初始化语句，条件判断，步进表达式，循环体
         */
        for(int min = 0, max = array.length - 1; min < max; min++,max--){
            int temp = array[min];
            array[min] = array[max];
            array[max] = temp;
        }
        //打印变化之后
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
