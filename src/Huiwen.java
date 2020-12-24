import java.util.Scanner;

public class Huiwen {


    public static void main(String[] args) {
        System.out.println("输入整数：");
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int y=0;
        int huiwen=n;
        //回文数，从后向前取数字，得到的结果和原来的数字一致。
        while(n>0){//1/10=0；
            y=y*10+n%10;//1.y=1 2.y=12
            n=n/10;//1.n=1232 n=123
        }
        if(y==huiwen){
            System.out.println("是回文数");
        }else{
            System.out.println("不是回文数");
        }
            }
    }

