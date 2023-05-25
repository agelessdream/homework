package day05.part2;
//查找数组中个数过半的数字
public class Homework8 {
    static void search(int[] arr){
        Homework1.bubbleSort(arr);
        int target=arr[arr.length/2];
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==target){
                count++;
            }
        }
        if(count>arr.length/2){
            System.out.println("出现次数过半的数是"+target+"出现了"+count+"次");
        }else System.out.println("没有出现次数过半的数");
    }
}
