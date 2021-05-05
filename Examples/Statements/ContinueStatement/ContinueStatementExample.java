public class ContinueStatementExample {

    public static void main(String[] args) {

        int number;

        for(number = 0; number <= 6; number++){

            if (number == 4){

                continue;
            }

            System.out.println(number + "");
        }
    }
    
}
