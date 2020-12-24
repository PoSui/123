import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.*;

public class TreeSetTest1 {
    public static void main(String[] args) {
        Set set1 = new TreeSet();
        Set set2 = new TreeSet(Comparator.reverseOrder());
        set1.add("HashSet");
        set1.add("ArrayList");
        set1.add("TreeMap");
        set1.add("HashMap");
        set1.add("TreeSet");
        set1.add("LinkedList");
        set2.add("HashSet");
        set2.add("ArrayList");
        set2.add("TreeMap");
        set2.add("HashMap");
        set2.add("TreeSet");
        set2.add("LinkedList");
        for (Object obj : set1) {
            System.out.println(obj);
        }
        System.out.println("---------------------------------");
        for (Object obj : set2) {
            System.out.println(obj);
        }
    }
}