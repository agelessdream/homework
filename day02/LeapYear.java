package day02;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入年份20");
        int year=scanner.nextInt();
        boolean b1=(year%4==0);
        boolean b2=(year%100!=0);
        boolean b3=(year%400==0);
        boolean b=(b1&&b2||b3);
        if(b){
            System.out.println(year+"年是闰年");
        }else System.out.println(year+"年不是闰年");
    }
}
