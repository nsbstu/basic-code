package cn.itcast.demo14;

import java.util.ArrayList;

public class DemoRedPacket {
    public static void main(String[] args) {
        Manager manager = new Manager("群主", 200);
        Member one = new Member("群员A", 0);
        Member two = new Member("群员B", 0);
        Member three = new Member("群员C", 0);
        manager.show();
        one.show();
        two.show();
        three.show();
        System.out.println("===========");
        //群主发包
        ArrayList<Integer> redList = manager.send(20,3);
        //普通群员收包
        one.receive(redList);
        two.receive(redList);
        three.receive(redList);

        manager.show();
        one.show();
        two.show();
        three.show();
    }
}
