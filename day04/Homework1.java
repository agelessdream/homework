package day04;
/*打印
2,4,6,8,10
12,14,16,18,20
22,24,26,28,30
2,34,36,38,40
42,44,46,48,50
52,54,56,58,60
62,64,66,68,70
72,74,76,78,80
82,84,86,88,90
92,94,96,98,100*/
public class Homework1 {
    public static void main(String[] args) {
        int count=0;
        for(int i=2;i<=100;i+=2){
            System.out.print(i);
            count++;
            if(count%5==0){
                System.out.println();
            }else System.out.print(",");
        }
    }
}
