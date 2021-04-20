package cn.itcast.demo07;

public class DemoMain {
    public static void main(String[] args) {
        Computer computer = new Computer();
        computer.powerOn();

        //准备一个鼠标供电脑使用向上转型
        Usb useMouse = new Mouse();//多态写法
        computer.useDevice(useMouse);

        //键盘
        Keyboard keyboard = new Keyboard();
        computer.useDevice(keyboard);//正确，向上转型
        //computer.useDevice(new Keyboard());//正确
        computer.powerOff();
        System.out.println("=========");
        method(10.0);//正确
        method(20);//正确int-->double
        int a = 30;
        method(a);//正确int-->double

    }
    public static void method(double num){
        System.out.println(num);
    }
}
