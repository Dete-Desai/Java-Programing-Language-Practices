public class BreakStatement {

    public static void main(String[] args) {

        int number = 3;

        switch(number) 
        {
            case 1:
                System.out.println("The value for case 1 is: "+(number));
                break;
            
            case 2:
                System.out.println("The value for case 2 is: "+(number));
                break;

            case 3:
                System.out.println("The value for case 3 is: "+(number));
                break;

            case 4:
                System.out.println("The value for case 4 is: "+(number));
                break;

            default:
                System.out.println("The default value is: "+(number));
        }
    }
}
