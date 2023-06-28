package javase.day15.homework2;

public class Test {
    public static void main(String[] args) {
        Coordinate<Double> c1 = new Coordinate<>(123.5, 30.0);
        System.out.println(c1);

        Coordinate<String> c2 = new Coordinate<>("东经123.5°", "北纬30°");
        System.out.println(c2);
    }
}
