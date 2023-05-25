package day06.part2;

public class Count {
    public static long  sum(int...  nums){
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
        }
        return sum;
    }
    public static int max( int... others){
        int max=others[0];
        for(int i=1;i<others.length;i++){
            max=Math.max(max,others[i]);
        }
        return max;
    }
    public static String concat(String...  strings){
        String s=strings[0];
        for(int i=1;i<strings.length;i++){
            s+=strings[i];
        }
        return s;
    }
    public static boolean isEven(int... nums){
        for(int i=0;i<nums.length;i++){
            if(nums[i]%2==1) return false;
        }
        return true;
    }
}
