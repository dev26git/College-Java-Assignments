package PIJL_Assignments.Assignment_5.PIJL5_Part1;

public class Triangle implements Shape{
    float area, perimeter, side1, side2, side3;

    // For Equilateral Triangle
    public Triangle(float side) {
        this.side1 = side;
        this.side2 = side;
        this.side3 = side;
    }

    public Triangle(float side1, float side2, float side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    @Override
    public float calculateArea() {
        // semi-perimeter
        float s = (side1 + side2 + side3) / 2;
        area = (float) Math.sqrt((s * (s-side1) * (s-side2) * (s-side3)));
        return area;
    }

    @Override
    public float calculatePerimeter() {
        perimeter = side1 + side2 + side3;
        return perimeter;
    }

    @Override
    public String toString() {
        return "Circle(" + side1 + "," + side2 + "," + side3 + "," + ")" + " : Area=" + area + ", Perimeter=" + perimeter;
    }
}