package problema04;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;

class CasoCorrupcion {

    public String nombreCaso;
    public LocalDate fechaInicio;
    public String estado;
    public String detalles;
    public ArrayList<Persona> personasImplicadas;

    public CasoCorrupcion(String nombreCaso, LocalDate fechaInicio, String detalles) {
        this.nombreCaso = nombreCaso;
        this.fechaInicio = fechaInicio;
        this.estado = "Iniciado";
        this.detalles = detalles;
        this.personasImplicadas = new ArrayList<>();
    }

    public String getNombreCaso() {
        return nombreCaso;
    }

    public LocalDate getFechaInicio() {
        return fechaInicio;
    }

    public String getEstado() {
        return estado;
    }

    public void agregarPersonaImplicada(Persona persona) {
        personasImplicadas.add(persona);
    }

    public void verificarEstado() {
        long diasTranscurridos = ChronoUnit.DAYS.between(fechaInicio, LocalDate.now());
        if (diasTranscurridos > 14) {
            estado = "Urgente";
        } else if (diasTranscurridos > 7) {
            estado = "Alerta";
        }
    }

    @Override
    public String toString() {
        return "Nombre del Caso: " + nombreCaso
                + ", Fecha de Inicio: " + fechaInicio
                + ", Estado: " + estado
                + ", Detalles: " + detalles
                + ", Personas Implicadas: " + personasImplicadas;
    }
}
