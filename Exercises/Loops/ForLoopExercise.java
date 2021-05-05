import java.util.Scanner;

public class ForLoopExercise {

    public static void main(String[] args) {

        int number;
        int assignmentNumber;
        int conditionNumber;

        Scanner input = new Scanner(System.in);

        System.out.println("\nTHE FOR-LOOP OPERATOR");
        System.out.println("INCREMENT OPERATION\n");
        System.out.println("Enter assignment number for increment: ");
        assignmentNumber = input.nextInt();

        System.out.println("Enter conditional number for increment: ");
        conditionNumber = input.nextInt();

        if (assignmentNumber <= conditionNumber) {

            System.out.println("\nOUTPUT OF THE FIRST INCREMENT FOR LOOP \n WHEN (number <= conditionNumber) \n IF (assignmentNumber <= conditionNumber)");

            for (number = assignmentNumber; number <= conditionNumber; number++) {

                System.out.println(number+ "");
            }

            System.out.println("\nOUTPUT OF THE FIRST INCREMENT FOR LOOP \n WHEN (number >= conditionNumber) \n IF (assignmentNumber <= conditionNumber)");

            for (number = assignmentNumber; number >= conditionNumber; number++) {

                System.out.println(number+ "");
            }
        }
        else if (assignmentNumber >= conditionNumber) {

            System.out.println("\nOUTPUT OF THE SECOND INCREMENT FOR LOOP \n WHEN (number <= conditionNumber) \n IF (assignmentNumber >= conditionNumber)");

            for (number = assignmentNumber; number <= conditionNumber; number++) {

                System.out.println(number+ "");
            }
            System.out.println(number+ "");
        }
        else {
            System.out.println("You have entered the wrong inputs");
        }

        System.out.println("\n\nDECREMENT OPERATION\n");
        System.out.println("Enter assignment number for decrement: ");
        assignmentNumber = input.nextInt();

        System.out.println("Enter conditional number for decrement: ");
        conditionNumber = input.nextInt();

        if (assignmentNumber <= conditionNumber) {

            System.out.println("\nOUTPUT OF THE FIRST DECREMENT FOR LOOP \n WHEN (number >= conditionNumber) \n IF (assignmentNumber <= conditionNumber)");

            for (number = assignmentNumber; number >= conditionNumber; number--) {

                System.out.println(number+ "");
            }
        }
        else if (assignmentNumber >= conditionNumber) {

            System.out.println("\nOUTPUT OF THE FIRST INCREMENT FOR LOOP \n WHEN (number >= conditionNumber) \n IF (assignmentNumber >= conditionNumber)");

            for (number = assignmentNumber; number >= conditionNumber; number--) {

                System.out.println(number+ "");
            }
        }
        else {
            System.out.println("\nYou have entered the wrong inputs");
        }

        input.close();
    }
    
}
