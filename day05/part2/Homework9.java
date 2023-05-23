package day05.part2;

import java.util.Arrays;

//案例需求：随机产生10个[0,100）之间整数存储到数组中，
// 找出数组中的两个元素x和y，使得(x - y)绝对值最小。
public class Homework9 {
    public static void main(String[] args) {
        int[] arr=new int[10];
        for (int i=0;i<arr.length;i++){
            arr[i]=(int)(Math.random()*100);
        }
        System.out.println(Arrays.toString(arr));
        Homework1.bubbleSort(arr);
        int x=arr[0],y=arr[1];
        int min=Math.abs(arr[0]-arr[1]);
        for(int i=1;i<arr.length-1;i++){
            if(min>Math.abs(arr[i]-arr[i+1])){
                x=arr[i];y=arr[i+1];
                min=Math.abs(x-y);
            }
        }
        System.out.println("x="+x+",y="+y+"最小距离为"+Math.abs(x-y));
    }
}
