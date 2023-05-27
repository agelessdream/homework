package day08.homework3;

public class Rectangle extends Graphic{
    private double width,height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public double getArea() {
        return width*height;
    }

    @Override
    public double getPerimeter() {
        return (width+height)*2;
    }

    @Override
    public String getInfo() {
        return "类型：矩形\t"+"长为"+width+"，宽为"+height+super.getInfo();
    }
}
