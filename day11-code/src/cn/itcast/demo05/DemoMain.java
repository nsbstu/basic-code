package cn.itcast.demo05;
/*
如果接口的实现类（或是父类的子类）只需要使用唯一的一次
那么这种情况下可以省略掉该类的定义，改为使用【匿名内部类】

接口名 对象名 = new 接口名（）{
//覆盖重写所有的抽象方法
}；

注意：
1：匿名内部类在【创建对象】时候只能使用唯一一次，
如果希望多次使用创建对象，而且类的内容一样，就必须使用实现类
2：匿名对象，在【调用方法】的时候，只能调用唯一一次
如果希望同一个对象，调用多次方法，就必须给对象起个名字
3.匿名内部类是省略了【实现类/子类名称】，但是匿名对象是省略了【对象名称】
强调：【匿名内部类和匿名对象不是一回事】
 */
public class DemoMain {
    public static void main(String[] args) {
     /*  MyInterface obj = new MyInterfaceImpl();//多态
        MyInterfaceImpl obj = new MyInterfaceImpl();//普通方法
        obj.method();*/
//不是匿名对象
        MyInterface objA = new MyInterface() {
            @Override
            public void method1() {
                System.out.println("匿名内部类111-A");
            }

            @Override
            public void method2() {
                System.out.println("匿名内部类222-A");
            }


        };
        objA.method1();
        objA.method2();


        System.out.println("===============");
//匿名对象
       new MyInterface() {
            @Override
            public void method1() {
                System.out.println("匿名内部类111-B");
            }

            @Override
            public void method2() {
                System.out.println("匿名内部类222-B");
            }


        }.method2();

        new MyInterface() {
            @Override
            public void method1() {
                System.out.println("匿名内部类111-B");
            }

            @Override
            public void method2() {
                System.out.println("匿名内部类222-B");
            }


        }.method1();

    }
}
