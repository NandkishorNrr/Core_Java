import java.util.*;
public class NumberOpsAlgorithms {

        public static void main(String[] args) {
//        System.out.println(isDisariumNumber(115));
//        System.out.println(isHappyNumber(111));
//        System.out.println(isHarshadNum(157));
//        printDisariumNum(100);
//        printHappyNum(100);
//        printPronicNum(100);
//        System.out.println(isDeficient(8));
//        System.out.println(isTwistedPrimeNum(97));
//        printAbundantNum(100);
//        printKaprekarNum(1000);
//        printPrime(100);
//        averageOfN_num();
//        System.out.println(combinationOf_num(10,4));
//        System.out.println(factorial(4));
//        print10PrimeNum();
//        System.out.println(permutation(5, 2));
//        System.out.println(sumOfDigWithoutUsingModulus(12345));
            swapTwoNum(10,20);
        }

        //    1) Program to Check Disarium number
        public static boolean isDisariumNumber(int num){
            Stack<Integer> stack = new Stack<>();
            int count = 1;
            var temp = num;
            int checkNum = 0;

            while (temp != 0){
                stack.push(temp % 10);
                temp = temp / 10;
            }
            while (!stack.empty())
                checkNum = checkNum + (int) Math.pow(stack.pop(), count++);

            return num == checkNum;
        }

        //    2) Program to Check Happy number
        public static boolean isHappyNumber(int n){
            Set<Integer> set = new HashSet<>();
            int happyNum = 0;
            int temp = n;
            while (true) {
                while (temp != 0) {
                    happyNum = (int) (happyNum + Math.pow(temp % 10, 2));
                    temp = temp / 10;
                }

                if (1 == happyNum)
                    return true;
                else if (set.contains(happyNum))
                    return false;
                else {
                    set.add(happyNum);
                    temp = happyNum;
                    happyNum = 0;
                }
            }
        }

        //    3) Program to Check Harshad number
//    A number is said to be the Harshad number if it is divisible by the sum of its digit.
        public static boolean isHarshadNum(int n){
            int temp = n;
            int sumOfDig = 0;

            while (temp != 0){
                sumOfDig = sumOfDig + temp % 10;
                temp = temp / 10;
            }
            return n % sumOfDig == 0;
        }

        //    4) Program to print all Disarium numbers between 1 to 100
        public static void printDisariumNum(int n){
            int temp = 0;

            while (temp++ != n )
                if (isDisariumNumber(temp))
                    System.out.println(temp);
        }

        //    5) Program to print all Happy numbers between 1 to 100
        public static void printHappyNum(int n){
            int temp = 0;

            while (temp++ != n )
                if (isHappyNumber(temp))
                    System.out.println(temp);
        }
        //    6) Program to print all Pronic numbers between 1 to 100
        public static void printPronicNum(int n){
            int pronicNum = 2;
            int count = 2;
            while (pronicNum < n){
                System.out.println(pronicNum);
                pronicNum = (count + 1)*count++;
            }

        }
        //    7) Program to determine whether a given number is a Deficient number
        public static boolean isDeficient(int n){
            int isDificientNum = 0;

            for (int i = 1 ; i < n; i++) {
                if (n % i == 0)
                    isDificientNum += i;
            }
            return isDificientNum < n;
        }

        //    8) Program to determine whether a given number is an abundant number
        public static boolean isAbundant(int n){
            int isAbundant = 0;
            for (int i = 1; i < n; i++) {
                if (n % i == 0)
                    isAbundant += i;
            }
            return isAbundant > n;
        }
        //    9) Program to determine whether a given number is a twisted prime number
        public static boolean isTwistedPrimeNum(int n){
            int temp = n;

            if (isPrime(n))
                return isPrime(reverse(n));
            return false;
        }
        public static boolean isPrime(int n){
            for (int i = 2; i < n; i++) {
                if (n % i == 0)
                    return false;
            }
            return true;
        }
        public static int reverse(int n){
            int reverse = 0;

            while (n != 0){
                reverse = reverse*10 + n % 10;
                n = n / 10;
            }
            return reverse;
        }

        //    10) Program to print all abundant numbers between 1 to 100
        public static void printAbundantNum(int n){
            for (int i = 1; i <= n; i++) {
                if (isAbundant(i)) {
                    System.out.println(i);
                }
            }
        }
        //    11) Program to print all Kaprekar numbers between 1 to 100
        public static void printKaprekarNum(int n){
            if (n > 0)
                for (int i = 1; i <= n; i++) {
                    if (isKaprekarNum(i))
                        System.out.println(i);
                }
        }
        public static boolean isKaprekarNum(int n){
            int sqrOf_n = (int) Math.pow(n, 2);
            int part1;
            int part2;
            int count = 0;
            int temp = sqrOf_n;

            while (temp != 0){
                temp = temp / 10;
                count++;
            }
            temp = sqrOf_n;

            part1 = (int) (temp / Math.pow(10, (count - count / 2)));
            part2 = (int) (temp % Math.pow(10, (count - count / 2)));

            return n == (part1 + part2);
        }
        //    12) Program to print all prime numbers between 1 to 100
        public static void printPrime(int n){
            if (n > 1)
                for (int i = 2; i < n; i++) {
                    if (isPrime(i))
                        System.out.println(i);
                }
        }
        //    13) Program to print the average of n numbers
        public static  void averageOfN_num(){
            Scanner in = new Scanner(System.in);
            int n = 0;
            int count = 0;
            int sumOfNum = 0;

            System.out.println("Enter 'n' numbers - Enter any -ve number to exit.");
            while (n > -1){
                n = in.nextInt();
                if (n < 0 && count != 0){
                    System.out.println("Average is : " + sumOfNum / count);
                }
                if (n < 0)
                    System.out.println("Exit!");
                sumOfNum += n;
                count++;
            }
        }
        //    14) Program to print the combination (nCr) of the given number
        public static int combinationOf_num(int n, int r){
            return factorial(n)/((factorial(r))*factorial(n - r));
        }
        public static int factorial(int  n){
            if (n == 0)
                return 1;
            return n*factorial(n - 1);
        }
        //    15) Program to print the first 10 prime numbers
        public static void print10PrimeNum(){
            int count = 0;
            int n = 2;
            while (count < 10){
                if (isPrime(n)) {
                    System.out.println(n);
                    ++count;
                }
                n++;
            }
        }
        //    16) Program to print the permutation (nPr) of the given number
        public static int permutation(int n, int r){
            return factorial(n)/factorial((n - r));
        }
        //    17) Program to print the sum of digits without using modulus
        public static int sumOfDigWithoutUsingModulus(int n){
            int sum = 0;
            String str = String.valueOf(n);

            for (int i = 0; i < str.length(); i++) {
                sum += (int)str.charAt(i);
                sum = sum - 48;
            }
            return sum;
        }
        //    18) Program to swap two numbers
        public static void swapTwoNum(int a, int b){
            int temp = a;
            System.out.println("Before swapping :\na = " + a +"\nb = " + b);
            a = b;
            b = temp;
            System.out.println("After swapping :\na = " + a +"\nb = " + b);
        }
        //    19) Program to swap two numbers without using the third variable
        public static void swapTwoNumWithoutUseThirdVar(int a, int b){
            System.out.println("Before swapping :\na = " + a +"\nb = " + b);
            a = a + b;
            b = a - b;
            a = a - b;
            System.out.println("After swapping :\na = " + a +"\nb = " + b);
        }

}
