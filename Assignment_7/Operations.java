package PIJL_Assignments.Assignment_7;

// This class defines the operations that can be performed on RationalNumber
public class Operations {

    // Add 2 RationalNumber objects
    public static RationalNumber add(RationalNumber r1, RationalNumber r2) {
        RationalNumber sum = new RationalNumber();
        sum.numerator = (r1.numerator * r2.denominator) + (r2.numerator * r1.denominator);
        sum.denominator = r1.denominator * r2.denominator;
        return sum;
    }

    // Subtract 2 RationalNumber objects
    public static RationalNumber subtract(RationalNumber r1, RationalNumber r2) {
        RationalNumber difference = new RationalNumber();
        difference.numerator = (r1.numerator * r2.denominator) - (r2.numerator * r1.denominator);
        difference.denominator = r1.denominator * r2.denominator;
        return difference;
    }

    // Multiply 2 RationalNumber objects
    public static RationalNumber multiply(RationalNumber r1, RationalNumber r2) {
        RationalNumber product = new RationalNumber();
        product.numerator = r1.numerator * r2.numerator;
        product.denominator = r1.denominator * r2.denominator;
        return product;
    }

    // Divide 2 RationalNumber objects
    public static RationalNumber divide(RationalNumber r1, RationalNumber r2) {
        RationalNumber quotient = new RationalNumber();
        quotient.numerator = r1.numerator * r2.denominator;
        quotient.denominator = r1.denominator * r2.numerator;
        return quotient;
    }

    // Convert RationalNumber object to double
    public static double toDouble(RationalNumber r) {
        return (double)(r.numerator / r.denominator);
    }

    // Convert RationalNumber object to float
    public static float toFloat(RationalNumber r) {
        return (float)(r.numerator / r.denominator);
    }
}
