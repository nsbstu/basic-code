package src.cn.itcast.demo02;
/*
匿名对象
左边没有名字 只有new 类名称（）；
只能使用唯一一次，下次再用不得不在建立一个新对象；
使用建议：如果确定某个对象只使用唯一一次，就可以用匿名对象
 */
public class Demo01Anonymous {
    public static void main(String[] args) {
        Person one = new Person();
        one.name = "高圆圆";
        one.showName();
        System.out.println("============");
        //匿名对象
        new Person().name = "赵又廷";
        new Person().showName();
    }
}
