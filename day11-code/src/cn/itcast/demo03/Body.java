package cn.itcast.demo03;

import jdk.swing.interop.SwingInterOpUtils;

public class Body {//外部类

    public class Heart {//成员内部类

        public void beat() {
            System.out.println("内部类方法心脏怦怦跳");
            System.out.println("我叫：" + name);
        }
    }

    private String name;

    public void methodBody() {
        System.out.println("外部类方法");
        /*Heart heart = new Heart();
        heart.beat();*/
        new Heart().beat();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
