package day15;

import java.util.Comparator;

public class Homework5 {
    public static<T extends Comparable<T>> void sort(T[] arr){
        for(int j=arr.length-1;j>0;j--){
            for(int i=0;i<j;i++){
                if(arr[i].compareTo(arr[i+1])>0){
                    T t=arr[i];
                    arr[i]=arr[i+1];
                    arr[i+1]=t;
                }
            }
        }
    }
    public static <T> void sort(T[] arr, Comparator<T> comparator){

    }
}
