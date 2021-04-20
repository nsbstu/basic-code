package cn.itcast.day06.demo03;

//封装
public class Demo02Method {
    public static void main(String[] args) {
        int[] array = {5, 15, 25, 20, 100};
        int max = getMax(array);
        System.out.println(max);
    }

    public static int getMax(int[] array) {
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }
}
