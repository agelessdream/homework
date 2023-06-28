package javase.day08.homework2;

public class Designer extends Programmer{
    private double bonus;

    public Designer() {
    }

    public Designer(int number, int age, String name, double salary, String programmingLanguage, double bonus) {
        super(number, age, name, salary, programmingLanguage);
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    @Override
    public String getInfo() {
        return super.getInfo()+"\t奖金："+bonus;
    }
}
