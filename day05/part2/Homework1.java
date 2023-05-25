package day05.part2;

import java.util.Arrays;

public class Homework1 {
    //冒泡排序
    static void bubbleSort(int[] arr) {
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

    //选择排序
    static void selectionSort(int[] arr){
        for(int i=0;i<arr.length;i++){
            int min=arr[i],index=i; //index用来存放最小元素的下标
            for(int j=i;j<arr.length;j++){
                if(min>arr[j]){
                    min=arr[j];
                    index=j;
                }
            }
            int temp=arr[index];
            arr[index]=arr[i];
            arr[i]=temp;
        }
    }

    //插入排序
    static void insertionSort(int[] arr){
        for(int i=1;i<arr.length;i++){
            int index=i;//index用来存放第i个元素的实时的下标
            for(int j=i-1;j>=0;j--){

                if(arr[index]<arr[j]){
                    int temp=arr[index];
                    arr[index]=arr[j];
                    arr[j]=temp;
                    index=j;//交换位置后，index更新为新位置的下标
                }
                else break;//若已经比排好的部分中某一个数大了，则无需再比较这个数的左边的数了
            }
        }
    }
    public static void main(String[] args) {
        int[] arr1=new int[10];
        int[] arr2=new int[10];
        int[] arr3=new int[10];
        for(int i=0;i<arr1.length;i++){//给arr1赋随机值
            arr1[i]=2*(int)(Math.random()*50+1);
        }
        for(int i=0;i<arr1.length;i++){//复制到arr2,arr3
            arr3[i]=arr2[i]=arr1[i];
        }
        System.out.println(Arrays.toString(arr1));//分别用3种方法排序，并检验结果
        bubbleSort(arr1);
        selectionSort(arr2);
        insertionSort(arr3);
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
        System.out.println(Arrays.toString(arr3));
    }
}
