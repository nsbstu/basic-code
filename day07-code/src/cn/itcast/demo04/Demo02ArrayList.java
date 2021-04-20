package src.cn.itcast.demo04;

import java.util.ArrayList;

/*
数组长度不能发生改变
集合的长度能发生改变
对于Arraylist来说，有一个泛型<>
泛型：装在集合里的元素都是统一的类型，只能是引用类型，不能是基本类型
Arraylist打印出来不是地址值，是【】

 */
public class Demo02ArrayList {
    public static void main(String[] args) {
        //从jdk1.7开始，右侧的尖括号内部可以不写内容，但是尖括号得写上
        ArrayList<String> list = new ArrayList<>();
        System.out.println(list);

        //像集合中添加内容
        list.add("赵丽颖");
        System.out.println(list);
        list.add("迪丽热巴");
        list.add("古力娜扎");
        list.add("马而扎哈");
        System.out.println(list);

    }
}
