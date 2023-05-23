package day05.part1;

import java.util.Scanner;

//假设张三从1990年1月1日开始执行三天打鱼两天晒网，5天一个周期，风雨无阻，
// 那么李四想要找张三玩，需要从键盘输入年，月，日后，判断这一天张三是在打鱼还是晒网。
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

        //365能被5整除，故只需记录闰年数量
        int count =0;
        for(int i=1990;i<year;i++){
            if(i%4==0&&i%100!=0||i%400==0){
                count +=1;
            }
        }

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
