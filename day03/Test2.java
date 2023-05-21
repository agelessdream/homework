package day03;
//100匹马驼100担货物，1大马驼3担，1中马驼2担，2小马驼1担
public class Test2 {
    public static void main(String[] args) {
        int a,b,c;
        int num=0;
        for(a=0;a<=100/3;a++){
            for(b=0;b<=(100-3*a)/2;b++){
                if((100-a-b)%2==1){
                    break;
                }else c=100-a-b;
                if((c/2+3*a+2*b)==100){
                    System.out.println("大马"+a+"匹，中马"+b+"匹，小马"+c+"匹");
                    num++;
                }else break;
            }
        }
        System.out.println("共有"+num+"种方案");
    }
}
