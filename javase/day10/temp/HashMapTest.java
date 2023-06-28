package javase.day10.temp;

import java.util.HashMap;
import java.util.Objects;

public class HashMapTest {
    public static void main(String[] args) {
        HashMap<Cat,String> map=new HashMap<>();
        Cat c1=new Cat(1001,"AA");
        map.put(c1,"111");
        c1.name="CC";
        System.out.println(map);
        map.put(c1,"222");
        System.out.println(map);
        System.out.println(map.get(c1));
        map.put(new Cat(1001,"AA"),"333");
        System.out.println(map);
        System.out.println(map.get(new Cat(1001, "AA")));
    }
}
class Cat{
    int id;
    String name;


    public Cat(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cat cat = (Cat) o;
        return id == cat.id && Objects.equals(name, cat.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }

    @Override
    public String toString() {
        return "Cat{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}