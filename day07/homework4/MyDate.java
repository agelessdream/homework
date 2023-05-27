package day07.homework4;

public class MyDate {
    int year,month,day;

    public MyDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }
    boolean isLeapYear(){
        return year%4==0&&year%100!=0||year%400==0;
    }
    String monthName(){
        String[] monthName={"January","February","March","April", "May",
                "June","July","August","September","October","November","December"};
        return monthName[month-1];
    }
    int totalDaysOfMonth(){
        switch (month){
            case 2:return (year%4==0&&year%100!=0||year%400==0)?29:28;
            case 4,6,9,11:return 30;
            default:return 31;
        }
    }
    int totalDaysOfYear(){
        return (year%4==0&&year%100!=0||year%400==0)?366:365;
    }
    int daysOfTheYear(){
        int days=0;
        for(int i=1;i<month;i++){
            switch (month){
                case 2:days+=((year%4==0&&year%100!=0||year%400==0)?29:28);break;
                case 4,6,9,11:days+=30;break;
                default:days+=31;
            }
        }
        days+=day;
        return days;
    }

    public static void main(String[] args) {
        MyDate d=new MyDate(2023,5,26);
        System.out.println(d.isLeapYear());
        System.out.println(d.monthName());
        System.out.println(d.totalDaysOfMonth());
        System.out.println(d.totalDaysOfYear());
        System.out.println(d.daysOfTheYear());
    }
}
