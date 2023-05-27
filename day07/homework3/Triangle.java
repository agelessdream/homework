package day07.homework3;

public class Triangle {
    double a,b,c;

    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    boolean isTriangle(){
        double max=Math.max(Math.max(a,b),c);
        return a+b+c-max>max&&a>0&&b>0&&c>0;
    }
    boolean isRightTriangle(){
        return (isTriangle())&&((a*a+b*b==c*c)||(a*a+c*c)==b*b||(b*b+c*c==a*a));
    }
    boolean isIsoscelesTriangle(){
        return (isTriangle())&&(a==b||a==c||b==c);
    }
    boolean isEquilateralTriangle(){
        return isTriangle()&&a==b&&b==c;
    }
    double area(){
        if(!isTriangle()) return 0;
        double p=0.5*(a+b+c);
        return Math.sqrt(p*(p-a)*(p-b)*(p-c));
    }
    double perimeter(){
        if(!isTriangle()) return 0;
        return a+b+c;
    }

    public static void main(String[] args) {
        Triangle triangle=new Triangle(3,4,5);
        System.out.println(triangle.isTriangle());
        System.out.println(triangle.isIsoscelesTriangle());
        System.out.println(triangle.isRightTriangle());
        System.out.println(triangle.isEquilateralTriangle());
        System.out.println(triangle.area());
        System.out.println(triangle.perimeter());
    }
}