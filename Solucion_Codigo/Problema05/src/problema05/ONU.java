package problema05;

import java.util.ArrayList;

public class ONU {

    public ArrayList<Conflicto> conflictos;

    public ONU() {
        this.conflictos = new ArrayList<>();
    }

    public void agregarConflicto(Conflicto conflicto) {
        conflictos.add(conflicto);
    }

    public void mostrarConflictos() {
        for (Conflicto conflicto : conflictos) {
            conflicto.verificarEstados();
            System.out.println(conflicto);
        }
    }
}
