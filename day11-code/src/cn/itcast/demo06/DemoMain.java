package cn.itcast.demo06;

public class DemoMain {
    public static void main(String[] args) {
        //创建英雄
        Hero hero = new Hero();
        //为英雄起名，并设置年龄
        hero.setName("盖伦");
        hero.setAge(20);
        //创建武器
        Weapon weapon = new Weapon("多兰剑");
        //为英雄佩戴武器
        hero.setWeapon(weapon);

        hero.attack();
    }
}
