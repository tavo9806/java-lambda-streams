package lamda;

import java.util.function.Supplier;

public class SupplierExample {
    public static void main(String[] args) {
        /*
        Supplier
        No recibe ningún valor, pero retorna algo
         */

        Supplier<String> supplier = () -> "Hola, soy un supplier";
        String result = supplier.get();
        System.out.println(result);
    }
}
