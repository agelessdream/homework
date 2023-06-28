package javase.day08.homework2;

public class Programmer extends Employee{
    private String programmingLanguage="java";

    public Programmer() {
    }

    public Programmer(int number, int age, String name, double salary, String programmingLanguage) {
        super(number, age, name, salary);
        this.programmingLanguage = programmingLanguage;
    }

    public String getProgrammingLanguage() {
        return programmingLanguage;
    }

    public void setProgrammingLanguage(String programmingLanguage) {
        this.programmingLanguage = programmingLanguage;
    }

    @Override
    public String getInfo() {
        return super.getInfo()+"\t编程语言:"+programmingLanguage;
    }
}
