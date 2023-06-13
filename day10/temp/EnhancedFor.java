package day10.temp;

public class EnhancedFor<E> {
    E name;
}
class Sub<E,T> extends EnhancedFor<E>{
    T age;
}
class Sub2<E> extends EnhancedFor<E>{

}
class Test2{
    public static void main(String[] args) {
        EnhancedFor<String> a1=new EnhancedFor<>();
        EnhancedFor<Integer> a2=new EnhancedFor<>();
        String s=a1.name;
        Integer s2=a2.name;
        System.out.println(s);
        System.out.println(s2);

        Sub<Integer,String> sub=new Sub<>();
        Integer s3=sub.name;
    }
}
