package Geometric;

public class TestCircle {
    public static void main(String[] args) {
        Circle c1=new Circle(5,"red");

        Circle c2=new Circle(2,"blue");
        System.out.println(c1.equals(c2));
        System.out.println(c1.toString());
        System.out.println(c2.toString());
    }
}
