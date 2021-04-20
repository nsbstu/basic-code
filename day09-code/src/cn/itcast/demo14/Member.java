package cn.itcast.demo14;

import java.util.ArrayList;
import java.util.Random;

public class Member extends User{
    public Member() {
    }

    public Member(String name, int money) {
        super(name, money);
    }
    public void receive(ArrayList<Integer> list){
        //从多个包中抽取一个给自己
        //随机抽取集合中的一个索引编号
        int index = new Random().nextInt(list.size());
        //根据索引从集合中删除这个元素
        int delta = list.remove(index);
        //获取自己本来的余额
        int money = super.getMoney();
        //重新设置自己的余额
        super.setMoney(money + delta);

    }
}
