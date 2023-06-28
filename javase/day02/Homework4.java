package javase.day02;

public class Homework4 {
    public static void main(String[] args) {
        int a1=10,a2=11,a3=12,a4=13;
        Judge.isEvenNumber(a1);
        Judge.isEvenNumber(a2);
        Judge.isOddNumber(a3);
        Judge.isOddNumber(a4);
    }
}

interface Judge{
     static void isOddNumber(int a){
        if(a%2==0){
            System.out.println(a+"是奇数？false");
        }else System.out.println(a+"是奇数？true");

    }
     static void isEvenNumber(int a){
        if(a%2==1){
            System.out.println(a+"是偶数？false");
        }else System.out.println(a+"是偶数？true");

    }
}
