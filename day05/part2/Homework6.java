package day05.part2;

//判断数组中是否存在一个值，其左侧的值累加加和等于其右侧的值累加和(当前值计入左侧)，
// 如果存在，返回下标，如果不存在，返回-1
public class Homework6 {
    //参考答案的思路
    static int getBalanceIndex(int[] arr) {
        for (int balanceIndex = 0; balanceIndex < arr.length; balanceIndex++) {
            int leftSum = 0;
            int rightSum = 0;
            for (int i = 0; i < balanceIndex; i++) {
                leftSum += arr[i];
            }
            for (int i = balanceIndex + 1; i < arr.length; i++) {
                rightSum += arr[i];
            }
            if (leftSum == rightSum) {
                return balanceIndex;
            }
        }
        return -1;
    }
    /*参考答案可优化的点：
    1.balanceIndex可以初始化为数组长度的一半，若leftSum<rightSum，则balanceIndex向右移动，否则向左移动
    2.balanceIndex每次移动后，leftSum和rightSum无需重新求和计算，只需加上或减去移动的那一个数即可
    3.若leftSum<rightSum，且在某次移动后leftSum>rightSum，则不存在平衡数，可以立即结束。反之亦然。
    以下为优化后的方法*/
    static int getBalanceIndex2(int[] arr) {
        int balanceIndex = arr.length/2;
        int leftSum=0,rightSum=0;
        for(int i=0;i<=balanceIndex;i++){
            leftSum+=arr[i];
        }
        for(int i=balanceIndex+1;i<arr.length;i++){
            rightSum+=arr[i];
        }
        if(leftSum<rightSum){
            for(;leftSum<rightSum;){
                balanceIndex++;
                leftSum+=arr[balanceIndex+1];
                rightSum-=arr[balanceIndex+1];
                if(leftSum==rightSum){
                    return balanceIndex;
                }
            }
        }else if(leftSum>rightSum){
            for(;leftSum>rightSum;){
                balanceIndex--;
                leftSum-=arr[balanceIndex];
                rightSum+=arr[balanceIndex];
                if(leftSum==rightSum){
                    return balanceIndex;
                }
            }
        }else return balanceIndex;
        return -1;
    }
    //另一种思路。遍历数组arr，将前n项的和记录到sum数组中，同时求arr的和
    //再遍历sum数组，看看sum中是否存在arr和的一半，以下为实现方法
    static int getBalanceIndex3(int[] arr){
        int[] sum=new int[arr.length];
        sum[0]=arr[0];
        for(int i=1;i<arr.length;i++){
            sum[i]=sum[i-1]+arr[i];
        }
        double target=sum[arr.length-1]*0.5;
        //由于sum是有序数组，可以使用二分查找
        int left=0,right=sum.length-1;
        for(;left<=right;) {
            if(sum[(left+right)/2]==target){
                return (left+right)/2;
            }else if(sum[(left+right)/2]<target){
                left=(left+right)/2+1;
            }else right=(left+right)/2-1;
        }
        return -1;
    }
}
