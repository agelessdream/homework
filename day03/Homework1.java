package day03;

import java.util.Scanner;

public class Homework1 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入一个整数");
        int a=scanner.nextInt();
        if(a%5==0){
            System.out.println("是5的倍数");
        }else System.out.println("不是5的倍数");
        scanner.close();
    }
}
