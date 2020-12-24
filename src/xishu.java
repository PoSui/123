

import java.util.Arrays;

public class xishu {

    public int[][] xishu() {
        int[][] oldarr = new int[11][11];
        int[] hang = new int[oldarr.length];
        int[] lie = new int[oldarr.length];
        int[] zhi = new int[oldarr.length];
        oldarr[1][2] = 1;
        oldarr[2][3] = 2;
        oldarr[4][5] = 2;
        //   System.out.println(oldarr.length);
        System.out.println("原数组为：");
        for (int i = 0; i < oldarr.length; i++) {
            System.out.println(Arrays.toString(oldarr[i]));
        }
        int count = 0;

        for (int q = 0; q < oldarr.length; q++) {
            for (int w = 0; w < oldarr.length; w++) {
                if (oldarr[q][w] != 0) {
                    hang[count] = q;
                    lie[count] = w;
                    zhi[count] = oldarr[q][w];

               /* System.out.print("hang的数据"+hang[count]);
                System.out.println();
                System.out.print("lie的数据"+lie[count]);
                System.out.println();
                System.out.print("zhi的数据"+zhi[count]);
                System.out.println();*/

                    count++;
                }
            }
        }
        //System.out.println(count);
        int[][] newarr = new int[count + 1][3];
        newarr[0][0] = oldarr.length;
        newarr[0][1] = oldarr.length;
        newarr[0][2] = count;
        System.out.println("稀疏数组为");
       // System.out.println(newarr.length);
        System.out.println(Arrays.toString(newarr[0]));
        for (int e1 = 1; e1 <= newarr.length; e1++) {
            newarr[e1][0] = hang[e1 - 1];
            newarr[e1][1] = lie[e1 - 1];
            newarr[e1][2] = zhi[e1 - 1];
            System.out.println(Arrays.toString(newarr[e1]));
            if (e1 == 3) {
                break;
            }
        }

        return newarr;
    }

    public void huifu(int[][] arr){
        int[][] huifu=new int[arr[0][0]][arr[0][1]];
        for(int i=1;i<arr.length;i++){
            int hang=arr[i][0];
            int lie =arr[i][1];
            int zhi =arr[i][2];
            huifu[hang][lie]=zhi;
        }
        System.out.println("恢复的数组为:");
        for(int e=0;e<huifu.length;e++){
            System.out.println(Arrays.toString(huifu[e]));
        }

    }

    public static void main(String[] args) {
        xishu xs=new xishu();
        int[][] xsarr=new int[4][3];
        xsarr=xs.xishu();
       // System.out.println(xsarr.length);
        /*for (int i=0;i<xsarr.length;i++){
        System.out.println(Arrays.toString(xsarr[i]));
        }*/
        xs.huifu(xsarr);
    }
}
