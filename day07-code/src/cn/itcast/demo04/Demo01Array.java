package src.cn.itcast.demo04;



/*
定义一个数组，用来存储三个Person对象，放在同一个数组中
缺点：程序运行区间数组长度不能改变
 */
public class Demo01Array {
    public static void main(String[] args) {
        Person[] array = new Person[3];
        System.out.println(array[0]);

        Person one = new Person("迪丽热巴",18);
        Person two = new Person("古力娜扎",28);
        Person three = new Person("马儿扎哈",38);
        //将one当中的地址值赋值到数组的0号元素位置
        array[0] = one;
        array[1] = two;
        array[2] = three;

        System.out.println(array[0]);//地址值
        System.out.println(array[1]);//地址值
        System.out.println(array[2]);//地址值


        System.out.println(array[1].getName());//古力娜扎
    }
}
