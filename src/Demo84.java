public class Demo84 {
    public static void main(String[] args) {
        String str1 = "hello";
        String str2 = "hello";
        String str3 = new String("hello");
        String str4 = new String("hello");
        String str5 = "hellohello";
        String str6 = str1 + str2;
        System.out.println("str1==str2?" + (str1 == str2));//t
        System.out.println("str2==str3?" + (str2 == str3));//f
        System.out.println("str3==str4?" + (str3 == str4));//f
        System.out.println("str2.equals(str3)?" + (str2.equals(str3)));//t
        System.out.println("str3.equals(str4)?" + (str3.equals(str4)));//t
        System.out.println(str5.equals(str6));//t
        System.out.println(str5 == str6);//f
       // --------------------------------------------------
        String s1 = "helloworld";
        String s2 = "hello";
        String s3 = "world";
        String s4 = "hello" + "world";
        String s5 = s2 + s3;
        String s6 = new String("helloword");
        String s7 = "hello" + new String("world");
        System.out.println(s1 == s4);//t
        System.out.println(s1 == s5);//f
        System.out.println(s1 == s6);//f
        System.out.println(s1 == s7);//f
    }
}
