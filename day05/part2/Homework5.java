package day05.part2;

import java.util.Arrays;

//案例需求：已知某个数组中只有1个数字的次数出现奇数次，请找出这个数字

public class Homework5 {
    static void method(int[] arr){//一种笨方法
        int[] arr2= Arrays.copyOf(arr,arr.length);//为了不改变原数组，先复制一份
        Homework1.bubbleSort(arr2);//排序

        for(;arr2.length>0;){//只要数组里还有数，就继续执行
            int count=0,target=arr2[arr2.length-1];//将数组中最后一个数作为目标值
            for(int i=arr2.length-1;i>=0;i--) {//从后向前搜索，用count记录它的出现次数
                if (arr2[i] == target) {
                    count++;
                }else break;//由于已经排序，只要出现一个不是target的数，就说明这个数已经找完了
            }
            if(count%2==1){
                System.out.println("出现奇数次的数是"+target+"，出现次数是"+count);
                return;
            }else {//将arr2中target数剔除
                int[] arr3=Arrays.copyOf(arr2,arr2.length-count);
                arr2=arr3;
            }
        }
        System.out.println("没有出现奇数次的数");
    }

    public static void main(String[] args) {//test
        method(new int[]{2,6,2,5,7,1,2,5,6,1,5,6,1,6,5,7,1});
    }
}
