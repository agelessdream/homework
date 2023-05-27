package day08.homework3;

public class Test {
    public static boolean equalsArea(Graphic g1, Graphic g2){
        return g1.getArea() == g2.getArea();
    }
    public static Graphic getMax(Graphic g1, Graphic g2){
        return g1.getArea() > g2.getArea() ? g1 : g2;
    }

    public static void main(String[] args) {
        Circle c1 = new Circle(2);
        Rectangle r1 = new Rectangle(2, 3);
        Triangle t1 = new Triangle(3, 4, 5);
        System.out.println("c1的面积：" + c1.getArea());
        System.out.println("r1的面积：" + r1.getArea());
        System.out.println("t1的面积：" + t1.getArea());

        System.out.println("c1和r1的面积是否相等：" + equalsArea(c1, r1));
        System.out.println("c1和t1的面积是否相等：" + equalsArea(c1, t1));
        System.out.println("r1和t1的面积是否相等：" + equalsArea(r1, t1));

        System.out.println("c1和r1中面积大的是：" +getMax(c1,r1).getInfo());
        System.out.println("c1和t1中面积大的是：" +getMax(c1,t1).getInfo());
        System.out.println("r1和t1中面积大的是：" +getMax(t1,r1).getInfo());
    }
}
