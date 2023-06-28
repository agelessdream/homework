package javase.day02;

public class ExchangeValue {
    public static void exchange1(int a,int b){
        int temp=a;a=b;b=temp;
    }
    public static void exchange2(int a,int b){
        b=a+b;a=b-a;b=b-a;
    }
    public static void exchange3(int a,int b){
        b=b-a;a=a+b;b=a-b;
    }
    public static void exchange4(int a,int b){
        b=a*b;a=b/a;b=b/a;
    }
    public static void main(String[] args) {
        int a=2,b=3;
        exchange1(a,b);
        System.out.println(a);
        System.out.println(b);
    }
}
