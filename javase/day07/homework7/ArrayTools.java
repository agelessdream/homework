package javase.day07.homework7;

public class ArrayTools {
    int max(int[] arr){
        int max=arr[0];
        for(int i=1;i<arr.length-1;i++){
            max=Math.max(max,arr[i]);
        }
        return max;
    }
    int valueCount(int[] arr, int value){
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==value)count++;
        }
        return count;
    }
    int[] maxIndex(int[] arr){
        int max=max(arr);
        int temp=0;
        int maxCount=valueCount(arr,max);
        int[] index=new int[maxCount];
        for(int i=0;i<arr.length;i++){
            if(arr[i]==max)index[temp]=i;
            temp++;
        }
        return index;
    }
    void sort(int[] arr){
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
    void reverse(int[] arr, int start, int end){
        for(;start<end;start++,end--){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
        }
    }
    int[] copyOf(int[] arr, int newLength){
        int[] arr2=new int[newLength];
        for(int i=0;i<Math.min(newLength,arr.length);i++){
            arr2[i]=arr[i];
        }
        return arr2;
    }
    boolean equals(int[] arr1, int[] arr2){
        if(arr1.length!=arr2.length)return false;
        for(int i=0;i<arr1.length;i++){
            if(arr1[i]!=arr2[i])return false;
        }
        return true;
    }
    void fill(int[] arr, int start, int end,  int value){
        for(int i=start;i<=end;i++){
            arr[i]=value;
        }
    }
    String toString(int[] arr){
        String s="{"+arr[0];
        for(int i=1;i<arr.length;i++){
            s+=(","+arr[i]);
        }
        s+="}";
        return s;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,10,4,5,10,7,8,9,10};
        ArrayTools arrayTools=new ArrayTools();
        System.out.println(arrayTools.max(arr));
        System.out.println(arrayTools.valueCount(arr, 10));
    }
}
