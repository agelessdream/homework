package javase.day05.part1;
//月份
import java.util.Scanner;

public class Homework1 {
    public static void main(String[] args) {
        String[] str={"January","February","March","April","May","June","July","August","September","October","November","December"};
        System.out.println("请输入数字1-12");
        System.out.println(str[new Scanner(System.in).nextInt()-1]);
    }
}
