package Teacher;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetTest {
    public static void main(String[] args) {
        Comparator comparator=new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                Teacher222 t1=(Teacher222)o1;
                Teacher222 t2=(Teacher222)o2;
                if (t1 == null || t2==null) {
                    throw new NullPointerException("不能和null比");
                }
                int result = t1.name.compareTo(t2.name);
                if (result != 0) {
                    return result;
                }

                if (t1.age != t2.age) {
                    return t1.age - t2.age;
                }

                return t1.age - t2.id;
            }
        };
        TreeSet<Teacher222> set=new TreeSet(comparator);
        set.add(new Teacher222(1,20,"tom"));
        set.add(new Teacher222(2,21,"tom1"));
        set.add(new Teacher222(3,22,"tom2"));
        set.add(new Teacher222(4,23,"tom3"));
        set.add(new Teacher222(5,24,"tom4"));
        for(Object obj:set) {
            System.out.println(obj);
        }
    }

}
