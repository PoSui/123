package Animal;

public class Cat extends Animal{

    public Cat(int legs) {
        super(legs);
    }

    @Override
    public void walk() {
        System.out.println("这只猫居然有"+leg+"条腿");
    }

    @Override
    public void eat() {
        System.out.println("猫吃");
    }
}
