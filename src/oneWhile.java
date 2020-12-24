public class oneWhile {

    public static void main(String[] args) {
        int n=1;
        Double sum=1d;
        while ((1.0/(2*n+1))>=0.000001){
            double temp=(1.0/(2*n+1));
            sum+=temp;
            n++;
          //  sum+=(1.0/(2*n+1));
           // n++;
        }
        System.out.println(n);
        System.out.println(sum);

    }
    }

