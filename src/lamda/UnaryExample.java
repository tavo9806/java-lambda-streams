package lamda;

import java.util.function.UnaryOperator;

public class UnaryExample {

    public static void main(String[] args) {

        /*
        UnaryOperator
        Recibe un solo valor, lo procesa y devuelve un resultado del mismo tipo.
         */

        UnaryOperator<Integer> unaryOperator = (number) -> number * number;
        int result = unaryOperator.apply(5);
        System.out.println(result);
    }
}
