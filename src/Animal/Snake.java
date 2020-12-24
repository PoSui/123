package Animal;

public class Snake extends Animal{

    public Snake(int legs) {
        super(legs);
    }

    @Override
    public void walk() {
        System.out.println("这条蛇居然有"+leg+"条腿");
    }

    @Override
    public void eat() {
        System.out.println("蛇吃");
    }
}
