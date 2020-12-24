public class Test1 {
    public static void main(String[] args) {
        int max;
        int min;

        Inner inner=new Test1().new Inner();//用外部类类对象new内部类对象
        max=inner.a[0];
        min=inner.a[0];
        for(int i=0;i<inner.a.length;i++){
          if(max<inner.a[i]){
              max=inner.a[i];
          }
          if(min>inner.a[i]){
              min=inner.a[i];
          }
        }
        System.out.println("最大值："+max);
        System.out.println("最小值:"+min);

    }

        class Inner{
            int[] a= new int[]{3,32,43,532,423,123,413,534};
        }

}