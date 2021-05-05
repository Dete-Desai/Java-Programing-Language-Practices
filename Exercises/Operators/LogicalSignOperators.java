import java.util.Scanner;

public class LogicalSignOperators {

    public static void main(String[] args) {

        boolean variableOne;
        boolean variableTwo;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first value: ");
        variableOne = sc.nextBoolean();
        System.out.println("Enter the second value: ");
        variableTwo = sc.nextBoolean();

        boolean andOperator = variableOne && variableTwo;
        System.out.println("The value to the 'AND' operator is: " +(andOperator));

        boolean orOperator = variableOne || variableTwo;
        System.out.println("The value to the 'OR' operator is: " +(orOperator));

        boolean notAndOperator = !(variableOne && variableTwo);
        System.out.println("The value to the 'NOT AND' operator is: " +(notAndOperator));

        boolean notOrOperator = !(variableOne || variableTwo);
        System.out.println("The value to the 'NOT OR' operator is: " +(notOrOperator));

        sc.close();
    }
    
}
