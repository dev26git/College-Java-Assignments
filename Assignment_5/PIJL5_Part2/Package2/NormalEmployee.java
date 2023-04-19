package PIJL_Assignments.Assignment_5.PIJL5_Part2.Package2;

import PIJL_Assignments.Assignment_5.PIJL5_Part2.Package1.Employee;

public class NormalEmployee extends Employee {
    public NormalEmployee(String name, String address, double BasicSalary) {
        setName(name);
        setAddress(address);
        setBasicSalary(BasicSalary);
    }

    @Override
    public double getMonthlySalary() {
        return BasicSalary;
    }

    public String toString() {
        return "Employee('" + getName() + "', " + getAddress() + ")";
    }
}