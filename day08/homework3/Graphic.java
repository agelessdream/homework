package day08.homework3;

public abstract class Graphic {
    public Graphic() {
    }

    public abstract double getArea();
    public abstract double getPerimeter();
    public String getInfo(){
        return "面积：" + getArea() + "，周长：" + getPerimeter();
    };
}
