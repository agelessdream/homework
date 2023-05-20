package day03;

import java.util.Scanner;

public class Homework8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入月");
        int month = scanner.nextInt();
        System.out.println("请输入日");
        int day = scanner.nextInt();
        scanner.close();
        int totalDays = 0;
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
                totalDays += 28;
            case 2:
                totalDays += 31;
            case 1:
                totalDays += day;
        }
        String s="";
        if(month==2&&day==29){
            s="双鱼座";
        }else if(totalDays<=19){
            s="摩羯座";
        }else if(totalDays<=49){
            s="水瓶座";
        }else if(totalDays<=79){
            s="双鱼座";
        }else if(totalDays<=109){
            s="白羊座";
        }else if(totalDays<=140){
            s="金牛座";
        }else if(totalDays<=172){
            s="双子座";
        }else if(totalDays<=203){
            s="巨蟹座";
        }else if(totalDays<=234){
            s="狮子座";
        }else if(totalDays<=265){
            s="处女座";
        }else if(totalDays<=296){
            s="天秤座";
        }else if(totalDays<=326){
            s="天蝎座";
        }else if(totalDays<=355){
            s="射手座";
        }else
            s="魔羯座";
        System.out.println(s);
    }
}
