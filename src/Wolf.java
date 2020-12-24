public class Wolf extends Animal{
    public Wolf() {
        super("灰太狼",10);
        System.out.println("wolf的无参构造");
    }
    public static void main(String[] args) {
        new Wolf();
    }
}
class Creature{
    public Creature() {
        System.out.println("Creature的无参构造器");
    }
}
class Animal extends Creature{
    public Animal(String name) {
        System.out.println("Animal的单参构造器"+"名字是"+name);
    }
    public Animal(String name,int age) {
        this(name);
        System.out.println("Animal的两参构造器"+"年龄是"+age);
    }
}
