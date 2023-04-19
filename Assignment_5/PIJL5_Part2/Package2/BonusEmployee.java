package PIJL_Assignments.Assignment_5.PIJL5_Part2.Package2;

import PIJL_Assignments.Assignment_5.PIJL5_Part2.Package1.Employee;

public class BonusEmployee extends Employee {
    private double bonus;
    public BonusEmployee(String name, String address, double BasicSalary, double bonus) {
        setName(name);
        setAddress(address);
        setBasicSalary(BasicSalary);
        setBonus(bonus);
    }

    @Override
    public double getMonthlySalary() {
        return BasicSalary + getBonus();
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public String toString() {
        return "Employee('" + getName() + "', " + getAddress() + ")";
    }
}