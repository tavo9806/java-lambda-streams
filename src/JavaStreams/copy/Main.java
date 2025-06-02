package JavaStreams.copy;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Ejercicio 1: Filtrar empleados del departamento IT
		/*BaseDatos.obtenerEmpleados().stream()
			.filter(e -> e.getDepartamento().equals("IT"))
			.forEach(n -> System.out.println(n.toString()));*/
		
		//Ejercicio 2: Obtener los nombres de empleados mayores de 30
		/*BaseDatos.obtenerEmpleados().stream()
			.filter(e -> e.getEdad() > 30)
			.map(e -> e.getNombre())
			.forEach(e -> System.out.println(e));*/
		
		//Ejercicio 3: Crear una lista con los salarios incrementados en un 10%
			//TODO REVISAR
		/*List<Double> salariosActualizados = BaseDatos.obtenerEmpleados().stream()
				.map(e -> e.getSalario() * 1.10)
				.collect(Collectors.toList());
		salariosActualizados.stream().forEach(e -> System.out.println(e));*/
		
		//Ejercicio 4: Encontrar el salario promedio de todos los empleados
		/*double avg = BaseDatos.obtenerEmpleados().stream()
			.mapToDouble(e -> e.getSalario())
			.average()
			.orElse(0);
		System.out.println(avg);*/
		
		// Ejercicio 5: Agrupar empleados por departamento
		/*Map<String, List<Empleado> > empleadoDepartamento = BaseDatos.obtenerEmpleados().stream()
				.collect( Collectors.groupingBy( e -> e.getDepartamento()));
		
		empleadoDepartamento.forEach( (key, values) -> {
			System.out.println("Departemento " + key);
			values.forEach( value -> System.out.println(value));
		});*/
		
		// Ejercicio 6: Ordenar los empleados por salario descendente
		// !!! NO ME GUSTA ESTA SOLUCION
		/*BaseDatos.obtenerEmpleados().stream()
			.sorted(Comparator.comparingDouble(e -> ((Empleado) e).getSalario() ).reversed()) //No sale getSalario
			.forEach(n -> System.out.println(n));*/
		/*BaseDatos.obtenerEmpleados().stream()
			.sorted( (e1, e2) -> Double.compare( e2.getSalario(), e1.getSalario()))
			.forEach(e -> System.out.println(e.toString()));*/
		
		// Ejercicio 7: Obtener el empleado con mayor salario
		/*BaseDatos.obtenerEmpleados().stream()
				.max( (e1,e2) -> Double.compare(e1.getSalario(), e2.getSalario()) )
				.ifPresent(e -> System.out.println(e));*/
		
		// Ejercicio 8: ¿Hay algún empleado que gane más de $10,000?
		/*boolean result = BaseDatos.obtenerEmpleados().stream().anyMatch(e -> e.getSalario() > 10000);
		System.out.println(result);*/
		
		// Ejercicio 9: Listar empleados cuyo nombre empiece con "L"
		/*List<Empleado> empleados =  BaseDatos.obtenerEmpleados().stream().
				filter(e -> e.getNombre().startsWith("L"))
				.collect(Collectors.toList());
		empleados.forEach(e -> System.out.println(e));*/
		
		// Ejercicio 10: Sumar todos los salarios
		double result = BaseDatos.obtenerEmpleados().stream()
				.map(e -> e.getSalario())
				.reduce(0.0, (a,b) -> a + b);
		System.out.println(result);
	}	

}
