import java.util.*;

public class Random2 {
    public static void main(String[] args) {
        Set set=new HashSet();
        Set set1=new HashSet();
        List list=new ArrayList();
//        while(set.size()!=20){
//            set.add((int)(Math.random()*100)+1);
//        }
//        System.out.println(set);
//        Iterator iterator=set.iterator();
//        while(iterator.hasNext()){
//            int a= (int) iterator.next();
//            if(a%2==0){
//                list.add(a);
//            }
//        }
//
//        System.out.println(list);
            while(set.size()!=10){
                set.add((int)(Math.random()*20)+1);
            }
            while(set1.size()!=10){
            set1.add((int)(Math.random()*20)+1);
             }
            Iterator iterator=set.iterator();
            while(iterator.hasNext()){
                 int a= (int) iterator.next();
            if(set1.contains(a)){
               list.add(a);
           }
       }
        System.out.println(set);
        System.out.println(set1);
        System.out.println(list);
      }

}
