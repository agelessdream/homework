package day03;
//质数
import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个大于1的整数");
        int num = scanner.nextInt();
        boolean b=true;
        for(int i=2;i<=Math.sqrt(num);i++){
            if(num%i==0){
                b=false;
                break;
            }
        }
        if(b){
            System.out.println("是质数");
        }else System.out.println("不是质数");

    }
}
