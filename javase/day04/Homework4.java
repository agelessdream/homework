package javase.day04;

import java.util.Scanner;

//从键盘分别输入年、月、日，判断这一天是当年的第几天。不进行合法性判断
public class Homework4 {
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

        for(int i=1;i<month;i++){
            switch (i){
                case 2:totalDays+=daysOfFebruary;break;
                case 4,6,9,11:totalDays+=30;break;
                default:totalDays+=31;
            }
        }
        totalDays+=day;
        System.out.println("这一天是这一年的第"+totalDays+"天");
    }
}
