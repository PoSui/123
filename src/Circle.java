import java.util.Arrays;
import java.util.Scanner;

public class Circle {

    public void circle(){

        try{
            System.out.println("输入整数：");
            Scanner scanner=new Scanner(System.in);
            int n=scanner.nextInt();

        if(n==1){
            System.out.println("留下的人是1");
            return;
        }else if(n>0) {
            int[] cir = new int[n];
            for (int j = 0; j < n; j++) {
                cir[j] = j + 1;
            }
            int len = cir.length;
            int count = 0;//用来每次循环寻找不是0的下标，每找到一个就++
            int count2 = n;//用来表示数组中非0数字的个数

            while (count2 > 1) {
                for (int x = 0; x < len; x++) {
                    if (cir[x] != 0) {
                        count++;
                        if (count % 3 == 0) {
                            cir[x] = 0;
                            count2--;
                            //   System.out.println(count2);
                            //if(count2==2){
                            //   break;
                            // }
                            //
                        }
                    }
                }
                System.out.println(Arrays.toString(cir));
            }

     //   System.out.println(count2);
      //  System.out.println(Arrays.toString(cir));
      //  System.out.println(count);
        for(int q=0;q<len;q++){
            if(cir[q]!=0){
                System.out.println("剩余的号码是"+cir[q]);
            }
        }
        }
        }catch(Exception e){
            System.out.println("输入整数？");
            this.circle();
        }

    }

    public static void main(String[] args) {
        Circle c=new Circle();
        c.circle();
    }
}
