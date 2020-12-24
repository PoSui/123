public class Father {
    private String name="zhangjun";

    class Child{

        public void introFather(){
            System.out.println(Father.this.name);
        }
    }
}
class Test{
    public static void main(String[] args) {
        Father f=new Father();
        Father.Child c= f.new Child();//先new父类对象，再用父类对象new子类对象
        c.introFather();
    }
}
