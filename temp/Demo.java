package temp;

import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入年");
        int year = scanner.nextInt();

        int count =0;
        for(int i=2000;i<year;i++){
            if(i%4==0&&i%100!=0||i%400==0){
                count +=1;
            }
        }

        int count2=(year-2001)/4+1-((year-2001)/100+1)+(year-2001)/400+1;

        System.out.println(count);
        System.out.println(count2);
    }
}
