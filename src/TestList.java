import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class TestList {
    public static void main(String[] args) {
        List list=new ArrayList();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(1,4);
        List list1=new ArrayList();
        list1.add(2);
        list1.add(3);
        list1.add(4);
        list1.add(6);
        list1.add(7);
        for (Object obj:
             list1) {
            if(list.contains(obj)){

            }else {
                list.add(obj);
            }
        }
        System.out.println(list);
       System.out.println("第一种方式："+list.toString());
//        System.out.println("第二种方式："+list.subList(0,list.size()));
//        System.out.print("第三种方式:");
//        for (Object obj:
//             list) {
//            System.out.print(obj);
//        }
//        System.out.println();
//        Iterator iterator=list.iterator();
//        System.out.print("第四种方式:");
//        while(iterator.hasNext()){
//            System.out.print(iterator.next());
//        }
    }

}
