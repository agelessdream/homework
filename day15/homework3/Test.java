package day15.homework3;

public class Test {
    public static <T> void method(T[] arr,int a,int b){
        T t=arr[a];
        arr[a]=arr[b];
        arr[b]=t;
    }

    public static void main(String[] args) {
        Integer[] arr = {1,2,3,4,5,6};
        method(arr,0,1);
        for (Integer num : arr) {
            System.out.println(num);
        }
    }
}
