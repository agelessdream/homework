package javase.day02;

public class Day {
    public static void main(String[] args) {
        int week = 2;
        week += 100;
        week %= 7;
        if (week == 0) {
            System.out.println("今天是周二，100天后是周日");
        } else System.out.println("今天是周二，100天后是周" + week);
    }
}
