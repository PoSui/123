import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class StringTest {

    public static void main(String[] args) {
        String s="aabbddccaefdd";
        Map map=new HashMap();
        for(int i=0;i<s.length();i++){
            if(!map.containsKey(s.charAt(i))) {
                map.put(s.charAt(i),1);
            }else{
                map.put(s.charAt(i),((int)map.get(s.charAt(i)))+1);
            }
        }
       Set set = map.entrySet();
        for(Object obj: set){
            System.out.println(obj);
        }
    }
}
