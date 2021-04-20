package cn.itcast.demo06;

/*
对象 instanceof 类名称
得到一个布尔型结果，判断前面的对象能不能做后面列类型的实例
 */
public class Demo02Instanceof {
    public static void main(String[] args) {
        Animal animal = new Dog();//本来是狗
        animal.eat();

        //调用子类对象，向下转型
        //判断父类引用的animal本来是不是Dog
        if (animal instanceof Dog) {
            Dog dog = (Dog) animal;
            dog.watchHouse();
        }
        if (animal instanceof Cat) {
           Cat cat = (Cat) animal;
           cat.catchMouse();
        }
        giveAPet(new Dog());
    }
    //向下转型举例
    public static void giveAPet(Animal animal){
        if (animal instanceof Dog) {
            Dog dog = (Dog) animal;
            dog.watchHouse();
        }
        if (animal instanceof Cat) {
            Cat cat = (Cat) animal;
            cat.catchMouse();
        }
    }
}
