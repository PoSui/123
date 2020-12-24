public class wtf2 {
    private static void swap(int a,int b){
        int temp = a;
        a = b;
        b = temp;
        System.out.println("swap方法中a=" + a + "b=" + b);
    }

    public static void main(String[] args){
        int a = 1;
        int b = 2;
        swap(a, b);
        System.out.println("交换后a=" + a + "b=" + b);

    }



}