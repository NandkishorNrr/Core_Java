import java.util.Arrays;

public class RecursionOpsAlgorithms {

    public static void main(String[] args) {

        int[] array = {5, 6, 4, 2, 3, 1, 7, 5};
        System.out.println(factorial(4));
        fibonacciSeries(10);
        System.out.println(fib(7));
        printToFroNum(5);
        selectionSort(array, 0, array.length);
        System.out.println(Arrays.toString(selectionSort(array)));
        System.out.println(Arrays.toString(array));
        System.out.println(set2P1(6));
        set2P2(2);
        set3P1(3);
        set3P2(100);
        set4P1(4);

    }


    public static int factorial(int n) {
        if (n == 0 || n == 1)
            return 1;
        return n * factorial(n - 1);
    }

    public static void fibonacciSeries(int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(fib(i) + " ");
        }
    }

    public static int fib(int n) {
        if (n == 0)
            return 0;
        if (n == 1 || n == 2)
            return 1;
        else {
            int tem = fib(n - 1) + fib(n - 2);
            return tem;
        }
    }

    public static void printToFroNum(int n) {
        if (n == 0) {
            System.out.print(0 + " ");
            return;
        }
        System.out.print(n + " ");
        printToFroNum(n - 1);
        System.out.print(n + " ");
    }

    //    Recursively solve
    public static void selectionSort(int[] array, int start, int end) {
        if (start == end)
            return;

        int minIndex = min(array, start, end);
        swap(array, start, minIndex);
        selectionSort(array, start + 1, end);
    }

    //    Iteratively solve
    public static int[] selectionSort(int[] array) {
        int start;
        int end = array.length;
        int minIndex;
        for (int i = 0; i < array.length; i++) {
            start = i;
            minIndex = min(array, start, end);
            swap(array, i, minIndex);
        }
        return array;
    }

    private static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    private static int min(int[] array, int start, int end) {
        int minValue = array[start];
        int minIndex = start;
        for (int i = start + 1; i < end; i++) {
            if (minValue > array[i]) {
                minValue = array[i];
                minIndex = i;
            }
        }
        return minIndex;
    }

    public static int set2P1(int n) {
        if (n == 0)
            return 1;
        else
            return 1 + set2P1(n / 2);
    }

    public static void set2P2(int n) {
        if (n == 0)
            return;
        set2P2(n / 2);
        System.out.println(n % 2);
    }

    public static void set3P1(int n) {
        if (n > 1)
            set3P1(n - 1);
        for (int i = 0; i < n; i++) {
            System.out.print(" * ");
        }
    }

    public static void set3P2(int n) {
        if (n <= 0)
            return;
        if (n > 1000)
            return;
        System.out.print(String.format("%d", n));
        set3P2(2 * n);
        System.out.print(String.format("%d", n));
    }

    public static void set4P1(int n) {
        if (n > 0) {
            set4P1(n - 1);
            System.out.print(n + " ");
            set4P1(n - 1);
        }
    }
}
