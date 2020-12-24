package Animal;

public abstract class Animal {
    int leg;
    public Animal(int legs){
        this.leg=legs;
    }
    public abstract void walk();
    public abstract void eat();
}
