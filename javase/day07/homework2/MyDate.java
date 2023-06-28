package javase.day07.homework2;

public class MyDate {
    int year,month,day;

    public MyDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    @Override
    public String toString() {
        return "MyDate{" +
                "year=" + year +
                ", month=" + month +
                ", day=" + day +
                '}';
    }

    public static void main(String[] args) {
        System.out.println(new MyDate(1998,1,1).toString());
        System.out.println(new MyDate(2023,5,17).toString());
        System.out.println(new MyDate(2023,12,1).toString());
    }
}
