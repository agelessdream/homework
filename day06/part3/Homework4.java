package day06.part3;
//有n级台阶，一次只能上1级或2级，共有多少种走法？
public class Homework4 {
    static int step(int n){
        if(n==1)return 1;//若最后只剩1级台阶，则这一次只有1种走法
        if(n==2)return 2;//若最后剩2级台阶，则这一次有2种走法
        return step(n-1)+step(n-2);//每一次走，都有两条分支
    }

    public static void main(String[] args) {
        long time1 = System.currentTimeMillis();
        System.out.println(step(40));
        long time2 = System.currentTimeMillis();
        System.out.println(time2-time1);
    }
}
