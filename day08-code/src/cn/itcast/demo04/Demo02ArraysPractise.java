package cn.itcast.demo04;

import java.util.Arrays;

/*
，将一个随机字符串中的所有字符升序排列，并倒序打印。
 */
public class Demo02ArraysPractise {
    public static void main(String[] args) {
        String str1 = "ahsdkjfhakhf";
        //转换为字符数组
        char[] chars = str1.toCharArray();
        //排序
        Arrays.sort(chars);
        System.out.println(Arrays.toString(chars));
        //反向遍历
        for (int i = chars.length - 1; i >= 0; i--) {
            System.out.print(chars[i]);
        }
    }

}
