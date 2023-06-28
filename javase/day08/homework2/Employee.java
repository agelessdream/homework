package javase.day08.homework2;

public class Employee {
    private int number,age;
    private String name;
    private double salary;

    public Employee(int number, int age, String name, double salary) {
        this.number = number;
        this.age = age;
        this.name = name;
        this.salary = salary;
    }

    public Employee() {
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    public String getInfo(){
        return "姓名："+name+"\t年龄："+age+"\t工号："+number+"\t薪资："+salary;
    }
}
