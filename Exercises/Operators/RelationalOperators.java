import java.util.Scanner; 

public class RelationalOperators {

    public static void main(String[] args) {

        int variableOne;
        int variableTwo;

        Scanner sc = new Scanner(System.in);

        //Equal Sign Operator
        System.out.println("\n EQUAL SIGN OPERATOR\n");
        System.out.println("Enter the first value: ");
        variableOne = sc.nextInt();
        System.out.println("Enter the second value: ");
        variableTwo = sc.nextInt();

        System.out.println("Value of the first value is: " +variableOne);
        System.out.println("Value of the second value is: " +variableTwo);

        if (variableOne == variableTwo) {
            System.out.println("\n FEEDBACK");
            System.out.println("\n The first value is equal to the second value");
        }
        else {
            System.out.println("\n FEEDBACK");
            System.out.println("\n The first value is not equal to the second value");
        }

        //Not Equal Sign Operator
        System.out.println("\n NOT EQUAL SIGN OPERATOR\n");
        System.out.println("Enter the first value: ");
        variableOne = sc.nextInt();
        System.out.println("Enter the second value: ");
        variableTwo = sc.nextInt();

        System.out.println("Value of the first value is: " +variableOne);
        System.out.println("Value of the second value is: " +variableTwo);

        if (variableOne != variableTwo) {
            System.out.println("\n FEEDBACK");
            System.out.println("\n The first value is not equal to the second value");
        }
        else {
            System.out.println("\n FEEDBACK");
            System.out.println("\n The first value is equal to the second value");
        }

        //Greater Than Sign Operator
        System.out.println("\n GREATER THAN SIGN OPERATOR\n");
        System.out.println("Enter the first value: ");
        variableOne = sc.nextInt();
        System.out.println("Enter the second value: ");
        variableTwo = sc.nextInt();

        System.out.println("Value of the first value is: " +variableOne);
        System.out.println("Value of the second value is: " +variableTwo);

        if (variableOne > variableTwo) {
            System.out.println("\n FEEDBACK");
            System.out.println("\n The first value is greater than the second value");
        }
        else {
            System.out.println("\n FEEDBACK");
            System.out.println("\n The first value is not greater than the second value");
        }

        //Less Than Sign Operator
        System.out.println("\n LESS THAN SIGN OPERATOR\n");
        System.out.println("Enter the first value: ");
        variableOne = sc.nextInt();
        System.out.println("Enter the second value: ");
        variableTwo = sc.nextInt();

        System.out.println("Value of the first value is: " +variableOne);
        System.out.println("Value of the second value is: " +variableTwo);

        if (variableOne < variableTwo) {
            System.out.println("\n FEEDBACK");
            System.out.println("\n The first value is less than the second value");
        }
        else {
            System.out.println("\n FEEDBACK");
            System.out.println("\n The first value is not less than the second value");
        }

        //Greater or Equal To Sign Operator
        System.out.println("\n GREATER OR EQUAL SIGN OPERATOR\n");
        System.out.println("Enter the first value: ");
        variableOne = sc.nextInt();
        System.out.println("Enter the second value: ");
        variableTwo = sc.nextInt();

        System.out.println("Value of the first value is: " +variableOne);
        System.out.println("Value of the second value is: " +variableTwo);

        if (variableOne >= variableTwo) {
            System.out.println("\n FEEDBACK");
            System.out.println("\n The first value is greater or equal to the second value");
        }
        else {
            System.out.println("\n FEEDBACK");
            System.out.println("\n The first value is not greater or equal to the second value");
        }

        //Less or Equal To Sign Operator
        System.out.println("\n LESS OR EQUAL SIGN OPERATOR\n");
        System.out.println("Enter the first value: ");
        variableOne = sc.nextInt();
        System.out.println("Enter the second value: ");
        variableTwo = sc.nextInt();

        System.out.println("Value of the first value is: " +variableOne);
        System.out.println("Value of the second value is: " +variableTwo);

        if (variableOne <= variableTwo) {
            System.out.println("\n FEEDBACK");
            System.out.println("\n The first value is less or equal to the second value");
        }
        else {
            System.out.println("\n FEEDBACK");
            System.out.println("\n The first value is not less or equal to the second value");
        }

        sc.close();

    }
    
}
