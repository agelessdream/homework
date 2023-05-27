package temp;

public class ForTest {
    public static void main(String[] args) {
        long[] arr=new long[100];
        arr[0]=1;arr[1]=2;
        for(int i=2;i<100;i++){
            arr[i]=arr[i-1]+arr[i-2];
        }
        System.out.println(arr[99]);
    }
}
