package javase.day08.homework3;

public class Circle extends Graphic{
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return radius*radius*Math.PI;
    }

    @Override
    public double getPerimeter() {
        return 2*radius*Math.PI;
    }

    @Override
    public String getInfo() {
        return "类型：圆\t半径：" + radius + "," + super.getInfo();
    }
}
