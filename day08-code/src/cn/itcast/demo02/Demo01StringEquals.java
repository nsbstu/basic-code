package cn.itcast.demo02;
/*equals（）区分大小写比较
推荐“obj1”。equals(obj2) 如果obj2是空，null.equals空指针异常
 equalsIgnoreCase不区分大小写比较
 */
public class Demo01StringEquals {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "Hello";

        char[] charArray = {'H','e','l','l','o'};
        String str3 = new String(charArray);

        System.out.println(str1.equals(str2));
        System.out.println(str2.equals(str3));
        System.out.println(str3.equals("Hello"));
        System.out.println("Hello".equals(str3));
        System.out.println("==========");
        System.out.println("hello".equals(str1));
        System.out.println("=========");
        String str5 = null;
        //System.out.println(str5.equals("hello"));//空指针异常
        System.out.println("hello".equals(str5));//flase

        String str6 = "java";
        String str7 = "Java";
        System.out.println(str6.equals(str7));//flase
        System.out.println(str6.equalsIgnoreCase(str7));//true

        System.out.println("==========");
        //只有英文字母大小写不区分
        System.out.println("abc一123".equalsIgnoreCase("abc壹123"));//flase
    }
}
