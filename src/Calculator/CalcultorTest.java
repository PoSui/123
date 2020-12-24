package Calculator;

import java.util.Scanner;

public class CalcultorTest implements Calculator{

    @Override
    public double jisuan(String x,double a,double b) {
        double jieguo = 0.0;
        switch(x){
            case "+":
                jieguo=a+b;
                break;
            case "-":
                jieguo=a-b;
                break;
            case "*":
                jieguo=a*b;
                break;
            case "/":
                jieguo=a/b;
                break;
            default:
                System.out.println("会不会写加减乘除？");
                break;
        }
        return jieguo;
    }

    public static void main(String[] args) {
        System.out.println("输入第一个数");
        Scanner s=new Scanner(System.in);
        double a=s.nextDouble();
        System.out.println("输入第二个数");
        double b=s.nextDouble();
        System.out.println("输入你要计算的类型：+ — * /");
        String str=s.next();
        if(b==0 && "/".equals(s)){
            System.out.println("?????????????????????????????");
            System.exit(0);
        }
        CalcultorTest calcultorTest=new CalcultorTest();
        System.out.println("结果是"+calcultorTest.jisuan(str,a,b));
    }
}
