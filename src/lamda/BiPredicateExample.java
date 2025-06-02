package lamda;

import java.util.function.BiPredicate;

public class BiPredicateExample {
    public static void main(String[] args) {

        /*
        BiPredicate
        Recibe dos valores retorna un booleano
         */

        BiPredicate<Integer, Integer> biPredicate = (a,b) -> a > b;
        boolean result = biPredicate.test(10,5);
        System.out.println(result);
    }
}
