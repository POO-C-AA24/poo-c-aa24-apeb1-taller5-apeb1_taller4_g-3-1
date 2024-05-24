package problema03;

public class Departamentos {

    public String nombre;
    public int numeroEmpleados;
    public double produccionAnual;
    public String categoria;

    public Departamentos(String nombre, int numeroEmpleados, double produccionAnual) {
        this.nombre = nombre;
        this.numeroEmpleados = numeroEmpleados;
        this.produccionAnual = produccionAnual;
        this.categoria = determinarCategoria();
    }

    private String determinarCategoria() {
        if (numeroEmpleados > 20 && produccionAnual > 1000000) {
            return "A";
        } else if (numeroEmpleados >= 20 && produccionAnual >= 1000000) {
            return "B";
        } else if (numeroEmpleados >= 10 && produccionAnual >= 500000) {
            return "C";
        } else {
            return "No Categoría";
        }
    }

    @Override
    public String toString() {
        return "Departamento: " + nombre
                + ", Número de Empleados: " + numeroEmpleados
                + ", Producción Anual: $" + produccionAnual
                + ", Categoría: " + categoria;
    }
}
