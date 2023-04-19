package PIJL_Assignments.Assignment_5.PIJL5_Part2;
import PIJL_Assignments.Assignment_5.PIJL5_Part2.Package1.*;
import PIJL_Assignments.Assignment_5.PIJL5_Part2.Package2.*;

import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name of employee: ");
        String name = sc.nextLine();
        System.out.println("Enter address of employee: ");
        String address = sc.nextLine();
        System.out.println("Enter basic salary: ");
        double BasicSalary = sc.nextDouble();

        Employee e1 = new NormalEmployee(name, address, BasicSalary);
        System.out.println("Employee 1: " + e1);
        System.out.println("Monthly Salary = " + e1.getMonthlySalary());

        System.out.println("Enter Bonus: ");
        double bonus = sc.nextDouble();
        Employee e2 = new BonusEmployee(name, address, BasicSalary, bonus);
        System.out.println("Employee 2: " + e2);
        System.out.println("Monthly Salary = " + e2.getMonthlySalary());
    }
}