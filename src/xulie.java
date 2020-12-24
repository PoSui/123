public class xulie {
    public xulie(){
        double a=1.0;
        double b=2.0;
        double num=0;
        double temp=0;
        for(int i=0;i<20;i++){
            num+=b/a;
            temp=b;//t=2
            b+=a;//b=3
            a=temp;//a=2
        }
        System.out.println(num);
    }

    public static void main(String[] args) {
        new xulie();
    }
}
