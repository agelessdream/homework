package day04;
//打印X
public class Homework7 {
    public static void main(String[] args) {
        String[][] str=new String[7][7];
        for(int i=0;i<7;i++){
            for(int j=0;j<7;j++){
                str[i][j]="*";
            }
        }
        for(int i=0;i<7;i++){
            str[i][i]="O";
            str[i][6-i]="O";
        }
        for(int i=0;i<7;i++){
            for(int j=0;j<7;j++){
                System.out.print(str[i][j]);
            }
            System.out.println();
        }
    }
}
