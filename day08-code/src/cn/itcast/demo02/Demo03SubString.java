package cn.itcast.demo02;
/*
substring(int index)截取index到末尾的字符串
substring(start,end)截取start到end的字符串
 */
public class Demo03SubString {
    public static void main(String[] args) {
        String str1 = "helloworld";
        String str2 = str1.substring(4);
        System.out.println(str2);//oworld
        System.out.println(str1);//helloworld只截取不改变str1
        System.out.println("===========");

        String str3 = str1.substring(4,7);
        System.out.println(str3);//owo[4,5,6]的内容

        System.out.println("=============");
        //改变的不是字符串，而是strA获取的地址值
        String strA = "hello";
        System.out.println(strA);//hello
        strA = "java";
        System.out.println(strA);//java




    }
}
