package cn.itcast.demo08;

import cn.itcast.red.RedPacketFrame;

public class MyRed extends RedPacketFrame {
    /**
     * 构造方法：生成红包界面。
     *
     * @param title 界面的标题
     */
    public MyRed(String title) {
        super(title);
    }
}
