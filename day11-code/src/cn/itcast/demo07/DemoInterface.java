package cn.itcast.demo07;

import java.util.ArrayList;
import java.util.List;

public class DemoInterface {
    public static void main(String[] args) {
        //左边接口名，右边实现类名称，多态写法
        List<String> list =  new ArrayList<>();
        List<String> result = addName(list);
        for (int i = 0; i < result.size(); i++) {
            System.out.println(result.get(i));
        }
    }
    public static List<String> addName(List<String> list){
        list.add("迪丽热巴");
        list.add("古力娜扎");
        list.add("马儿扎哈");
        list.add("沙洋娜拉");
        return list;

    }
}
