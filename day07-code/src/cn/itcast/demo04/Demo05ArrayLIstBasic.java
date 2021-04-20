package src.cn.itcast.demo04;

import java.util.ArrayList;

public class Demo05ArrayLIstBasic {
    public static void main(String[] args) {
        ArrayList<String> listA = new ArrayList<>();
        //泛型不能是基本类型，只能用引用类型
        // ArrayList<int> listB = new ArrayList<>();

        ArrayList<Integer> listC = new ArrayList<>();
        listC.add(100);
        listC.add(200);
        System.out.println(listC);
        int num = listC.get(1);
        System.out.println("第一号元素是" + num);

    }
}
