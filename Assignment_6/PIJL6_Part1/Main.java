package PIJL_Assignments.Assignment_6.PIJL6_Part1;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Growable_stack gstack = new Growable_stack();
        Scanner sc = new Scanner(System.in);
        for(int i=0; i<4; i++) {
            System.out.print("Enter a number to add into stack:");
            gstack.push(sc.nextInt());
        }
        System.out.println();
        gstack.displayTop();
        int popped = gstack.pop();
        System.out.println("Popped " + popped);

        System.out.println("\nPrinting Stack:");
        gstack.displayStack();
    }
}