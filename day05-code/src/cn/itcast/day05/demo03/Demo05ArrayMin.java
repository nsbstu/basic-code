package cn.itcast.day05.demo03;

public class Demo05ArrayMin {
    public static void main(String[] args) {
        int[] array = {5,15,30,20,10000,-20,30,40};
        int min = array[0];
        for(int i = 1;i < array.length;i++){
            //如果当前比原先的大就换人
            if(array[i] < min){
                min = array[i];
            }
        }
        //谁最厉害谁到最后
        System.out.println("最小值为：" + min);
    }
}
