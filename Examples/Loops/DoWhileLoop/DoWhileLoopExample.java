public class DoWhileLoopExample {

    public static void main(String[] args) {

        int array[] = {0, 1, 2, 3, 4, 5};
        int number = 1;

        do {

            System.out.println("The value at the array index is: " +array[number]);
            number++;
        }
        while(number > 0);
    }
    
}
