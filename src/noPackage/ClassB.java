package noPackage;

public class ClassB implements InterfaceA{
    @Override
    public int method(int n) {
        int sum=1;
        while(n>0){
            sum*=n;
            n--;
        }
        System.out.println(sum);
        return sum;
    }

    public static void main(String[] args) {
        ClassB b=new ClassB();
        b.method(3);
    }
}
