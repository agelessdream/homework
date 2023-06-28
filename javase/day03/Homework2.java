package javase.day03;

import java.util.Scanner;

public class Homework2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个字符");
        char c = scanner.next().charAt(0);
        scanner.close();
        if (c >= 48 && c <= 57) {
            System.out.println("输入的是数字数字（0-9)");
        } else if (c >= 65 && c <= 90) {
            System.out.println("输入的是大写字母A-Z");
        } else if (c >= 97 && c <= 122) {
            System.out.println("输入的是小写字母a-z");
        } else System.out.println("输入的是特殊符号");
    }
}
