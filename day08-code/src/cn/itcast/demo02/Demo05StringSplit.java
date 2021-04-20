package cn.itcast.demo02;
/*
split("");根据括号内的规则进行分割字符串，如果用"."分割，需要“\\."
 */
public class Demo05StringSplit {
    public static void main(String[] args) {
        String str1 = "xxx,yyy,zzz";
        String[] array1 = str1.split(",");
        for (int i = 0; i < array1.length; i++) {
            System.out.println(array1[i]);
        }

        System.out.println("==========");

        String str2 = "aaa bbb ccc";
        String[] array2 = str2.split(" ");
        for (int i = 0; i < array2.length; i++) {
            System.out.println(array2[i]);
        }

        System.out.println("=======");

        String str3 = "aaa.bbb.ccc";
        String[] array3 = str3.split("\\.");
        for (int i = 0; i < array3.length; i++) {
            System.out.println(array3[i]);
        }
    }
}
