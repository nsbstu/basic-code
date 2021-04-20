package cn.itcast.day06.demo03;

public class Person {
    String name;
    private int age;
    public void show(){
        System.out.println("我叫" + name + ",年龄：" + age);
    }
    //设置数据age（往里放）
    public void setAge(int num){
        if(num < 100 && num > 0 ){
            age = num;
        }else {
            System.out.println("数据不合理");
        }

    }
    //获取age数据（往外拿）
    public int getAge(){
        return age;
    }
}
