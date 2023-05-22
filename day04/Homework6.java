package day04;

import java.util.Scanner;

//（1）假设从2000年1月1日开始三天打鱼，两天晒网，
//（2）从键盘输入今天的日期年、月、日，显示今天是打鱼还是晒网？
public class Homework6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入年");
        int year = scanner.nextInt();
        System.out.println("请输入月");
        int month = scanner.nextInt();
        System.out.println("请输入日");
        int day = scanner.nextInt();
        scanner.close();
        int currentYear=2000,totalDays=0;
        for(;currentYear<year;currentYear++){
            if(currentYear%4==0&&currentYear%100!=0||currentYear%400==0){
                totalDays+=366;
            }else totalDays+=365;
        }
        int daysOfFebruary = (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) ? 29 : 28;//判断最后一年的2月天数
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
        if((totalDays-1)%5/3==0){
            System.out.println("打鱼");
        }else System.out.println("晒网");
    }
}
