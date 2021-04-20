package cn.itcast.demo01;

public class Demo01String {
    public static void main(String[] args) {
        String str1 = new String();
        System.out.println("第一种是" + str1);

        char[] charArray = {'A','B','C'};
        String str2 = new String(charArray);
        System.out.println("第二种：" + str2);

        byte[] byteArray = {97,98,99};
        String str3 = new String(byteArray);
        System.out.println("第三种：" + str3);

        String str4 = "hello";
        System.out.println("直接：" + str4);

    }


}
