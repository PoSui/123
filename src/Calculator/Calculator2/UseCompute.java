package Calculator.Calculator2;

public class UseCompute {
    public void useCom(Compute com,int one,int two){
        int jieguo=0;
        if(com instanceof cheng){
            jieguo =one*two;
        }else if(com instanceof chu){
            jieguo =one/two;
        }else if(com instanceof jia){
            jieguo =one+two;
        }else if (com instanceof jian){
            jieguo =one-two;
        }else {
            System.out.println("爬爬爬");
        }
        System.out.println(jieguo);
    }
}
