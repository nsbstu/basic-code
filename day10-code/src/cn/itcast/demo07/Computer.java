package cn.itcast.demo07;

public class Computer {
    public void powerOn() {
        System.out.println("笔记本打开");
    }

    public void powerOff() {
        System.out.println("笔记本关闭");
    }

    //使用USB设备的方法,使用接口作为方法的参数
    public void useDevice(Usb usb) {

        usb.open();//打开设备
        if (usb instanceof Mouse) {
            Mouse mouse = (Mouse) usb;
            mouse.click();
        } else if(usb instanceof Keyboard){
            Keyboard keyboard = (Keyboard) usb;
            keyboard.type();
        }

        usb.close();//关闭设备
    }
}
