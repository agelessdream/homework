package day03;

import java.util.Scanner;

public class Homework3 {
    public static void main(String[] args) {
        double discount=1;
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入原价");
        double totalPrice = scanner.nextDouble();
        if (totalPrice < 0) {
            System.out.println("输入有误");
        } else {
            int b = (int) totalPrice / 100;
            switch (b){
                case 0,1:break;
                case 2:discount=0.95;break;
                case 3:discount=0.9;break;
                case 4:discount=0.85;break;
                default:discount=0.8;
            }
            System.out.println("折扣为"+discount+"，折后价为"+totalPrice*discount);
        }
        scanner.close();
    }
}
