package javase.day04;

import java.util.Scanner;

//从键盘分别输入年月日，计算这一天是这一年的第几天
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
            }else System.out.println("少侠，你又调皮了");
        }

        for (; ; ) {
            System.out.println("请输入月");
            month = scanner.nextInt();
            if (month >= 1 && month <= 12) {
                break;
            }else System.out.println("少侠，你又调皮了");
        }

        int daysOfThisMonth;
        switch (month){
            case 2:
                daysOfThisMonth=(year % 4 == 0 && year % 100 != 0 || year % 400 == 0) ? 29 : 28;break;
            case 4,6,9,11:
                daysOfThisMonth=30;break;
            default:
                daysOfThisMonth=31;
        }

        for (; ; ) {
            System.out.println("请输入日");
            day = scanner.nextInt();
            if (day>0&&day <=daysOfThisMonth) {
                break;
            }else System.out.println("少侠，你又调皮了");
        }
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
        System.out.println(year + "年" + month + "月" + day + "日是这一年的第" + totalDays + "天");
    }
}
