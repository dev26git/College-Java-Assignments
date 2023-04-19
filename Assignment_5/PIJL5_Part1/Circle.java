package PIJL_Assignments.Assignment_5.PIJL5_Part1;

public class Circle implements Shape{
    float area, perimeter, radius;
    public Circle(float radius) {
        this.radius = radius;
    }

    @Override
    public float calculateArea() {
        area = (float)(Math.PI * radius * radius);
        return area;
    }

    @Override
    public float calculatePerimeter() {
        perimeter = (float) (2 * Math.PI * radius);
        return perimeter;
    }

    @Override
    public String toString() {
        return "Circle(" + radius + ")" + " : Area=" + area + ", Perimeter=" + perimeter;
    }
}
