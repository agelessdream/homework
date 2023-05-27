package day08.homework1;

import java.util.Arrays;

public class Triangle {
    private double a,b,c;

    public Triangle() {
    }

    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }
    public double getPiremeter(){
        return a+b+c;
    }
    public double getArea(){
        double p=0.5*(a+b+c);
        return Math.sqrt(p*(p-a)*(p-b)*(p-c));
    }

    @Override
    public int hashCode() {//？
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
        if (getClass() != obj.getClass()) return false;
        double[] arr={a,b,c};
        double[] arr2={((Triangle)obj).a,((Triangle)obj).b,((Triangle)obj).c};
        Arrays.sort(arr);
        Arrays.sort(arr2);
        return Arrays.equals(arr,arr2);
    }

    @Override
    public String toString() {
        return "边长分别为"+a+b+c;
    }
}
