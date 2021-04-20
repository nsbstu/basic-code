package cn.itcast.demo08;

import cn.itcast.red.OpenMode;

import java.util.ArrayList;

public class NormalMode implements OpenMode {
    @Override
    public ArrayList<Integer> divide(final int totalMoney, final int totalCount) {
        ArrayList<Integer> list = new ArrayList<>();
        int avg = totalMoney / totalCount;//平均数
        int mod = totalMoney % totalCount;//余数
        //totalcount - 1 代表最后一个先留着
        for (int i = 0; i < totalCount - 1; i++) {
            list.add(avg);
        }
        //有零头，需要放到最后一个红包中
        list.add(avg + mod);
        return list;
    }
}
