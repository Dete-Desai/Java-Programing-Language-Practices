import java.util.Scanner;

public class WhileLoopExercise {

    public static void main(String[] args) {

        int number;
        int conditionNumber;

        Scanner input = new Scanner(System.in);

        System.out.println("\nWHILE LOOP OPERATOR\n");
        System.out.println("Enter a number: ");
        number = input.nextInt();

        System.out.println("Enter the conditional number: ");
        conditionNumber = input.nextInt();

        System.out.println("The value entered for number is: " +number);
        System.out.println("The value entered for number is: " +conditionNumber);

        if (number <= conditionNumber) {

            System.out.println("\nOUTPUT OF OF THE FIRST DECREMENT CONDITION IF (number <= conditionNumber) WHILE (number <= conditionNumber):\n");
            while (number <= conditionNumber)
            {
                System.out.println(number+ "");
                number--;
            }
            System.out.println("\nOUTPUT OF OF THE SECOND DECREMENT CONDITION IF (number <= conditionNumber) WHILE (number >= conditionNumber):\n");
            while (number >= conditionNumber)
            {
                System.out.println(number+ "");
                number--;
            }
        }
        if (number >= conditionNumber) {

            System.out.println("\nOUTPUT OF OF THE FIRST INCREMENT CONDITION IF (number >= conditionNumber) WHILE (number <= conditionNumber):\n");
            while (number <= conditionNumber)
            {
                System.out.println(number+ "");
                number++;
            }

            System.out.println("\nOUTPUT OF OF THE SECOND INCREMENT CONDITION IF (number >= conditionNumber) WHILE (number >= conditionNumber):\n");
            while (number >= conditionNumber)
            {
                System.out.println(number+ "");
                number++;
            }
        }
        input.close();



    }
    
}
