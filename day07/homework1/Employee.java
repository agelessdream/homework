package day07.homework1;
//（1）声明员工类Employee，包含属性：编号、姓名、年龄、薪资，
//（2）在测试类的main方法中，创建2个员工对象，并为属性赋值，并打印两个员工的信息。
public class Employee {
    int number,age;
    String name;
    double salary;

    public Employee(int number, int age, String name, double salary) {
        this.number = number;
        this.age = age;
        this.name = name;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "number=" + number +
                ", age=" + age +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }

    public static void main(String[] args) {
        System.out.println(new Employee(1, 23, "张三", 10000).toString());
        System.out.println(new Employee(2, 24, "李四", 11000).toString());
    }
}
