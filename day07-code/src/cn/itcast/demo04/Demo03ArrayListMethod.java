package src.cn.itcast.demo04;

import java.util.ArrayList;

/*
add ：添加动作一定成功，返回值可以不用，其他方法必须有返回值
get:从集合中获取元素，get索引值从0开始
remove:从集合中删除元素remove，索引值从0 开始
size:获取元素个数，集合的尺寸
 */
public class Demo03ArrayListMethod {
    public static void main(String[] args) {
        ArrayList<String>  list = new ArrayList<>();
        System.out.println(list);

        boolean success = list.add("柳岩");
        System.out.println(list);
        System.out.println("添加的动作是否成功" + success);

        list.add("高圆圆");
        list.add("赵又廷");
        list.add("李小龙");
        list.add("李小璐");
        list.add("贾乃亮");
        System.out.println(list);

        //从集合中获取元素，get索引值从0开始
        String name = list.get(2);
        System.out.println("第二号索引位置" + name);

        //从集合中删除元素remove，索引值从0 开始
        String whoRemoved = list.remove(4);
        System.out.println("被删除的是" + whoRemoved);
        System.out.println(list);

        //获取元素个数，集合的尺寸
        int size = list.size();
        System.out.println("集合的长度：" + size);
    }
}
