package Animal;

public class AnimalTest {

    public static void main(String[] args) {
        Animal a=new Cat(8);
        Animal b=new Snake(8);
        Animal c=new Fish(8);
        a.eat();
        a.walk();
        b.eat();
        b.walk();
        c.eat();
        c.walk();
    }
}
