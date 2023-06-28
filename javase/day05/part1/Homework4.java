package javase.day05.part1;
//随机生成验证码
public class Homework4 {
    public static void main(String[] args) {
        char[] c=new char[62];
        for(int i=0;i<26;i++){
            c[i]=(char)(i+65);
            c[i+26]=(char)(i+97);
        }
        for(int i=0;i<10;i++){
            c[i+52]=(char)(i+48);
        }
        for(int i=0;i<6;i++){
            System.out.print(c[(int) (Math.random()*62)]);
        }
    }
}
