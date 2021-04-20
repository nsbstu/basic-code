package src.cn.itcast.demo05;

import java.util.ArrayList;
import java.util.Random;

/*
大集合中放入20个随机数字，然后筛选其中的偶数元素放到小集合中
要求使用自定义的方法实现
 */
public class Demo04ArrayListReturn {
    public static void main(String[] args) {
        ArrayList<Integer> bigList = new ArrayList<>();
        Random r = new Random();
        for (int i = 0; i < 20; i++) {
            int num = r.nextInt(100) + 1;
            bigList.add(num);
        }
        ArrayList<Integer> smallList = getSmallList(bigList);
        System.out.println("偶数共有："+smallList.size() + "个");
        for (int i = 0; i < smallList.size(); i++) {
            System.out.println(smallList.get(i));

        }
    }

    //这个方法接受大集合参数，返回小集合结果
    public static ArrayList<Integer> getSmallList(ArrayList<Integer> bigList) {
        ArrayList<Integer> smallList = new ArrayList<>();
        for (int i = 0; i < bigList.size(); i++) {
            int num = bigList.get(i);
            if (num % 2 == 0) {
                smallList.add(num);
            }

        }
        return smallList;
    }
}
