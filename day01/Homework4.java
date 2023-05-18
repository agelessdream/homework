package day01;

public class Homework4{
    double radius;
    double PI=3.14;
    public Homework4(double radius){
        this.radius=radius;
    }
    public void display(){
        System.out.println("半径为"+radius+"，面积为"+PI*radius*radius);
    }

    public static void main(String[] args){
        new Homework4(1.2).display();
        new Homework4(2.5).display();
        new Homework4(6).display();
    }
}