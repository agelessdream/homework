package day11;

public class Test09 {
    public static int k = 0;
    public static Test09 t1 = new Test09("t1");//静态块 构造块 1:t1i=
    public static Test09 t2 = new Test09("t2");
    public static int i = print("i");
    public static int n = 99;

    public int j = print("j");
    {
        print("构造块");
    }

    static{
        print("静态块");
    }
    public Test09(String str){
        System.out.println((++k) + ":" + str + "  i=" + i + "  n=" + n);
        ++n;
        ++i;
    }
    public static int print(String str){
        System.out.println((++k) + ":" + str + "  i=" + i + "  n=" + n);
        ++n;
        return ++i;
    }
    public static void main(String[] args) {

    }
}