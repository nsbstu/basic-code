package cn.itcast.demo13;

public class DemoMain {
    public static void main(String[] args) {
        Dog2Ha ha = new Dog2Ha();
        ha.sleep();
        ha.eat();
        System.out.println("======");
        DogGolden gg = new DogGolden();
        gg.sleep();
        gg.eat();
    }
}
