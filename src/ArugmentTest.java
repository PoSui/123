 public class ArugmentTest {
//        static class IntA {
//            private int a;
//            public IntA(int a) {
//                this.a = a;
//            }
//                public int getA(){
//                    return a;
//                }
//                public void setA(int a){
//                    this.a = a;
//                }
//            }
//
//            static public void change(int a) {
//                a = 3;
//            }
//
//            static public void change(IntA a) {
//                a.setA(3);
//            }
//
//            static public void changeRef(IntA a) {
//                a = new IntA(9);
//
//        }
//            public static void main(String[] args) {
//                int a= 2;
//                change(a);
//                System.out.print(a);
//                IntA ia= new IntA(5 );
//                change(ia); //ia的 属性a的值设为3
//                System.out.print(ia.getA());
//                changeRef(ia); //对象类型传引用，还原来的对象
//                System .out.println(ia.getA());
//          }
public static void main(String[] args) {
    String s1 = "HelloWorld";
    String s2 = new String("HelloWorld");
    if (s1 == s2) {
        System.out.println("s1 == s2");
    } else {
        System.out.println("s1 != s2");
    }
    if (s1.equals(s2)) {
        System.out.println("s1 equals s2");
    } else {
        System.out.println("s1 not equals s2");
    }

}
        }
