public class ContinueStatementExample1 {

    public static void main(String[] args) {

        int number = 10;

        while (number >= 0) {

            if (number > 7) {

                number--;
                continue;
            }
            System.out.println("" +number);
            number--;
        }


    }
    
}
