public class ArrayOpsAlgorithms {

    public static void main(String[] args) {
//        copyElementInAnotherArray();
        int[] array = {1, 2, 3, 4, 2, -7, 8, 8, 3};
//        int[] array = {1, 2, 3, 4, 5};
//        printArray(frequencyOfElementInArray(array));
//        printArray(leftRotatedArray(array, 2));
//        duplicateElementOfArray(array);
//        printArrayInReverseOrder(array);
//        printElementPresentOnEvenPositionOfArray(array);
//        printElementPresentOnOddPositionOfArray(array);
//        System.out.println(largestElementPresentInArray(array));
//        System.out.println(numberOfElementInArray(array));
//        System.out.println(smallestElementPresentInArray(array));
//        System.out.println(sumOfElementsOfArray(array));
//        printArray(rightRotatedElementsOfArray(array, 3));
        printArray(sortedArrayInAscending(array));
//        printArray(sortedArrayInDescending(array));

    }

    //    1) Program to copy all the elements of one array into another array
    public static void copyElementInAnotherArray() {
        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = new int[array1.length];

        System.out.println("Element in array1 : ");
        printArray(array1);
        for (int i = 0; i < array2.length; i++) {
            array2[i] = array1[i];
        }
        System.out.println("Element in array2 : ");
        printArray(array2);
    }

    //    2) Program to find the frequency of each element of an array
    public static int[] frequencyOfElementInArray(int[] array) {
        int element;
        int count;
        int[] frequency = new int[10];

        for (int i = 0; i < array.length; i++) {
            element = array[i];
            count = 0;
            for (int j = i; j < array.length; j++) {
                if (element == array[j])
                    count++;
            }
            if (frequency[element] == 0)
                frequency[element] = count;
        }

        return frequency;
    }

    //    3) Program to left rotate the elements of an array
    public static int[] leftRotatedArray(int[] array, int rotation) {
        int temp;
        int length = array.length;
        if (rotation > length)
            rotation = Math.abs(rotation - length);

        for (int i = 0; i < rotation; i++) {
            temp = array[0];
            for (int j = 0; j < length - 1; j++) {
                array[j] = array[j + 1];
            }
            array[length - 1] = temp;
        }
        return array;
    }

    //    4) Program to print the duplicate elements of an array
    public static void duplicateElementOfArray(int[] array) {
        int[] frequencyOfDuplicateElement = frequencyOfElementInArray(array);

        System.out.println("Duplicate elements.");
        for (int i = 0; i < frequencyOfDuplicateElement.length; i++) {
            if (frequencyOfDuplicateElement[i] > 1)
                System.out.println(i);
        }
    }

    //    5) Program to print the elements of an array
    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    //    6) Program to print the elements of an array in reverse order
    public static void printArrayInReverseOrder(int[] array) {
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i] + " ");
        }
    }

    //    7) Program to print the elements of an array present on even position
    public static void printElementPresentOnEvenPositionOfArray(int[] array) {
        for (int i = 0; i < array.length; i += 2) {
            System.out.print(array[i] + " ");
        }
    }

    //    8) Program to print the elements of an array present on odd position
    public static void printElementPresentOnOddPositionOfArray(int[] array) {
        for (int i = 1; i < array.length; i += 2) {
            System.out.print(array[i] + " ");
        }
    }

    //    9) Program to print the largest element present in an array
    public static int largestElementPresentInArray(int[] array) {
        int largest = array[0];
        for (int i = 1; i < array.length; i++) {
            if (largest < array[i])
                largest = array[i];
        }
        return largest;
    }

    //    10) Program to print the number of elements present in an array
    public static int numberOfElementInArray(int[] array) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            count++;
        }
        return count;
    }

    //    11) Program to print the smallest element present in an array
    public static int smallestElementPresentInArray(int[] array) {
        int smallest = array[0];

        for (int i = 1; i < array.length; i++) {
            if (smallest > array[i])
                smallest = array[i];
        }
        return smallest;
    }

    //    12) Program to print the sum of all the elements of an array
    public static int sumOfElementsOfArray(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum;
    }

    //    13) Program to right rotate the elements of an array
    public static int[] rightRotatedElementsOfArray(int[] array, int rotation) {
        int temp;
        int length = array.length;
        if (rotation > length)
            rotation = Math.abs(rotation - length);

        for (int i = 0; i < rotation; i++) {
            temp = array[array.length - 1];
            for (int j = array.length - 1; j > 0; j--) {
                array[j] = array[j - 1];
            }
            array[0] = temp;
        }
        return array;
    }

    //    14) Program to sort the elements of an array in ascending order
    public static int[] sortedArrayInAscending(int[] array) {
        int temp;
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] > array[j]) {
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        return array;
    }

    //    15) Program to sort the elements of an array in descending order
    public static int[] sortedArrayInDescending(int[] array) {
        int temp;
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] < array[j]) {
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        return array;
    }

}
