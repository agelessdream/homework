package temp;

public class CharTest {
    int a;

    public static void main(String[] args) {
        CharTest c1=new CharTest();
        CharTest c2=c1;
        c1.a=1;
        System.out.println(c2.a);
    }
}
