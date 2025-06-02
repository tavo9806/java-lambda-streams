package lamda;

import java.util.function.BiConsumer;

public class BiConsumerExample {
    public static void main(String[] args) {
        /*
        Biconsumer
        Recibe 2 valores y no retorna nada
         */
        BiConsumer<String, String> biConsumer = (a, b) -> System.out.println(a + " " + b);
        biConsumer.accept("Hola" ,"Mundo");
    }
}
