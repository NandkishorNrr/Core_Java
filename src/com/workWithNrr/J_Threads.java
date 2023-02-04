package com.workWithNrr;

//If the class extends the Thread

public class J_Threads extends Thread {
    public static int amount = 0;
    public static void main(String[] args) {
        J_Threads obj = new J_Threads();
        System.out.println(amount);
        obj.start();
//        System.out.println("This code is running out side of the thread.");
        while (obj.isAlive()){
            System.out.println("Waiting...");
        }
        System.out.println(amount);
        amount++;
        System.out.println(amount);
//        expected amount 1 but it gives 2

    }

    public void run() {
//        System.out.println("This code running in thread.");
        amount++;
    }
}
//If the class implements the Runnable interface,
/*public class J_Threads implements Runnable {
    public static void main(String[] args) {
        J_Threads obj = new J_Threads();
        Thread thread = new Thread(obj);
        thread.start();
        System.out.println("This code is running out side of the thread.");
    }

    public void run() {
        System.out.println("This code running in thread.");
    }
}*/
