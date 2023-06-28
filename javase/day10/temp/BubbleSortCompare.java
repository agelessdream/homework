package javase.day10.temp;

import java.util.Arrays;

//比较优化后与优化前的执行时间
public class BubbleSortCompare {
    static void bubbleSort(int[] arr) {
        int count = 0;
        for (int i = arr.length - 1; i > 0; i--) {
            count++;
            for (int j = 0; j < i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        System.out.println("不优化后的趟数" + count);
    }
    static void bubbleSort2(int[] arr) {//优化
        int count = 0;
        for (int i = arr.length - 1; i > 0; i--) {
            boolean flag = true;
            count++;
            for (int j = 0; j < i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    flag = false;//只要发生了交换，就改为false
                }
            }
            if (flag) {
                break;//若一轮下来还是true，则这一轮没有发生交换，说明已经排好序，于是结束外层循环
            }
        }
        System.out.println("优化后的趟数" + count);
    }

    public static void main(String[] args) {
        int[] arr1 = new int[100000];

        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = (int) (Math.random() * 5555);
        }

        int[]arr2= Arrays.copyOf(arr1,arr1.length);
        long time1 = System.currentTimeMillis();
        bubbleSort(arr1);
        long time2 = System.currentTimeMillis();
        bubbleSort2(arr2);
        long time3 = System.currentTimeMillis();
        System.out.println((time2 - time1) + "毫秒");
        System.out.println( (time3 - time2) + "毫秒");
    }
}
