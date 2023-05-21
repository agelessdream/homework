package day04;
//打印金字塔
public class Homework3 {
    public static void main(String[] args) {
        for(int i=1;i<6;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }

        for(int i=1;i<6;i++){
            for(int j=1;j<=i;j++){
                System.out.print(i);
            }
            System.out.println();
        }

        for(int i=1;i<6;i++){
            for(int j=1;j<6-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<2*i;j++){
                System.out.print(i);
            }
            System.out.println();
        }
    }
}
