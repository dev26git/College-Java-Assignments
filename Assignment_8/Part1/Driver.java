package PIJL_Assignments.Assignment_8.Part1;

import java.util.Scanner;

public class Driver {

    public static void main(String[] args) {
        int num = 0;
        try{
            num = inputNumber();
            System.out.println("Factorial of " + num + " = " + getFactorial(num));
        }catch (myNumberFormatException mynfe){
            System.out.println(mynfe.toString());
        }catch (FactorialException fe){
            System.out.println(fe.toString());
        }
    }


    // Get factorial of an integer
    private static int getFactorial(int n){
        int fact = 1;
        while(n > 1){
            fact *= n--;
        }
        return fact;
    }


    // Inputs a number and throws relevant custom exceptions
    private static int inputNumber() throws FactorialException, myNumberFormatException {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an integer:");
        String s = sc.nextLine();

        // check if input is integer
        if(!isInteger(s)){
            throw new myNumberFormatException(s);
        }

        int inputNum = Integer.parseInt(s);
        // assert input range
        if(inputNum < 0 || inputNum > 15){
            throw new FactorialException(inputNum);
        }
        return inputNum;
    }


    // Check whether the passed string is an integer
    private static boolean isInteger(String s) {
        char[] digits = {'1', '2', '3', '4', '5', '6', '7', '8', '9'};
        for(char c: s.toCharArray()) {
            boolean isInt = false;
            for(char digit: digits) {
                if(c == digit){
                    isInt = true;
                    break;
                }
            }
            if(!isInt) {
                return false;
            }
        }
        return true;
    }


}
