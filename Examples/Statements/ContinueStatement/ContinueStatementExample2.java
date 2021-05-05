public class ContinueStatementExample2 {

    public static void main(String[] args) {

        int number = 10;

        do {
            if (number == 5) {

                number--;
                continue;
            }

            System.out.println(number+"");
            number --;
        }
        while (number > 3);
    }
    
}
