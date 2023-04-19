package PIJL_Assignments.Assignment_5.PIJL5_Part1;

public class Square implements Shape{
    float area, perimeter, side;
    public Square(float side) {
        this.side = side;
    }

    @Override
    public float calculateArea() {
        area = side * side;
        return area;
    }

    @Override
    public float calculatePerimeter() {
        perimeter = 4 * side;
        return perimeter;
    }

    @Override
    public String toString() {
        return "Square(" + side + ")" + " : Area=" + area + ", Perimeter=" + perimeter;
    }
}
