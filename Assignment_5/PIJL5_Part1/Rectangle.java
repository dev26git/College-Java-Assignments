package PIJL_Assignments.Assignment_5.PIJL5_Part1;

public class Rectangle implements Shape{
    float area, perimeter, length, breadth;
    public Rectangle(float length, float breadth) {
        this.length = length;
        this. breadth = breadth;
    }

    @Override
    public float calculateArea() {
        area = length * breadth;
        return area;
    }

    @Override
    public float calculatePerimeter() {
        perimeter = 2 * (length + breadth);
        return perimeter;
    }

    @Override
    public String toString() {
        return "Rectangle(" + length + "," + breadth + ")" + " : Area=" + area + ", Perimeter=" + perimeter;
    }
}