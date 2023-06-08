package day15.homework1;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class Test {
    public static void main(String[] args) {
        Set<Student> set=new TreeSet<>();
        set.add(new Student("liusan",20,90.0));
        set.add(new Student("lisi",22,90.0));
        set.add(new Student("wangwu",20,99.0));
        set.add(new Student("sunliu",22,100.0));
        for(Student s:set){
            System.out.println(s);
        }

        Set<Student> set222=new TreeSet<>(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });
        set222.addAll(set);
        for(Student s:set222){
            System.out.println(s);
        }
    }
}
