public class SwitchCase1 {

    public static void main(String[] args) {

        char letter = 'b';

        switch (letter) {

        case 'a':
            System.out.println("The value for case a is: " + letter);
        case 'b':
            System.out.println("The value for case b is: " + letter);
        case 'c':
            System.out.println("The value for case c is: " + letter);
        default:
            System.out.println("The default value is: " + letter);

        }
    }
}
