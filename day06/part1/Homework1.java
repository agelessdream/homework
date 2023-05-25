package day06.part1;

//打印杨辉三角
public class Homework1 {
    static int comb(int m,int n){//组合数,没写完
        n=(n<m-n)?n:m-n;
        int product1=0;
        return 0;
    }
    static void getYangHui(int a){//
        for(int i=0;i<a;i++){
            for(int j=0;j<=i;j++){
                if(j==0||j==i){
                    System.out.print(1+"\t");
                }else System.out.print(comb(i,j)+"\t");
            }
            System.out.println();
        }
    }
    static void getYangHui2(int a){
        int[][] yangHui=new int[a][];
        for(int i=0;i<a;i++){//给两翼赋值
            yangHui[i]=new int[i+1];
            yangHui[i][0]=yangHui[i][i]=1;
        }
        for(int i=2;i<a;i++){//给其他位置赋值
            for(int j=1;j<yangHui[i].length-1;j++){
                yangHui[i][j]=yangHui[i-1][j-1]+yangHui[i-1][j];
            }
        }
        for(int i=0;i< yangHui.length;i++){//打印
            for (int j=0;j<yangHui[i].length;j++){
                System.out.print(yangHui[i][j]+"\t");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        getYangHui(7);
        getYangHui2(5);
    }
}
