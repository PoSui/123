package Teacher;

public class Teacher222 {
    int id;
    int age;
    String name;

    public Teacher222(int id, int age, String name) {
        this.id = id;
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
        return id+"+"+age+"+"+name;
    }
}
