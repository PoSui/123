

public class hello {


    public void star(){
        int li=5;

        for(int i=1;i<=li;i++){
           // System.out.println("第"+i+"在这里");
            for(int j=1;j<=li-i;j++){
                System.out.print(" ");
            }
            for(int a=1;a<=2*i-1;a++){
                System.out.print("*");
                //System.out.println("第"+a+"次");
            }
            System.out.print("\n");
        }
    }

    public void unstar(){
        int li=5;
       // int li2=li;
        for(int i=1;i<=li;i++){
            // System.out.println("第"+i+"在这里");
            for(int j=1;j<=i-1;j++){
                System.out.print(" ");
               // System.out.println("第"+j+"在这里");
            }
            for(int a=1;a<=(2*li-2*i+1);a++){  //  1=9  2=7 3=5 4=3 5=1 1=1 2=3 3=5 4=7 5=9
                System.out.print("*");

             //   System.out.println("第"+li2+"次");
            }
            System.out.print("\n");

        }
    }

    public void table(){
        for(int i=1;i<=9;i++){
            for(int j=1;j<=i;j++){
                System.out.print(i+"*"+j+"="+i*j+" ");
                if(j==i){
                    System.out.println("");
                }
            }

        }
    }

    public void sushu(){
        int num=0;
        for(int i=101;i<=200;i++){
            int j;
            for(j=2;j < i;j++){
                if(i%j==0){
                    break;
                }
            }
            if(j==i){
                num++;
                System.out.println(i);
            }
        }
        System.out.println(num);
    }

    private static boolean isPrimary(int num){
        if(num < 2){
            return false;
        }
        for(int i = 2; i <= Math.sqrt(num); i++){
            if(num % i == 0){
                return false;
            }
        }
        return true;
    }



    public static void main(String[] args) {
       /* for (int i=1; i<=6;i++){
            int a=(int)(Math.random()*26+97);
            char s = 0;
            s=(char)a;
            System.out.print(s);
        }*/
          hello h1=new hello();
        // h1.star();
        // h1.unstar();
           // h1.table();

     /*   int count = 0;
        for(int i = 101; i<=200; i++){
            if(isPrimary(i)){
                count++;
                System.out.println(i);
            }
        }
        System.out.println(count);
        */

     h1.sushu();
    }



}
