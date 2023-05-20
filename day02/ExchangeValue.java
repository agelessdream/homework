package day02;

public class ExchangeValue {
    public static void exchange1(int a,int b){
        System.out.println("a="+a+",b="+b);
        int temp=a;a=b;b=temp;
        System.out.println("a="+a+",b="+b);
        System.out.println();
    }
    public static void exchange2(int a,int b){
        System.out.println("a="+a+",b="+b);
        b=a+b;a=b-a;b=b-a;
        System.out.println("a="+a+",b="+b);
        System.out.println();
    }
    public static void exchange3(int a,int b){
        System.out.println("a="+a+",b="+b);
        b=b-a;a=a+b;b=a-b;
        System.out.println("a="+a+",b="+b);
        System.out.println();
    }
    public static void exchange4(int a,int b){
        System.out.println("a="+a+",b="+b);
        b=a*b;a=b/a;b=b/a;
        System.out.println("a="+a+",b="+b);
        System.out.println();
    }
    public static void main(String[] args) {
        int a=2,b=3;
        exchange1(a,b);
        exchange2(a,b);
        exchange3(a,b);
        exchange4(a,b);
    }
}
