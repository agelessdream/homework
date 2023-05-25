package day06.part2;

import java.util.Arrays;

public class MyArrays {
    static int  binarySearch(int[]  arr,  int  value){
        int[] arr2= Arrays.copyOf(arr,arr.length);//为了不改变原数组的顺序，复制一个数组用来排序
        int[] index=new int[arr.length];//用来记录新数组中的每一个数在原数组中的下标
        for (int i=0;i<index.length;i++){
            index[i]=i;
        }
        for(int i= arr2.length-1;i>0;i--){
            for(int j=0;j<i;j++){
                if(arr2[j]>arr2[j+1]){
                    int temp=arr2[j];
                    arr2[j]=arr2[j+1];
                    arr2[j+1]=temp;
                    int temp2=index[j];
                    index[j]=index[j+1];//记录新数组中的每一个数在原数组中的下标
                    index[j+1]=temp2;//这段代码想破了头
                }
            }
        }
        int left=0,right=arr2.length-1;
        for(;left<=right;) {
            if(arr2[(left+right)/2]==value){
                return index[(left+right)/2];
            }else if(arr2[(left+right)/2]<value){
                left=(left+right)/2+1;
            }else right=(left+right)/2-1;
        }
        return -1;
    }
    static int  binarySearch(char[]  arr,  char  value){
        char[] arr2= Arrays.copyOf(arr,arr.length);
        int[] index=new int[arr.length];
        for (int i=0;i<index.length;i++){
            index[i]=i;
        }
        for(int i= arr2.length-1;i>0;i--){
            for(int j=0;j<i;j++){
                if(arr2[j]>arr2[j+1]){
                    char temp=arr2[j];
                    arr2[j]=arr2[j+1];
                    arr2[j+1]=temp;
                    int temp2=index[j];
                    index[j]=index[j+1];
                    index[j+1]=temp2;
                }
            }
        }
        int left=0,right=arr2.length-1;
        for(;left<=right;) {
            if(arr2[(left+right)/2]==value){
                return index[(left+right)/2];
            }else if(arr2[(left+right)/2]<value){
                left=(left+right)/2+1;
            }else right=(left+right)/2-1;
        }
        return -1;
    }
    static int  binarySearch(double[]  arr,  double  value){
        double[] arr2= Arrays.copyOf(arr,arr.length);
        int[] index=new int[arr.length];
        for (int i=0;i<index.length;i++){
            index[i]=i;
        }
        for(int i= arr2.length-1;i>0;i--){
            for(int j=0;j<i;j++){
                if(arr2[j]>arr2[j+1]){
                    double temp=arr2[j];
                    arr2[j]=arr2[j+1];
                    arr2[j+1]=temp;
                    int temp2=index[j];
                    index[j]=index[j+1];
                    index[j+1]=temp2;
                }
            }
        }
        int left=0,right=arr2.length-1;
        for(;left<=right;) {
            if(arr2[(left+right)/2]==value){
                return index[(left+right)/2];
            }else if(arr2[(left+right)/2]<value){
                left=(left+right)/2+1;
            }else right=(left+right)/2-1;
        }
        return -1;
    }
    static int[]  copy(int[] arr , int length){
        int[] arr2=new int[length];
        for(int i=0;i<length;i++){
            arr2[i]=arr[i];
        }
        return arr2;
    }
    static double[]  copy(double[] arr , int length){
        double[] d=new double[length];
        for(int i=0;i<length;i++){
            d[i]=arr[i];
        }
        return d;
    }
    static char[]  copy(char[] arr , int length){
        char[] c=new char[length];
        for(int i=0;i<length;i++){
            c[i]=arr[i];
        }
        return c;
    }
    static void sort(int[] arr){
        for(int i= arr.length-1;i>0;i--){
            for(int j=0;j<i;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }
    static void sort(char[] arr){
        for(int i= arr.length-1;i>0;i--){
            for(int j=0;j<i;j++){
                if(arr[j]>arr[j+1]){
                    char temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }
    static void sort(double[] arr){
        for(int i= arr.length-1;i>0;i--){
            for(int j=0;j<i;j++){
                if(arr[j]>arr[j+1]){
                    double temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        System.out.println(binarySearch(new int[]{8,1,5,4,9,6,7,10},20));
    }
}
