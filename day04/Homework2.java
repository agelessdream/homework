package day04;
//折纸几次超越珠峰
public class Homework2 {
    public static void main(String[] args) {
        //方法1
        System.out.println((int)(Math.log(88488600)/Math.log(2))+1);


        //方法2
        int count=0;
        for(double d=0.0001;d<8848.86;d*=2){
            count++;
        }
        System.out.println(count);
    }
}
