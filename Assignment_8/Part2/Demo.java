package PIJL_Assignments.Assignment_8.Part2;

import java.util.Scanner;
public class Demo {
    public static void main(String[] args) {
        try {
            String str = getInput();
        }catch (NoMatchException noMatchException){
            System.out.println(noMatchException.toString());
            noMatchException.printStackTrace();
        }

        System.out.println("Input matches 'India'. Program finished.");

    }

    private static String getInput() throws NoMatchException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String that matches 'India': ");
        String str = sc.nextLine();
        if(!str.equals("India")){
            throw new NoMatchException(str);
        }
        return str;
    }

}
