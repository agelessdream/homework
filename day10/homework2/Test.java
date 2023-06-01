package day10.homework2;


public class Test {
    public static void main(String[] args) {
        Animal[] animals={new Dog(),new Person(),new Dog()};
        for(int i=0;i<animals.length;i++){
            animals[i].eat();
        }
    }
}
abstract class Animal{
    public abstract void eat();
}
class Dog extends Animal{
    public void eat(){
        System.out.println("趴着吃东西");
    }
}
class Person extends Animal{
    @Override
    public void eat() {
        System.out.println("站着吃东西");
    }
}