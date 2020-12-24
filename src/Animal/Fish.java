package Animal;

public class Fish extends Animal{

    public Fish(int legs) {
        super(legs);
    }

    @Override
    public void walk() {
        System.out.println("这条鱼居然有"+leg+"条腿");
    }

    @Override
    public void eat() {
        System.out.println("鱼吃");
    }
}
