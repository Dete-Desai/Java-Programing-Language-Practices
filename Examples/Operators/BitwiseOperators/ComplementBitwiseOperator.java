package Operators.BitwiseOperators;

public class ComplementBitwiseOperator {

    public static void main(String[] args) {

        int variableOne = 11;
        int variableTwo = 22;
        int result = 0;
        int result1 = 0;

        result = ~ variableOne;
        result = ~ variableTwo;
        System.out.println("The result '~' bitwise sign operator is: " +(result));
        System.out.println("The result1 '~' bitwise sign operator is: " +(result1));
    }
    
}
