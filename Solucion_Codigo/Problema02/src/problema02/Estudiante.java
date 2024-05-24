package problema02;

import java.util.ArrayList;

public class Estudiante {

    public String nombreEstudiante;
    public int edadEstudiante;
    public ArrayList<Materia> materias;

    public Estudiante(String nombreEstudiante, int edadEstudiante) {
        this.nombreEstudiante = nombreEstudiante;
        this.edadEstudiante = edadEstudiante;
        this.materias = new ArrayList<>();
    }

    public String getNombreEstudiante() {
        return nombreEstudiante;
    }

    public void agregarMateria(Materia materia) {
        materias.add(materia);
    }

    public void mostrarMaterias() {
        for (Materia materia : materias) {
            System.out.println("Materia: " + materia.getNombresMateria()
                    + "ACD: " + materia.getAcd() + "APE: " + materia.getApe() + "AA: " + materia.getAa());
        }
    }

    public void verificarAprobacion(String nombreMateria) {
        for (Materia materia : materias) {
            if (materia.getNombresMateria().equals(nombreMateria)) {
                if (materia.esAprobado()) {
                    System.out.println("El estudiante APROBO LA MATERIA");
                } else {
                    System.out.println("El estudiante no aprobo la materia");
                    System.out.println("El estudiante debe rendir un examen supletorio");
                }
                return;
            }
            System.out.println("Materia no encontrada");
        }
    }

    public void realizarRecuperacion(String nombreMateria, double notaRecuperacion) {
        for (Materia materia : materias) {
            if (materia.getNombresMateria().equals(nombreMateria)) {
                if (materia.necesitaRecuperacion()) {
                    double notaFinal = materia.calcularNotaFinalConRecuperacion(notaRecuperacion);
                    if (notaFinal >= 7.0) {
                        System.out.println("El estudiante ha aprobado");
                    } else {
                        System.out.println("El estudiante no ha aprobado");
                    }
                } else {
                    System.out.println("El estudiante ya habia aprobado la materia");
                }
                return;
            }
        }
        System.out.println("Materia no encontrada");
    }
}
