
public class ChildClass extends FatherClass {
    public ChildClass() {
        super();
        System.out.println("ChildClass Create");
    }
    public static void main(String[] args) {
        FatherClass fc = new FatherClass();
        ChildClass cc = new ChildClass();
    }
}