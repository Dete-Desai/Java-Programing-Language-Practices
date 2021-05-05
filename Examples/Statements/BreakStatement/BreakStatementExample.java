public class BreakStatementExample {

    public static void main(String[] args) {

        int number;

        for (number = 1; number <= 10; number++) {

            System.out.println(number+ "");

            if (number == 5) {

                break;
            }
        }

        System.out.println("The number for causing the break is: " + number);
    }
    
}
