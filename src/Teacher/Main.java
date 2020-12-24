package Teacher;

import java.util.Set;
import java.util.TreeSet;

/**
 * @author LiLinnan
 * @version 1.0
 * @date 2020/8/6 15:01
 */

public class Main {
    public static void main(String[] args) {

        System.out.println("----1----");
        TreeSet<Teacher> set1 = new TreeSet<>();
        addData(set1);
        set1.forEach(System.out::println);

        System.out.println("----2----");
        TreeSet<Teacher> set2 = new TreeSet<>(Teacher::compareTo);
        addData(set2);
        set2.forEach(System.out::println);


    }

    private static void addData(Set<Teacher> set) {
        set.add(new Teacher("123", "aaa", 18));
        set.add(new Teacher("124", "bbb", 18));
        set.add(new Teacher("125", "ccc", 18));
        set.add(new Teacher("126", "ddd", 18));
        set.add(new Teacher("127", "eee", 18));
        set.add(new Teacher("128", "fff", 18));
        set.add(new Teacher("129", "ccc", 18));
        set.add(new Teacher("130", "ccc", 19));
        set.add(new Teacher("131", "ccc", 18));
        set.add(new Teacher("132", "ccc", 21));
    }
}
