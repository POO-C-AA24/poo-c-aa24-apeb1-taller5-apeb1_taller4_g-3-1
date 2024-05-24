package problema03;

import java.util.ArrayList;

public class Empresa {

    public String nombre;
    public String ruc;
    public String direccion;
    public ArrayList<Departamentos> departamentos;

    public Empresa(String nombre, String ruc, String direccion) {
        this.nombre = nombre;
        this.ruc = ruc;
        this.direccion = direccion;
        this.departamentos = new ArrayList<>();
    }

    public void agregarDepartamento(Departamentos departamento) {
        departamentos.add(departamento);
    }

    public void mostrarDepartamentos() {
        for (Departamentos departamento : departamentos) {
            System.out.println(departamento);
        }
    }
}
