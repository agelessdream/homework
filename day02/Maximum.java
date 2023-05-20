package day02;

public class Maximum {
    public static void main(String[] args) {
        int x=(int) (10*Math.random());
        int y=(int) (10*Math.random());
        int z=(int) (10*Math.random());
        int max=x<y?y:x;
        max=max<z?z:max;
        System.out.println(x+","+y+","+z+"中的最大值为"+max);
    }
}
