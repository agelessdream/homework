package day03;

import java.util.Scanner;

public class Homework5 {
    public static void main(String[] args) {
        int week = 6;//2022年12月31日是周六
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入月");
        int month = scanner.nextInt();
        System.out.println("请输入日");
        int day = scanner.nextInt();
        scanner.close();
        int distance = 0;
        int daysOfFebruary=(2023 % 4 == 0 && 2023 % 100 != 0 || 2023 % 400 == 0)?29:28;//判断2月天数
        switch (month) {
            case 12: distance += 30;
            case 11: distance += 31;
            case 10: distance += 30;
            case 9: distance += 31;
            case 8: distance += 31;
            case 7: distance += 30;
            case 6: distance += 31;
            case 5: distance += 30;
            case 4: distance += 31;
            case 3: distance += daysOfFebruary;
            case 2: distance += 31;
            case 1: distance += day;
        }
        week = (distance + week) % 7;
        if (week == 7) {
            System.out.println("2023年" + month + "月" + day + "日是周日");
        } else System.out.println("2023年" + month + "月" + day + "日是周" + week);
    }
}
