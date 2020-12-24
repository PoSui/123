import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class queryCoding {

    public void queryCoding(String sArg){
        int count=0;
        String regEx = "[\\u4e00-\\u9fa5]";//所有汉字的正则表达
        Pattern p = Pattern.compile(regEx);
        Matcher m = p.matcher(sArg);
        System.out.println("提取出来的中文有：");
        //System.out.println(m.groupCount());

        while (m.find()) {
            System.out.print(m.group());
            System.out.println(cnToUnicode(m.group()));

        }
        System.out.println();
    }
    private static String unicodeToCn(String unicode) {
        /** 以 \ u 分割，因为java注释也能识别unicode，因此中间加了一个空格*/
        String[] strs = unicode.split("\\\\u");
        String returnStr = "";
        // 由于unicode字符串以 \ u 开头，因此分割出的第一个字符是""。
        for (int i = 1; i < strs.length; i++) {
            returnStr += (char) Integer.valueOf(strs[i], 16).intValue();
        }
        return returnStr;
    }

    private static String cnToUnicode(String cn) {
        char[] chars = cn.toCharArray();//数组大小改变为char类型大小
        String returnStr = "";
        for (int i = 0; i < chars.length; i++) {
            returnStr += "\\u" + Integer.toString(chars[i], 16);
        }
        return returnStr;
    }

    public static void main(String[] args){
        queryCoding q=new queryCoding();
        q.queryCoding("Internet网络is真解放的期望123165的期望 very  good ^_^!");

    }
}
