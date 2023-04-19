package PIJL_Assignments.Assignment_6.PIJL6_Part2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Result result;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter name of Student:");
        String name = sc.nextLine();
        System.out.print("Enter prn of Student:");
        long prn = sc.nextLong();
        System.out.print("Enter mark1 of Student:");
        float mark1 = sc.nextFloat();
        System.out.print("Enter mark2 of Student:");
        float mark2 = sc.nextFloat();

        result = new Result(prn, name, mark1, mark2);
        System.out.println("Percentage = " + result.percentCal() + "%");
    }
}
