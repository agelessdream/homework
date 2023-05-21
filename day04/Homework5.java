package day04;

import java.util.Scanner;

//从键盘分别输入年
//要求要对输入值进行合法性的判断，若不合法，一直循环要求重新输入
public class Homework5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int year, month, day = 0;

        for (; ; ) {
            System.out.println("请输入年");
            year = scanner.nextInt();
            if (year > 0) {
                break;
            }
        }
        for (; ; ) {
            System.out.println("请输入月");
            month = scanner.nextInt();
            if (month >= 1 && month <= 12) {
                break;
            }
        }
        for (boolean b = true; b; ) {
            System.out.println("请输入日");
            day = scanner.nextInt();
            if (day < 1 || day > 31) {
                continue;
            }
            switch (month) {
                case 1, 3, 5, 7, 8, 10, 12:
                    b = false;
                    break;
                case 4, 6, 9, 11:
                    if (day == 31) {
                        break;
                    } else {
                        b = false;
                        break;
                    }
                default:
                    if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
                        if (day <= 29) {
                            b = false;
                        }
                    } else if (day <= 28) {
                        b = false;
                    }
            }
        }
        scanner.close();
        int totalDays = 0;
        int daysOfFebruary = (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) ? 29 : 28;//判断2月天数
        switch (month) {
            case 12:
                totalDays += 30;
            case 11:
                totalDays += 31;
            case 10:
                totalDays += 30;
            case 9:
                totalDays += 31;
            case 8:
                totalDays += 31;
            case 7:
                totalDays += 30;
            case 6:
                totalDays += 31;
            case 5:
                totalDays += 30;
            case 4:
                totalDays += 31;
            case 3:
                totalDays += daysOfFebruary;
            case 2:
                totalDays += 31;
            case 1:
                totalDays += day;
        }
        System.out.println(year + "年" + month + "月" + day + "日是这一年的第" + totalDays + "天");
    }
}
