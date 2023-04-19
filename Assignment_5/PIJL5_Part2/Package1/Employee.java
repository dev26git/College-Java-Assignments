package PIJL_Assignments.Assignment_5.PIJL5_Part2.Package1;

// Abstraction Demo

public abstract class Employee {
    private String name, address;
    protected double BasicSalary;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getBasicSalary() {
        return BasicSalary;
    }

    public void setBasicSalary(double basicSalary) {
        BasicSalary = basicSalary;
    }

    public abstract double getMonthlySalary();
}
