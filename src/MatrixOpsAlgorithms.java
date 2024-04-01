import java.util.Arrays;

public class MatrixOpsAlgorithms {

        public static void main(String[] args) {
            int[][] mat = {
                    {1, 0, 0},
                    {0, 1, 0},
                    {0, 0, 1}
            };
            int[][] mat1 = {
                    {1, 0, 1},
                    {4, 5, 6},
                    {1, 2, 3}
            };
            int[][] mat2 = {
                    {1, 1, 1},
                    {2, 3, 1},
                    {1, 5, 1}
            };

//        additionOfTwoMatrix(mat1, mat2);
//        subtractionOfTwoMatrix(mat1, mat2);
//        System.out.println(isIdenticalMatrix(mat));
//        System.out.println(isSparseMat(mat1));
//        System.out.println(areMatricesEqual(mat1, mat2));
//        displayLowerTriangleMat(mat);
//        displayUpperTriangleMat(mat);
//        frequencyOfEvenOdd(mat1);
//        productOfTwoMatrix(mat1, mat2);
        sumOfEachRowAndEachColumnOfMatrix(mat1);
//            transposeOfMat(mat1);
        }
        //    1) Program to calculate the addition of 2 matrices
        public static void additionOfTwoMatrix(int[][] mat1, int[][] mat2){
            if (mat1.length == mat2.length){
                int length = mat1.length;
                int[][] matSum = new int[length][length];

                for (int i = 0; i < length; i++) {
                    for (int j = 0; j < length; j++) {
                        matSum[i][j] = mat1[i][j] + mat2[i][j];
                    }
                }
                System.out.println(Arrays.deepToString(matSum));
            }
            else
                System.out.println("Length of matrix 1 and matrix 2 must be equal.");
        }
        //    2) Program to calculate the subtraction of 2 matrices
        public static void subtractionOfTwoMatrix(int[][] mat1, int[][] mat2){
            if (mat1.length == mat2.length){
                int length = mat1.length;
                int[][] matSub = new int[length][length];

                for (int i = 0; i < length; i++) {
                    for (int j = 0; j < length; j++) {
                        matSub[i][j] = mat1[i][j] - mat2[i][j];
                    }
                }
                System.out.println(Arrays.deepToString(matSub));
            }
            else
                System.out.println("Length of matrix 1 and matrix 2 must be equal.");
        }
        //    3) Program to determine whether a given matrix is an identity matrix
        public static boolean isIdenticalMatrix(int[][] mat){
            for (int i = 0; i < mat.length; i++) {
                for (int j = 0; j < mat.length; j++) {
                    if (i == j && mat[i][j] == 1)
                        continue;
                    if (i != j && mat[i][j] == 0)
                        continue;
                    return false;
                }
            }
            return true;
        }
        //    4) Program to determine whether a given matrix is a sparse matrix
        public static boolean isSparseMat(int[][] mat){
            int zeroElements = 0;
            int totalElement = mat.length*mat[0].length;
            for (int i = 0; i < mat.length; i++) {
                for (int j = 0; j < mat[0].length; j++) {
                    if (mat[i][j] == 0)
                        zeroElements++;
                }
            }
            return zeroElements > totalElement / 2;
        }
        //    5) Program to determine whether two matrices are equal
        public static boolean areMatricesEqual(int[][] mat1, int[][] mat2 ){
            if (mat1.length == mat2.length && mat1[0].length == mat2[0].length){
                for (int i = 0; i < mat1.length; i++) {
                    for (int j = 0; j < mat1[0].length; j++) {
                        if (mat1[i][j] != mat2[i][j])
                            return false;
                    }
                }
            }
            else return false;
            return true;
        }
        //    6) Program to display the lower triangular matrix
        public static void displayLowerTriangleMat(int[][] mat){
            if (mat.length == mat[0].length){
                for (int i = 0; i < mat.length ; i++) {
                    for (int j = 0; j < mat[0].length; j++) {
                        if (i < j && mat[i][j] == 0)
                            System.out.print(" ");
                        else if (i >= j)
                            System.out.print(mat[i][j] + " ");
                    }
                    System.out.println();
                }
            }
        }
        //    7) Program to display the upper triangular matrix
        public static void displayUpperTriangleMat(int[][] mat){
            if (mat.length == mat[0].length){
                for (int i = 0; i < mat.length ; i++) {
                    for (int j = 0; j < mat[0].length; j++) {
                        if (i > j && mat[i][j] == 0)
                            System.out.print("  ");
                        else if (i <= j)
                            System.out.print(mat[i][j] + " ");
                    }
                    System.out.println();
                }
            }
        }
        //    8) Program to find the frequency of odd & even numbers in the given Matrix
        public static void  frequencyOfEvenOdd(int[][] mat){
            int even = 0;
            int odd = 0;

            for (int i = 0; i < mat.length; i++) {
                for (int j = 0; j < mat[0].length; j++) {
                    if (mat[i][j] / 2 == 0 )
                        even++;
                    else
                        odd++;
                }
            }
            System.out.println("Frequency of odd numbers: " + odd);
            System.out.println("Frequency of even numbers: " + even);
        }
        //    9) Program to find the product of two matrices
        public static void productOfTwoMatrix(int[][] mat1, int[][] mat2){
            if (mat1.length == mat2.length){
                int length = mat1.length;
                int[][] matProduct = new int[length][length];

                for (int i = 0; i < length; i++) {
                    for (int j = 0; j < length; j++) {
                        matProduct[i][j] = mat1[i][j] * mat2[i][j];
                    }
                }
                System.out.println(Arrays.deepToString(matProduct));
            }
            else
                System.out.println("Length of matrix 1 and matrix 2 must be equal.");
        }
        //    10) Program to find the sum of each row and each column of a matrix
        public static void sumOfEachRowAndEachColumnOfMatrix(int[][] mat){
            int rowSum;
            int columnSum = 0;

            for (int i = 0; i < mat.length; i++) {
                rowSum = 0;
                for (int j = 0; j < mat[0].length; j++) {
                    rowSum += mat[i][j];
                }
                System.out.println("Sum of " + i + " row: " + rowSum);
            }


            for (int i = 0; i < mat.length; i++) {
                columnSum = 0;
                for (int j = 0; j < mat[0].length; j++) {
                    columnSum += mat[j][i];
                }
                System.out.println("Sum of " + i + " column: " + columnSum);
            }
        }
        //    11) Program to find the transpose of a given matrix
        public static void transposeOfMat(int[][] mat){
            int temp;
            System.out.println("Before transpose.");
            System.out.println(Arrays.deepToString(mat));
            for (int i = 0; i < mat.length; i++) {
                for (int j = 0; j < i; j++) {
                    temp = mat[i][j];
                    mat[i][j] = mat[j][i];
                    mat[j][i] = temp;
                }
            }
            System.out.println("After transpose.");
            System.out.println(Arrays.deepToString(mat));
        }


}
