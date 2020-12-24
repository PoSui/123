import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class TestCollection {
    private static void shuchu(Collection<? extends Number> c){
        for(Object obj:c){
            System.out.println(obj);
        }
    }

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        shuchu(list);
    }
}
