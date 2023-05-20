package temp;

public class CharTest {
    public static void main(String[] args) {
        int i = 2;
        i *= i++;

        int j = 2;
        j *= j+1;

        int k = 2;
        k *= ++k;

        System.out.println("i=" + i);
        System.out.println("j=" + j);
        System.out.println("k=" + k);
    }
}
