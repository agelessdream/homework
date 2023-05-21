package day03;
//判断年月日是否合法

import java.util.Scanner;

public class Homework6 {
    static void output(int a, int b, int c) {
        System.out.println(a + "年" + b + "月" + c + "日");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入年");
        int year = scanner.nextInt();
        if (year <= 0) {
            System.out.println("你在逗我？");
            System.exit(0);
        }
        System.out.println("请输入月");
        int month = scanner.nextInt();
        if (month < 1 || month > 12) {
            System.out.println("你在扯淡");
            System.exit(0);
        }
        System.out.println("请输入日");
        int day = scanner.nextInt();
        if (day < 1 || day > 31) {
            System.out.println("你在搞笑");
            System.exit(0);
        }
        switch (month) {
            case 1, 3, 5, 7, 8, 10, 12:
                output(year, month, day);
                break;
            case 4, 6, 9, 11:
                if (day == 31) {
                    System.out.println("你在搞笑");
                } else output(year, month, day);
                break;
            default:
                if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
                    if (day > 29) {
                        System.out.println("你在搞笑");
                    } else output(year, month, day);
                } else if (day > 28) {
                    System.out.println("你在搞笑");
                } else output(year, month, day);
        }
        scanner.close();
    }
}
