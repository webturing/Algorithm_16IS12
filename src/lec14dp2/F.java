package lec14dp2;

public class F {
    public static void main(String[] args) {
        int[] matrixChain = {30, 35, 15, 5, 10, 20, 25};
        matrixMultiply(matrixChain);
    }

    //矩阵连乘
    public static void matrixMultiply(int[] matrixChain) {
        int dimension = matrixChain.length;
        int[][] timeResult = new int[dimension][dimension];
        matrixMultiply(matrixChain, timeResult);
        System.out.println(timeResult[1][dimension - 1]);
    }

    //矩阵连乘
    public static void matrixMultiply(int[] matrixChain, int[][] timeResult) {
        //timeResult 存放次数结果，矩阵的的行与列以1开始
        int n = matrixChain.length - 1;
        for (int i = 1; i <= n; i++)  //初始化矩阵
            timeResult[i][i] = 0;
        for (int r = 2; r <= n; r++)  //从列号的第二位开始
            for (int i = 1; i <= n - r + 1; i++) {   //i为行号
                int j = i + r - 1;  //j为列号
                timeResult[i][j] = timeResult[i + 1][j] + matrixChain[i - 1] * matrixChain[i] * matrixChain[j];
                for (int k = i + 1; k < j; k++) { //
                    int temp = timeResult[i][k] + timeResult[k + 1][j] + matrixChain[i - 1] * matrixChain[k] * matrixChain[j];
                    if (temp < timeResult[i][j]) {    //寻找最小值
                        timeResult[i][j] = temp;
                    }
                }
            }
    }
}