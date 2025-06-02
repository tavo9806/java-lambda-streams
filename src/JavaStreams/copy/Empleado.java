package JavaStreams.copy;

public class Empleado {
    private String nombre;
    private int edad;
    private String departamento;
    private double salario;

    public Empleado(String nombre, int edad, String departamento, double salario) {
        this.nombre = nombre;
        this.edad = edad;
        this.departamento = departamento;
        this.salario = salario;
    }

    // Getters
    public String getNombre() { return nombre; }
    public int getEdad() { return edad; }
    public String getDepartamento() { return departamento; }
    public double getSalario() { return salario; }

    @Override
    public String toString() {
        return nombre + " (" + edad + ") - " + departamento + ": $" + salario;
    }
}

