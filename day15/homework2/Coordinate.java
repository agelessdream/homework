package day15.homework2;

public class Coordinate<T>{
    private T x,y;

    public Coordinate(T x, T y) {
        this.x = x;
        this.y = y;
    }

    public Coordinate() {
    }

    @Override
    public String toString() {
        return "Coordinate{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }

    public T getX() {
        return x;
    }

    public void setX(T x) {
        this.x = x;
    }

    public T getY() {
        return y;
    }

    public void setY(T y) {
        this.y = y;
    }
}
