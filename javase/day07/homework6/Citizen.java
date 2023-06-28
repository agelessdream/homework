package javase.day07.homework6;

public class Citizen {
    String name,id;
    MyDate birthday;

    public Citizen(String name, String id, MyDate birthday) {
        this.name = name;
        this.id = id;
        this.birthday = birthday;
    }
    String getInfo() {
        return "Citizen{" +
                "name='" + name + '\'' +
                ", id='" + id + '\'' +
                ", birthday=" + birthday.dateToString() +
                '}';
    }

    public void setBirthday(MyDate birthday) {
        this.birthday = birthday;
    }
}
