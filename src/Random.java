import java.util.HashSet;
import java.util.Set;

public class Random {
    public static void main(String[] args) {
        Set set=new HashSet();
        while(set.size()!=10){
            set.add((int)(Math.random()*20)+1);
        }
        System.out.println(set);
    }

}
