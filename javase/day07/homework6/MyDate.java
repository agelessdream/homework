package javase.day07.homework6;

public class MyDate {
    int year,month,day;

    public String dateToString() {
        return year+"年"+month+"月"+day+"日";
    }

    public MyDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }
}
