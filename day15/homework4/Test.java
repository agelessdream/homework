package day15.homework4;

import java.util.Arrays;

public class Test{
    public static void main(String[] args) {
        Integer[] arr = {1,2,3,4,5,6};
        reverse(arr);
        System.out.println(Arrays.toString(arr));

        String[] arr2={"a","b","c"};
        reverse(arr2);
        System.out.println(Arrays.toString(arr2));
    }
    public static <T> void reverse(T[] arr){
        for (int i = 0; i < arr.length/2; i++) {
            T temp = arr[i];
            arr[i] = arr[arr.length-1-i];
            arr[arr.length-1-i] = temp;
        }
    }

}