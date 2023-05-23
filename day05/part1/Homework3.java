package day05.part1;
//（1）要求使用char数组存储26个英文字母，并分别用正序和逆序方式显示输出。
//（2）要求每10个字母一行。
public class Homework3 {
    public static void main(String[] args) {
        char[] c=new char[26];
        for(int i=0;i<c.length;i++){
            c[i]=(char)(65+i);
        }
        for(int i=0;i<c.length;i++){
            System.out.print(c[i]);
            if (i%10==1){
                System.out.println();
            }else System.out.print(",");
        }
        System.out.println("\n");
        for(int i=c.length-1;i>=0;i--){
            System.out.print(c[i]);
            if (i%10==6){
                System.out.println();
            }else System.out.print(",");
        }

    }
}
