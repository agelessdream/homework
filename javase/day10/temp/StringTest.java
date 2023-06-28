package javase.day10.temp;
//tough
public class StringTest {
    String str="good";
    char[] ch={'t','e','s','t'};

    public void change(String str,char ch[]){
        str = "test ok";
        ch[0]='b';
    }

    public static void main(String[] args) {
        StringTest ex=new StringTest();
        ex.change(ex.str,ex.ch);
        System.out.println(ex.str);
        System.out.println(ex.ch);
        char[] c=new char[]{'a','b'};
        System.out.println(c);
        String[] s=new String[]{"a","b"};
        System.out.println(s);
        int[] i=new int[]{1,2,3};
        System.out.println(i);
    }
}
