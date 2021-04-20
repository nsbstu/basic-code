package cn.itcast.demo08;

import cn.itcast.red.OpenMode;

import java.util.ArrayList;
import java.util.Random;

public class RandomMode implements OpenMode {
    @Override
    public ArrayList<Integer> divide(final int totalMoney, final int totalCount) {
        //手气红包（随机），最少1分，最多不超过"剩下金额平均数” 的2倍
        //第一次红包，随机范围是0.01--6.66
        //第一次发完至少剩3.34；
        //此时还需要再发两个，
        // 再发范围是0.01~3.33
        // （取不到右边，剩下0.01）
        ArrayList<Integer> list = new ArrayList<>();
        //总结：范围【公式】 ：
        // 1 + random.nextInt(leftMoney / leftCount * 2);
        Random r = new Random();//首先建立一个随机数生成器
        //totalMoney总金额，totalCount总份数不变
        int leftMoney = totalMoney;
        int leftCount = totalCount;
        //随机发n-1个，最后一个 不随机
        for (int i = 0; i < totalCount; i++) {
            int money = r.nextInt(leftMoney / leftCount * 2) + 1;
            list.add(money);//将随机的红包放入集合
            leftMoney -= money;//剩下金额越发越少
            leftCount--;//剩下还应该再发的红包次数应该递减
        }
        //最后一个不随机，直接把剩下的放进去
        list.add(leftMoney);


        return list;
    }
}
