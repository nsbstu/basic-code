package cn.itcast.demo01;
/*
直接创建的String实在字符串常量池中
== 在基本类型中比较值
在引用类型比较地址
 */
public class Demo02StringPool {
    public static void main(String[] args) {
        String str1 = "abc";
        String str2 = "abc";

        char[] charArray = {'a','b','c'};
        String str3 = new String(charArray);
        System.out.println(str1 == str2);//true
        System.out.println(str1 == str3);//flase
        System.out.println(str2 == str3);//flase
    }
}
