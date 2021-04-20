package cn.itcast.day06.demo02;

public class Demo01PhoneThree {
    public static void main(String[] args) {
        Phone one = new Phone();

        System.out.println(one.brand);//null
        System.out.println(one.price);//0.0
        System.out.println(one.color);//null

        one.brand = "苹果";
        one.price = 8388.0;
        one.color = "黑色";
        System.out.println(one.brand);//苹果
        System.out.println(one.price);//8388.0
        System.out.println(one.color);//黑色



        one.call("乔布斯");
        one.senMessage();
        System.out.println("===========");

        Phone two = one;

        System.out.println(two.brand);//null
        System.out.println(two.price);//0.0
        System.out.println(two.color);//null

        two.brand = "三星";
        two.price = 5999.0;
        two.color = "蓝色";
        System.out.println(two.brand);//苹果
        System.out.println(two.price);//8388.0
        System.out.println(two.color);//黑色



        two.call("欧巴");
        two.senMessage();
    }
}
