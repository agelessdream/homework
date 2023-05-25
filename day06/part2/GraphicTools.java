package day06.part2;
//声明一个图形工具类GraphicTools，包含如下方法，并在main方法里调用：
//1、public static void printRectangle()：该方法打印5行5列*矩形
//2、public static void printRectangle(int line, int column, String sign)：该方法打印line行colomn列由sign组成的矩形
//3、public static double getTriangleArea(double base, double height)：根据底边和底边对应的高求三角形面积
//4、public static double getTriangleArea(double a, double b, double c)：根据三角形的三条边求三角形面积，如果a,b,c不能组成三角形，打印不能组成三角形，并返回0.0
public class GraphicTools {
    public static void printRectangle(){
        for(int i=0;i<5;i++){
            for(int j=0;j<5;j++){
                System.out.println("*");
            }
        }
    }
    public static void printRectangle(int line, int column, String sign) {
        for(int i=0;i<line;i++){
            for(int j=0;j<column;j++){
                System.out.println(sign);
            }
        }
    }
    public static double getTriangleArea(double base, double height){
        return 0.5*base*height;
    }
    public static double getTriangleArea(double a, double b, double c){
        double max=Math.max(Math.max(a,b),c);
        if(a+b+c-max>max){
            double p=0.5*(a+b+c);
            return Math.sqrt(p*(p-a)*(p-b)*(p-c));
        }
        System.out.println("不能组成三角形");
        return 0;
    }
}
