package src.cn.itcast.demo04;

import java.util.ArrayList;

public class Demo04ArrayListEach {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("迪丽热巴");
        list.add("古力娜扎");
        list.add("马而扎哈");
        //遍历集合list.fori
        for(int i= 0; i < list.size(); i++){
            System.out.println(list.get(i));
        }



    }
}
