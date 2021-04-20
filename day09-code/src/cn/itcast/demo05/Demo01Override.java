package cn.itcast.demo05;
/*
@override，写在方法前，检测是不是有效的正确覆盖重写

子类方法的返回值类型必须【小于于等于】父类方法的返回值类型，例如子String父：Object
Object是公共最高父类
子类方法的权限【大于等于】父类的权限修饰符
扩展：public>protected>(default)>private
备注：（default）不是关键字default，而是什么也不写的，留空

子类不能重写父类的private方法
 */
public class Demo01Override {
}
