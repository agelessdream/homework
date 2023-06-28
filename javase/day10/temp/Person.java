package javase.day10.temp;


public class Person{
    int age;
    final Dog dog;

    public Person(int age,Dog dog) {
        this.age = age;
        this.dog=dog;
    }

    public static void main(String[] args) {
        Dog dog1=new Dog(1);
        Dog dog2=new Dog(2);
        Person p1=new Person(30,dog1);
        dog1.age=3;
        System.out.println(p1.dog.age);
    }
}
class Dog{
    int age;

    public Dog(int age) {
        this.age = age;
    }
}