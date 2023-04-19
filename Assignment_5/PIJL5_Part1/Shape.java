package PIJL_Assignments.Assignment_5.PIJL5_Part1;


/*
All methods of interface are abstract by default, no need to write abstract
First letter capital
All declared variables are final by default
 */

/*
Part 1: Implement the generic Shapes class as an interface s so that we can implement concrete classes like circle, triangle, rectangle class from it.
 */
public interface Shape{
    float calculateArea();
    float calculatePerimeter();
}
