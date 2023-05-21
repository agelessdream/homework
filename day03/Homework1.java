package day03;

import java.util.Scanner;

public class Homework1 {
    public static void main(String[] args) {
        System.out.println("请输入一个整数");
        int a = new Scanner(System.in).nextInt();
        String s = a % 5 == 0 ? "" : "不";
        System.out.println(s + "是5的倍数");
    }
}
