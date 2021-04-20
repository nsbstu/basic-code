package cn.itcast.demo02;
/*
length()字符串长度
concat()字符串拼接
charAt(index)根据索引找到第index元素内容
indexOf()根据内容得出第一次索引值，没有是-1
 */
public class Demo02StringGet {
    public static void main(String[] args) {
        int length = "hjdhslkhlfs".length();
        System.out.println("字符串长度是：" + length);//11
        System.out.println("============");
        String str1 = "hello";
        String str2 = "world";
        String str3 = str1.concat(str2);
        System.out.println(str1);//hello
        System.out.println(str2);//world
        System.out.println(str3);//helloworld
        System.out.println("============");

        String str4 = "hello java";
        char c = str4.charAt(5);
        System.out.println("字符串第五位是：" + c);//字符串第五位是： 空格
        System.out.println("==========");

        int llo = str4.indexOf("llo");
        System.out.println("llo在：" + llo);//2

    }
}
