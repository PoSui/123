public class _45545 {
    public static void main(String[] args) {
        Integer i1 = new Integer(97);
        Integer i2 = new Integer(97);
        System.out.println(i1 == i2);//包装类比较地址
        System.out.println(i1.equals(i2));//比较数值
        System.out.println("----------------");
        Integer i3 = new Integer(148);
        Integer i4 = new Integer(148);
        System.out.println(i3 == i4);//越界包装比较地址
        System.out.println(i3.equals(i4));//比较数值
        System.out.println("----------------");
        Integer i5 = 97;
        Integer i6 = 97;
        System.out.println(i5 == i6);//基本数据类型比较数值
        System.out.println(i5.equals(i6));//基本数据类型比较数值
        System.out.println("----------------");
        Integer i7 = 148;
        Integer i8 = 148;
        System.out.println(i7 == i8);//越界自动包装比较地址
        System.out.println(i7.equals(i8));//越界自动包装比较数值
    }

}
