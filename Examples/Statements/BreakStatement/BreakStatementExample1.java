public class BreakStatementExample1 {

    public static void main(String[] args) {

        int number = 10;

        while(number <= 10) {

            System.out.println(number+"");
            number--;

            if(number == 4) {

                break;
            }
        }
    }
    
}
