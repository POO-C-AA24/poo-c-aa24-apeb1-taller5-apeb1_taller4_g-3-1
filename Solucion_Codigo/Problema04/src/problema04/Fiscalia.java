package problema04;

import java.util.ArrayList;

public class Fiscalia {

    public String nombre;
    public String ruc;
    public String direccion;
    public ArrayList<CasoCorrupcion> casos;

    public Fiscalia(String nombre, String ruc, String direccion) {
        this.nombre = nombre;
        this.ruc = ruc;
        this.direccion = direccion;
        this.casos = new ArrayList<>();
    }

    public void agregarCaso(CasoCorrupcion caso) {
        casos.add(caso);
    }

    public void mostrarCasos() {
        for (CasoCorrupcion caso : casos) {
            caso.verificarEstado();
            System.out.println(caso);
        }
    }

    public void actualizarEstadosCasos() {
        for (CasoCorrupcion caso : casos) {
            caso.verificarEstado();
        }
    }
}
