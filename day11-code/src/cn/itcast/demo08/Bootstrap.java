package cn.itcast.demo08;

import cn.itcast.red.OpenMode;
import cn.itcast.red.RedPacketFrame;

/*
场景说明：红包发出去之后，所有人都有红包，大家抢完之后，最后一个给群主

1.设置程序的标题，通过构造函数的字符串参数
2：设置群主名称
3：设置分发策略，平均？随机？

1.普通红包（平均),余数放在最后一个包
2：手气红包（随机），最少1分，最多不超过平均的2倍，余额越发越少
 */
public class Bootstrap {
    public static void main(String[] args) {
        MyRed red = new MyRed("传智播客双元课程");
        //设置群主名称
        red.setOwnerName("王思聪");
        //普通红包
     /*   OpenMode normal = new NormalMode();
        red.setOpenWay(normal);*/
        OpenMode random = new RandomMode();
        red.setOpenWay(random);

    }
}
