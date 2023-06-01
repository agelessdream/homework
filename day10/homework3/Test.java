package day10.homework3;

public class Test {
    public static void main(String[] args) {
        Person[] people={new Chinese(),new American(),new Indian()};
        for(int i=0;i<people.length;i++){
            people[i].eat();
        }
    }
}
abstract class Person{
    public abstract void eat();
}
class Chinese extends Person{
    @Override
    public void eat() {
        System.out.println("用筷子吃饭");
    }
}
class American extends Person{
    @Override
    public void eat() {
        System.out.println("用刀叉吃饭");
    }
}
class Indian extends Person{
    @Override
    public void eat() {
        System.out.println("用手抓饭");
    }
}
