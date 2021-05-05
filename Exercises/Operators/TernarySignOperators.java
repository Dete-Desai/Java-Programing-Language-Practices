import java.util.Scanner;

public class TernarySignOperators {

    public static void main(String[] args) {

        int variableOne;
        int result;
        int testVariable;
        int leftColonVariable;
        int rightColonVariable;

        Scanner sc = new Scanner(System.in);

        System.out.println("TERNARY SIGN OPERATORS\n");

        //If the expression results true then the first value before the colon (:) 
        //is assigned to the variable num1 else the second value is assigned to the num1.

        System.out.println("Enter the first value: ");
        variableOne = sc.nextInt();

        System.out.println("First Value: " +(variableOne));

        System.out.println("\nSee The Formula Below\n");
        System.out.println("second value = (first value == value for test) ? value before colon: value after colon \n;");

        System.out.println("Enter the value for testing: ");
        testVariable = sc.nextInt();

        System.out.println("Enter the value of your choice to be placed before the colon: ");
        leftColonVariable = sc.nextInt();

        System.out.println("Enter the value of your choice to be placed after the colon: ");
        rightColonVariable = sc.nextInt();

        System.out.print("\nTest value: " +(testVariable));
        System.out.print("Value before colon: " +(leftColonVariable));
        System.out.print("Value after colon: " +(rightColonVariable));

        result = (variableOne == testVariable)? leftColonVariable : rightColonVariable;

        System.out.println("\n The results of the ternary operation is: " +(result));

        sc.close();
        
    }
    
}
