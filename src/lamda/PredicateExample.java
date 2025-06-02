package lamda;

import java.util.function.Predicate;

public class PredicateExample {
    public static void main(String[] args) {
        /*
        Predicate
        Recibe un valor y devuelve un booleano
         */

        Predicate<String> predicate = (str) -> {
            return str.length() > 5;
        };
        boolean result = predicate.test("hola mundo");
        System.out.println(result);
    }
}
