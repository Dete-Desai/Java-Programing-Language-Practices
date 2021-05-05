public class BreakStatement1 {

    public static void main(String[] args) {

        char letter = 'c';

        switch (letter) {

        case 'a':
            System.out.println("The value for case a is :" + letter);
            break;
        case 'b':
            System.out.println("The value for case b is :" + letter);
            break;
        case 'c':
            System.out.println("The value for case c is :" + letter);
            break;
        default:
            System.out.println("The default value is :" + letter);
        }
    }

}
