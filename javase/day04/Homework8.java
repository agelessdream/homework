package javase.day04;
//打印空心菱形
public class Homework8 {
    public static void main(String[] args) {
        String[][] str1=new String[5][9];
        String[][] str2=new String[4][9];
        for(int i=0;i<5;i++){
            for(int j=0;j<9;j++){
                str1[i][j]=" ";
            }
            str1[i][4-i]="*";
            str1[i][4+i]="*";
        }

        for(int i=0;i<4;i++){
            for(int j=0;j<9;j++){
                str2[i][j]=" ";
            }
            str2[i][i+1]="*";
            str2[i][7-i]="*";
        }


        for(int i=0;i<5;i++){
            for(int j=0;j<9;j++){
                System.out.print(str1[i][j]);
            }
            System.out.println();
        }

        for(int i=0;i<4;i++){
            for(int j=0;j<9;j++){
                System.out.print(str2[i][j]);
            }
            System.out.println();
        }
    }
}
