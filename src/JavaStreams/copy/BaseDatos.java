package JavaStreams.copy;

import java.util.*;

public class BaseDatos {
    public static List<Empleado> obtenerEmpleados() {
        return Arrays.asList(
            new Empleado("Carlos", 35, "IT", 5000),
            new Empleado("Laura", 28, "RRHH", 3500),
            new Empleado("Pedro", 40, "IT", 7000),
            new Empleado("Ana", 22, "Marketing", 3000),
            new Empleado("Lucía", 30, "IT", 4800),
            new Empleado("José", 45, "RRHH", 6200)
        );
    }
}
