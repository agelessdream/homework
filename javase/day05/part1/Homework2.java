package javase.day05.part1;
//扑克牌
public class Homework2 {
    public static void main(String[] args) {
        String[] s1={"黑桃","红桃","梅花","方块"};
        String[] s2={"A","2","3","4","5","6","7","8","9","10","J","Q","K"};
        for(int i=0;i<s1.length;i++){
            for (int j=0;j<s2.length;j++){
                System.out.print(s1[i]+s2[j]+"\t");
            }
            System.out.println();
        }
    }
}
