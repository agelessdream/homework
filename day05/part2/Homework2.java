package day05.part2;
//回文
import java.util.Scanner;

public class Homework2 {
    static boolean isSymmetrical(char[] arr) {
        boolean b = true;
        for (int i = 0; i < arr.length / 2; i++) {
            if (arr[i] != arr[arr.length - 1 - i]) {
                b = false;
                break;
            }
        }
        return b;
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入一个单词");
        String s=scanner.next();
        scanner.close();
        char[] c=s.toCharArray();
        System.out.println(isSymmetrical(c));
    }
}
