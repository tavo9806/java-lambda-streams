package Streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamExample {
    public static void main(String[] args) {

        List<String> names = Arrays.asList("Ana", "Lusi", "Luis", "Maria", "Pedro", "Juan", "Ana", "Ana");

        // filter: Filtra los elementos que cumplen con una condicion -> No Final
        /*names.stream().filter( (nombre) -> nombre.length() > 4 )
                .forEach(n -> System.out.println(n));*/

        // map: Transforma los elementos aplicando una funcion
        /*names.stream().map(name -> name.toUpperCase())
                .filter(name -> name.startsWith("A"))
                .forEach(name -> System.out.println(name));*/

        //sorted: Ordena los elementos del stream
        /*names.stream()
                .sorted()
                .forEach(name -> System.out.println(name));*/

        // reduce: Combina todos los elementos en un solo valor
        /*String result = names.stream().reduce( "",(a,b) -> a + " " + b);
        System.out.println(result);*/

        //collect: Recoge los elementos en una coleccion
        /*List<String> result = names.stream().map(name -> name.toUpperCase())
                .collect(Collectors.toList());
        result.stream().forEach(n -> System.out.println(n));*/

        // distinct: Elimina los elementos duplicados
        /*names.stream()
                .distinct()
                .forEach(n -> System.out.println(n));*/

        //limit: Limita el numero de elementos procesados
        //names.stream().limit(3).forEach(n -> System.out.println(n));

        //skip: Omite un  número específico de elementos
        //names.stream().skip(3).forEach(n -> System.out.println(n));

        //anyMatch: Verifica si algún elemento cumple con una condición específica
        /*boolean result = names.stream().anyMatch(n -> n.contains("Ana"));
        System.out.println(result);*/

        //allMatch: Verifica si todos los elementos cumplen una condición
        /*boolean result = names.stream().allMatch(n -> n.length() >= 30);
        System.out.println(result);*/

        //noneMatch: Verifica si ningún elemento cumple una condición
        boolean result =  names.stream().noneMatch(n -> n.length() == 10);
        System.out.println(result);
    }
}
