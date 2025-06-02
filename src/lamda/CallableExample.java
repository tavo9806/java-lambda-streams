package lamda;

import java.util.concurrent.Callable;

public class CallableExample {
    public static void main(String[] args) {
        /*
        Callable
        No recibe valores pero retorna un resultado y puede lanzar una excepcion
         */

        Callable<String> callable = () ->  {
            return "Resultado de la tarea";
        };

        try {
            String resultado = callable.call();
            System.out.println(resultado);
        }catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
