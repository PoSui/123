import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class TestMap {

    public static void main(String[] args) {
        Map map=new HashMap<>();
        map.put("香蕉",5.6);
        map.put("樱桃",25);
        map.put("桃子",5.6);
        map.put("苹果",2.3);
        Set set = map.entrySet();
        System.out.println(map.keySet());
        if(set.iterator().hasNext()){
            System.out.println(set);
        }

        map.put("香蕉",10.9);
        map.remove("桃子");
        for(Object obj:set){
            System.out.println(obj);
        }
    }
}
