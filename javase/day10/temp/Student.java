package javase.day10.temp;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Student {
    String name;
    int age;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return age == student.age && Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return name+age;
    }

    public static void main(String[] args) {
        Map<Student,String> map=new HashMap<>();
        Student s1=new Student("张三",23);
        map.put(s1,"001");
        s1.age=25;
        System.out.println(map.get(s1));
        System.out.println();


        Map<String,Integer> map2=new HashMap<>();
        String str1="111";
        map2.put(str1,888888);
        str1="222";
        System.out.println(map2.get(str1));
        System.out.println(map2.get("111"));
        System.out.println(map2.get("222"));
    }
}
