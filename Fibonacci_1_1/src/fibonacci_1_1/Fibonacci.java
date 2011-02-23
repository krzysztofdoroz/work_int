/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package fibonacci_1_1;

/**
 *
 * @author krzysztof
 */
class smallMatrix {

    int[][] matrix;
}

public class Fibonacci {

    private static int rfib(int n) {

        if (n == 0 || n == 1) {
            return 1;
        } else {
            return rfib(n - 1) + rfib(n - 2);
        }
    }

    private static int ifib(int n) {

        int a = 1;
        int b = 1;
        int tmp;

        for (int i = 0; i < n; i++) {
            a = a + b;
            tmp = a;
            a = b;
            b = tmp;

        }

        return a;
    }

    private static int mfib(int n) {
        int result = 0;

        int[][] matrix = new int[2][2];

        matrix[0][0] = 1;
        matrix[0][1] = 1;
        matrix[1][0] = 1;
        matrix[1][1] = 0;

        int[][] fibMatrix = matrixMultiply(matrix, n);

        System.out.println(fibMatrix[0][0]);
        System.out.println(fibMatrix[0][1]);
        System.out.println(fibMatrix[1][0]);
        System.out.println(fibMatrix[1][1]);

        return result;
    }

    public static void main(String[] args) {

        System.out.println("fib(2):" + rfib(2));
        System.out.println("fib(3):" + rfib(3));
        System.out.println("fib(4):" + rfib(4));
        System.out.println("fib(2):" + ifib(2));
        System.out.println("fib(3):" + ifib(3));
        System.out.println("fib(4):" + ifib(4));
        System.out.println("fib(4):" + ifib(4000));
       // System.out.println("fib(2):" + mfib(2));
        System.out.println("fib(5):" + mfib(11));

    }

    private static int[][] matrixMultiply(int[][] m, int n) {

        if (n == 1) {
            return m;
        } else if (n == 0) {

            int[][] id = new int[2][2];

            id[0][0] = 1;
            id[0][1] = 0;
            id[1][0] = 0;
            id[1][1] = 1;

            return id;

        } else if (n % 2 == 0) {

            int[][] tmp = matrixMultiply(m, n/2);
            return mulMatrix(tmp, tmp, 2);

        } else if (n % 2 == 1){
            int[][] tmp = matrixMultiply(m, n/2);
            int[][] tmp2 = mulMatrix(tmp, m, 2);

            return mulMatrix(tmp, tmp2, 2);
        }

        return null;
    }

    //myltiplying 2x2 square matrices
    private static int[][] mulMatrix(int[][] a, int[][] b, int n) {

        int[][] result = new int[n][n];

        result[0][0] = a[0][0] * b[0][0] + a[1][0]*b[1][0];
        result[0][1] = a[0][0] * b[0][1] + a[0][1]*b[1][1];
        result[1][0] = a[1][0] * b[0][0] + a[1][1]*b[1][0];
        result[1][1] = a[1][0] * b[0][1] + a[1][1]*b[1][1];

        return result;
    }
}
