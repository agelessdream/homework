package temp;

import java.util.HashSet;
import java.util.Objects;

public class HashSetTest {
    public static void main(String[] args) {
        HashSet<Man> set=new HashSet<>();
        System.out.println(set);
        Man m1=new Man(1001,"AA");
        set.add(m1);
        System.out.println(set);
        m1.name="CC";
        System.out.println(set);
        set.add(new Man(1001,"CC"));
        System.out.println(set);
        set.add(new Man(1001,"AA"));
        System.out.println(set);

    }
}
class Man{
    int id;
    String name;

    public Man(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Man man = (Man) o;
        return id == man.id && Objects.equals(name, man.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }

    @Override
    public String toString() {
        return "Man{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}