package PIJL_Assignments.Assignment_10;
import java.util.Scanner;

public class MultithreadingDemo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer in range 0-10 :");
        int num  = sc.nextInt();

        Thread factThread = new Factorial(num);
        Thread sumThread = new NaturalNumberSum(num);

        try {
            factThread.start();
            Thread.sleep(500);
            sumThread.start();
            // Wait for threads to join
            factThread.join();
            sumThread.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("\nMain method ended.");
    }
}


class Factorial extends Thread {
    private int num;

    public Factorial(int num) {
        this.num = num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    @Override
    public void run() {
        int fact = 1;
        int temp = num;
        while(temp > 1) {
            fact *= temp--;
            System.out.println("Multiplied factorial with " + (temp + 1));
            // sleep for sometime
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

        System.out.println("\nThe factorial of " + num + " is " + fact);
    }
}


class NaturalNumberSum extends Thread {
    private int num;

    public NaturalNumberSum(int num) {
        this.num = num;
    }

    public void setNum(int num) {
        this.num = num;
    }


    @Override
    public void run() {
        int sum = 0;
        int temp = num;
        while(temp > 0) {
            sum += temp--;
            System.out.println("Added " + (temp + 1) + " to sum.");
            // sleep for sometime
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

        System.out.println("\nThe sum of all natural numbers till " + num + " is " + sum);
    }
}
