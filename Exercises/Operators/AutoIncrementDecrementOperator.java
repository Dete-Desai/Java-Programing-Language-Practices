import java.util.Scanner;

public class AutoIncrementDecrementOperator {

    public static void main(String[] args) {

        int number;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number to be icreased or decreased: ");
        number = sc.nextInt();
        System.out.println("The number entered is: " +number);

        sc.close();

        number++;
        System.out.println("The increased value of the number is: "+number);

        number--;
        System.out.println("The decreased value of the number is: "+number);

    }
    
}
