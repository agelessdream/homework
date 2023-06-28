package javase.day05.part2;

//案例需求：公司年会有一个寻找锦鲤的游戏，每一个员工随意写一个字，如果在“锦鲤”词库中有这个字，
// 那么就奖励500元锦鲤红包，否则就没有，每人只能玩一次。
public class Homework4 {
    static boolean binarySearch(char[] arr, char target) {
        int left=0,right=arr.length-1;
        for(;left<=right;) {
            if(arr[(left+right)/2]==target){
                return true;
            }else if(arr[(left+right)/2]<target){
                left=(left+right)/2+1;
            }else right=(left+right)/2-1;
        }
        return false;
    }
    static boolean linearSearch(char[] arr, char target) {
        for(int i=0;i<arr.length;i++){
            if(arr[i]==target){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        char[] koiFishWords = {'一','今','地','定','尚','年','开','我','果','火','爱','硅','结','花','谷','遍'};
        System.out.println(binarySearch(koiFishWords,'今'));
        System.out.println(binarySearch(koiFishWords,'哈'));
        System.out.println(linearSearch(koiFishWords,'今'));
        System.out.println(linearSearch(koiFishWords,'哈'));
    }
}
