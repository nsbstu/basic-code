package cn.itcast.demo02;

import java.nio.charset.StandardCharsets;

/*
toCharArray();字符串转换为char
getBytes();字符串转换为byte
replace(old,new);把旧的字符串替为新的字符串
 */
public class Demo04StringConvert {
    public static void main(String[] args) {
        char[] chars = "helloworld".toCharArray();
        System.out.println(chars);
        System.out.println("========");

        byte[] bytes = "abc".getBytes();
        for (int i = 0; i < bytes.length; i++) {
            System.out.println(bytes[i]);
        }
        System.out.println("===========");

        String str1 = "how do you do ?";
        String str2 = str1.replace("o","m");
        System.out.println(str2);
        System.out.println("=========");
        String strA = "玩的真菜，你大爷的！！！";
        String strB = strA.replace("你大爷的", "***");
        System.out.println(strB);

    }
}
