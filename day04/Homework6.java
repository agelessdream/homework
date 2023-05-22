package day04;

import java.util.Scanner;

//（1）假设从2000年1月1日开始三天打鱼，两天晒网，
//（2）从键盘输入今天的日期年、月、日，显示今天是打鱼还是晒网。不进行日期的合法性判断
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

        //365能被5整除，故只需记录闰年数量,方法一：
        int count=(year-2001)/4+1-((year-2001)/100+1)+(year-2001)/400+1;


        /*记录闰年数量的方法二，遍历从2000年到year-1的年份，效率低
        int count =0;
        for(int i=2000;i<year;i++){
            if(i%4==0&&i%100!=0||i%400==0){
                count +=1;
            }
        }*/


        //加上最后一年的天数
        for(int i=1;i<month;i++){
            switch (i){
                case 2: count +=(year % 4 == 0 && year % 100 != 0 || year % 400 == 0) ? 29 : 28;break;
                case 4,6,9,11:count +=30;break;
                default:count +=31;
            }
        }
        count +=day;


        if((count -1)%5/3==0){
            System.out.println("打鱼");
        }else System.out.println("晒网");
    }
}
