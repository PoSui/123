package EnumTest;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.HashMap;
import java.util.Map;

public enum test {
    MONDAY,TUESDAY,WEDNESDAY,THURSDAY,FRIDAY,SATURDAY,SUNDAY;
    Map map=new HashMap();
    test(){
        map.put("MONDAY","周一");
        map.put("TUESDAY","周二");
        map.put("WEDNESDAY","周三");
        map.put("THURSDAY","周四");
        map.put("FRIDAY","周五");
        map.put("SATURDAY","周六");
        map.put("SUNDAY","周日");
    }
//    public void setMap(){
//        map.put("MONDAY","周一");
//        map.put("TUESDAY","周二");
//        map.put("WEDNESDAY","周三");
//        map.put("THURSDAY","周四");
//        map.put("FRIDAY","周五");
//        map.put("SATURDAY","周六");
//        map.put("SUNDAY","周日");
//    }
    public String getname(){
        return name()+"的中文名称是"+map.get(name());
    }
//    test(Map map) {
//        map.put(MONDAY,"星期一");
//        map.put(TUESDAY,"星期二");
//        map.put(WEDNESDAY,"星期三");
//        map.put(THURSDAY,"星期四");
//        map.put(FRIDAY,"星期五");
//        map.put(SATURDAY,"星期六");
//        map.put(SUNDAY,"星期日");
//    }

//    public String toString(){
//        return this.name()+"的中文为："+map.get(this.name());
//    }

}
