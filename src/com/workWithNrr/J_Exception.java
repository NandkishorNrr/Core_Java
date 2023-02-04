package com.workWithNrr;

import java.util.Scanner;

public class J_Exception {
    public static void main(String[] args) {
        int[] array = {10, 20, 30, 40, 50};
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter index to get value.");
        int index = sc.nextInt();

        try {
            System.out.println(array[index]);
        }
        catch (Exception ex){
            System.out.println("Something went wrong.");
        }
        finally {
            System.out.println("Job Done!");
        }

    }
}
