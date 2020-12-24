/**
 * @author LiLinnan
 * @version 1.0
 * @date 2020/7/31 14:59
 */

public class Main3 {

    public static void main(String[] args) {
        int[][] sparseArr = {
                {10, 10, 4},
                {1, 2, 1},
                {2, 3, 2},
                {3, 4, 3},
                {4, 5, 4}
        };

        System.out.println("稀疏数组为：");
        System.out.println(twoDimensionalArrayToString(sparseArr));

        System.out.println("转成原数组是：");
        int[][] arr = sparseArrToArr(sparseArr);
        System.out.println(twoDimensionalArrayToString(arr));

        System.out.println("再转稀疏数组：");
        System.out.println(twoDimensionalArrayToString(arrToSparseArr(arr)));


        System.out.println("恢复完成");

    }


    private static int[][] sparseArrToArr(int[][] sparseArr) {
        if (sparseArr == null) {
            throw new RuntimeException("数组为null");
        }
        if (sparseArr.length < 1 || sparseArr[0].length != 3) {
            throw new RuntimeException("数据有误，无法执行初始化");
        }
        int validNum = sparseArr[0][2];

        if (sparseArr.length != validNum + 1) {
            throw new RuntimeException("数据校验失败");
        }
        int row = sparseArr[0][0];
        int column = sparseArr[0][1];


        int[][] arr = new int[row][column];
        for (int i = 1; i < sparseArr.length; i++) {
            arr[sparseArr[i][0]][sparseArr[i][1]] = sparseArr[i][2];
        }
        return arr;
    }

    private static int[][] arrToSparseArr(int[][] arr) {
        int validDataNum = 0;
        for (int[] row : arr) {
            for (int val : row) {
                if (val != 0) {
                    validDataNum++;
                }
            }
        }
        int[][] sparseArr = new int[validDataNum + 1][3];
        sparseArr[0][0] = arr.length;
        sparseArr[0][1] = arr.length == 0 ? 0 : arr[0].length;
        sparseArr[0][2] = validDataNum;


        int currentRow = 1;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] != 0) {
                    sparseArr[currentRow][0] = i;
                    sparseArr[currentRow][1] = j;
                    sparseArr[currentRow][2] = arr[i][j];
                    currentRow++;
                }
            }
        }
        return sparseArr;
    }


    private static String twoDimensionalArrayToString(int[][] arr) {
        StringBuilder s = new StringBuilder();
        for (int[] row : arr) {
            for (int val : row) {
                s.append(val).append(" ");
            }
            s.append("\n");
        }
        return s.toString();
    }
}
