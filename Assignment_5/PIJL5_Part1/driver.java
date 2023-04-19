package PIJL_Assignments.Assignment_5.PIJL5_Part1;
import java.util.*;
// Driver class for implementation classes of Shape interface
public class driver {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Square
        System.out.println("Enter side of square: ");
        float side = sc.nextFloat();
        Square sq = new Square(side);
        sq.calculateArea();
        sq.calculatePerimeter();
        System.out.println(sq);

        // Circle
        System.out.println("\nEnter radius of circle: ");
        float radius = sc.nextFloat();
        Circle c = new Circle(radius);
        c.calculateArea();
        c.calculatePerimeter();
        System.out.println(c);

        // Triangle
        System.out.println("\nEnter sides of triangle: ");
        float side1 = sc.nextFloat();
        float side2 = sc.nextFloat();
        float side3 = sc.nextFloat();
        Triangle t = new Triangle(side1, side2, side3);
        t.calculateArea();
        t.calculatePerimeter();
        System.out.println(t);
    }
}
