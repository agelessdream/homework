package day03;
/*判断打鱼还是晒网
        （1）从键盘输入年、月、日，
        （2）假设从这一年的1月1日开始执行三天打鱼两天晒网，那么你输入的这一天是在打鱼还是晒网。*/

import java.util.Scanner;

public class Homework7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入年");
        int year = scanner.nextInt();
        System.out.println("请输入月");
        int month = scanner.nextInt();
        System.out.println("请输入日");
        int day = scanner.nextInt();
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
        if (totalDays % 5 == 1 || totalDays % 5 == 2 || totalDays % 5 == 3) {
            System.out.println("打鱼");
        } else System.out.println("晒网");
    }
}
