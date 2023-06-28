package javase.day07.homework5;

public class ArrayTools {
    int sum(int[] arr){
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
        }
        return sum;
    }
    int max(int[] arr){
        int max=arr[0];
        for(int i=1;i<arr.length-1;i++){
            max=Math.max(max,arr[i]);
        }
        return max;
    }
    int indexOf(int[] arr, int value){//查找value在arr数组中第一次出现的下标，如果不存在返回-1
        for(int i=0;i<arr.length;i++){
            if(arr[i]==value)return i;
        }
        return -1;
    }
    int lastIndexOf(int[] arr, int value){
        for(int i=arr.length-1;i>=0;i--){
            if(arr[i]==value)return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,10,4,5,10,7,8,9,10};
        System.out.println(new ArrayTools().sum(arr));
        System.out.println(new ArrayTools().max(arr));
        System.out.println(new ArrayTools().indexOf(arr,10));
        System.out.println(new ArrayTools().lastIndexOf(arr,10));
    }
}
