
public class SubClass extends BaseClass{
    public String a="hello";
    public void test() {
        System.out.println("子类覆盖父类的方法");
        System.out.println(a.length());
    }
    public static void main(String[] args) {
        new SubClass();
    }
}
class BaseClass{
    public BaseClass() {
       test();
    }
    public void test() {
        System.out.println("将被子类重写的方法");
    }
}


