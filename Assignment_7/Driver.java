package PIJL_Assignments.Assignment_7;

import java.util.ArrayList;
import java.util.Scanner;
import PIJL_Assignments.Assignment_7.Operations;
import PIJL_Assignments.Assignment_7.myExceptions.ZeroDenominatorException;
import PIJL_Assignments.Assignment_7.myExceptions.myNumberFormatException;

public class Driver {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Input 2 rational numbers in the form '12/34 56/78': ");
            String inputs = sc.nextLine();
            ArrayList<RationalNumber> inputList = inputNumbers(inputs.split(" "));

            String[] choices = {"add", "subtract", "multiply", "divide", "convert to double", "convert to float"};
            for(int i=0; i<choices.length; i++) {
                System.out.println("Press " + i + " to " + choices[i]);
            }

            System.out.println("Enter your choice:");
            int choice = sc.nextInt();

            System.out.println();
            
            switch(choice) {
                case 0 -> System.out.println(Operations.add(inputList.get(0), inputList.get(1)));
                case 1 -> System.out.println(Operations.subtract(inputList.get(0), inputList.get(1)));
                case 2 -> System.out.println(Operations.multiply(inputList.get(0), inputList.get(1)));
                case 3 -> System.out.println(Operations.divide(inputList.get(0), inputList.get(1)));
                case 4 -> System.out.println(Operations.toDouble(inputList.get(0)) + " " +  Operations.toDouble(inputList.get(1)));
                case 5 -> System.out.println(Operations.toFloat(inputList.get(0)) + " " +  Operations.toFloat(inputList.get(1)));
                default -> System.out.println("Incorrect Choice.");
            }
        }catch(myNumberFormatException nfe) {
            System.out.println(nfe.toString());
        }catch(ZeroDenominatorException zde){
            System.out.println(zde.toString());
        }
    }


    // Asserts the command line arguments
    private static ArrayList<RationalNumber> inputNumbers(String[] CLAs) throws myNumberFormatException, ZeroDenominatorException {
        String numerator1 = CLAs[0].split("/")[0];
        String denominator1 = CLAs[0].split("/")[1];
        String numerator2 = CLAs[1].split("/")[0];
        String denominator2 = CLAs[1].split("/")[1];

        if(!isInteger(numerator1)){
            throw new myNumberFormatException(numerator1);
        }
        if(!isInteger(denominator1)){
            throw new myNumberFormatException(denominator1);
        }
        if(!isInteger(numerator2)){
            throw new myNumberFormatException(numerator2);
        }
        if(!isInteger(denominator2)){
            throw new myNumberFormatException(denominator2);
        }
        if(denominator1.compareTo("0") == 0){
            throw new ZeroDenominatorException();
        }
        if(denominator2.compareTo("0") == 0){
            throw new ZeroDenominatorException();
        }

        ArrayList<RationalNumber> inputList = new ArrayList<>();
        inputList.add(new RationalNumber(Integer.parseInt(numerator1), Integer.parseInt(denominator1)));
        inputList.add(new RationalNumber(Integer.parseInt(numerator2), Integer.parseInt(denominator2)));

        return inputList;
    }


    // Checks whether a string is integer or not
    private static boolean isInteger(String s) {
        for(char c: s.toCharArray()) {
            if(!Character.isDigit(c))
                return false;
        }
        return true;
    }
}
