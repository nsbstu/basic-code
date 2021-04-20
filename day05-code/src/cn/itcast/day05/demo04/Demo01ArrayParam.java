package cn.itcast.day05.demo04;

public class Demo01ArrayParam {
    public static void main(String[] args) {
        int [] array = {10,20,30,40,50};
        printArray(array);
        System.out.println("============");
        printArray(array);
        System.out.println("============");
        printArray(array);
        System.out.println("============");
    }
    public static void  printArray(int [] array){
        System.out.println("printArray收到的参数是");
        System.out.println(array);
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }


}
