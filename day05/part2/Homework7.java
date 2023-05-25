package day05.part2;
//现有一个长度为10的整数数组{26,67,49,38,52,66,7,71,56,87}。
//现在需要对元素重新排列，使得所有的奇数保存到数组左边，所有的偶数保存到数组右边。
import java.util.Arrays;

public class Homework7 {
    static void sort(int[] arr){
        int[] arr2=new int[arr.length];//创建新数组
        int oddIndex=-1,evenIndex=arr.length;
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2==1){
                oddIndex++;//奇数从前往后放入新数组
                arr2[oddIndex]=arr[i];
            }else {
                evenIndex--;//偶数从后往前放入新数组
                arr2[evenIndex]=arr[i];
            }
        }
        for(int i=0;i<arr.length;i++){//新数组赋给原数组
            arr[i]=arr2[i];
        }
    }

    public static void main(String[] args) {
        int[] x={26,67,49,38,52,66,7,71,56,87,100,18};
        sort(x);
        System.out.println(Arrays.toString(x));
    }
}
