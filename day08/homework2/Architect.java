package day08.homework2;

public class Architect extends Designer{
    private int stock;

    public Architect() {
    }

    public Architect(int number, int age, String name, double salary, String programmingLanguage, double bonus, int stock) {
        super(number, age, name, salary, programmingLanguage, bonus);
        this.stock = stock;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    @Override
    public String getInfo() {
        return super.getInfo()+"\t股票数"+stock;
    }
}
