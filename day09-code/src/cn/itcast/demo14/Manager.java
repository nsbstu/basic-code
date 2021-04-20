package cn.itcast.demo14;

import java.util.ArrayList;

public class Manager extends User{
    public Manager() {
    }

    public Manager(String name, int money) {
        super(name, money);
    }

    public ArrayList<Integer> send(int totalMoney,int count){
        //首先需要一个集合用来存储红包
        ArrayList<Integer> redList = new ArrayList<>();

        //看看自己有多少钱
        int leftMoney = super.getMoney();//群主的当前余额
        if(leftMoney < totalMoney){
            System.out.println("余额不足");
            return redList;//空集合
        }
        //扣钱，重新设置余额
       super.setMoney(leftMoney - totalMoney);

        //发红包均分count份
        int avg = totalMoney / count;
        int mod = totalMoney % count;//余数

        for (int i = 0; i < count  - 1; i++) {
            redList.add(avg);
        }
        //余数放到最后一个包里
        int last = avg + mod;
        redList.add(last);
        return redList;
    }
}
