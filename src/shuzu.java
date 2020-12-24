import java.util.Arrays;
import java.util.Scanner;

public class shuzu {

    public int[] copy(int[] src) {
        int[] newArr = new int[src.length * 2];
        System.arraycopy(src, 0, newArr, 0, src.length);
        return newArr;
    }

    public void max(int[] src) {
        int max = 0;
        for (int i = 1; i < src.length; i++) {
            if (src[max] < src[i]) {
                max = i;
            }

        }
        System.out.println(src[max]);
    }

    public void min(int[] src) {
        int min = 0;
        for (int i = 1; i < src.length; i++) {
            if (src[min] > src[i]) {
                min = i;
            }

        }
        System.out.println(src[min]);
    }

    public void sort(int[] arr) {
        //冒泡
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    arr[j] = arr[j] ^ arr[j + 1];
                    arr[j + 1] = arr[j] ^ arr[j + 1];
                    arr[j] = arr[j] ^ arr[j + 1];
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    public void test(int[] arr) {
        //排序
        int now = 0;  //最小值现在的下标
        int should = 0; //最小值应该在的下标
        for (int i = 0; i < arr.length - 1; i++) {
            now = i;
            should = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[now]) {
                    now = j;
                }
            }
            if (now != should) {
                int temp = arr[now];
                arr[now] = arr[should];
                arr[should] = temp;
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    public void shengchengshuzu() {
        boolean flag=false;
        System.out.println("输入一个100以内整数：");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] arr = new int[20];
        int i;
        for (i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 100 )+1;
        }
        for (i = 0; i < arr.length; i++) {
          //  System.out.print(arr[i] + ",");
            if(n==arr[i]){
                flag=true;
                System.out.println("结果存在,位置是" + (i + 1));
            }
        }
        for (i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ",");
        }
        System.out.println();
       // System.out.println("i="+i);
        if(flag==false) {
            System.out.println("结果不存在");
        }
    }
    public void ascii() {
        int count = 0;
        // System.out.println((char)32);
        for (int i = 32; i <= 126; i++) {
            char a = (char) i;
            if (i < 100) {
                System.out.print("0" + i + "=" + a + "  ");
            } else {
                System.out.print(i + "=" + a + "  ");
            }
            count++;
            if (count % 8 == 0) {
                System.out.println();
            }
        }
    }
    public void charupaixu ( int[] src){//4，3，2，1
        //第一轮3421
        //第二轮2341
        //第三轮1234
        int i;
        int now = 0;
        int should=0;
        for (i = 1; i < src.length; i++) {
            for (int j = 0; j < src.length; j++) {
                if(src[j]>src[i]){
                    now=i;
                }
            int temp=src[now];
                src[should]=src[now];
                src[now]=temp;
            }

        }


    }

    public void insertion(int[] arr){//{4, 521, 1321, 66}
        int should=-1;
        int nowValue=-1;
        int i;
        for(i=1;i<arr.length;i++){
            nowValue=arr[i];
            should=i;
            for(int j=i-1;j>=0;j--){
                if(arr[j]>nowValue){
                    arr[j+1]=arr[j];
                    should=j;
                }else {
                    break;
                }
            }
            if(should!=i){
                arr[should]=nowValue;
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    public void yanghui(int line){
        int[][] arr=new int[line][];

        for(int i=1;i<=line;i++){
            // System.out.println("第"+i+"在这里");
            for(int j=1;j<=line-i;j++){
                System.out.print(" ");
            }

        for( i=0;i<arr.length;i++){
            arr[i]=new int[i+1];
            for(int j=0;j<arr[i].length;j++){
                if(j==0 || j==arr[i].length-1){
                    arr[i][j]=1;
                }else{
                    arr[i][j]=arr[i-1][j]+arr[i-1][j-1];
                }
            }
        }
        for ( i=0;i<arr.length;i++){
            System.out.println(Arrays.toString(arr[i]));

        }
    }
}

public void test2(int... a){
    System.out.println("hello");

}




















    public static void main(String[] args) {
        shuzu s1 = new shuzu();
        int arr[] = {4, 521, 1321, 66, 5325, 523, 123, 41, 32132, 555};
        //int[] arrs2 = s1.copy(arr);
        //for(int i=0;i<arrs2.length;i++){
        //    System.out.println(arrs2[i]);
        //  }
      //  s1.sort(arr);
      //  s1.test(arr);
      //  s1.max(arr);
      //  s1.min(arr);
        // System.out.print(arr.toString());

     //   String[] s = {"hello", "word", "!"};
      //  for (int a = 0; a < s.length; a++) {
       //     System.out.println(s[a]);
      //  }
      //  int[] arr1= {1,2,3};
      //  for (int i : arr1) {
      //      i=4;
      //      System.out.println(i);
       // }
      //  System.out.println(arr1[0]);
        //s1.shengchengshuzu();
           // s1.ascii();
      /*  System.out.println(4>5 ^ 'c'>'a');//相同为0 不同为1
        int c=5;
        int d=10;
        if(c>4 || ++d > 10) {
            System.out.println("c的值是"+c+"d的值是"+d);
        }*/
      //s1.test(arr);
     s1.insertion(arr);
        //s1.yanghui(5);
        //s1.test2(arr);
    }

}


