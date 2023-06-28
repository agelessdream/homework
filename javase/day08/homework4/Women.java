package javase.day08.homework4;

public class Women extends Person{
    @Override
    public void eat() {
        System.out.println("女人吃饭");
    }

    @Override
    public void toilet() {
        System.out.println("上女厕所");
    }
    public void makeup(){
        System.out.println("化妆");
    }
}
