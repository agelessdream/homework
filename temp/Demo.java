package temp;

import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入年");
        int year = scanner.nextInt();

        int count =0;
        for(int i=1990;i<year;i++){
            if(i%4==0&&i%100!=0||i%400==0){
                count +=1;
            }
        }


        //这里不对， 待纠正
        int count2=(year-1991)/4+1-((year-1991)/100)+(year-1991)/400;

        System.out.println(count);
        System.out.println(count2);
    }
}
