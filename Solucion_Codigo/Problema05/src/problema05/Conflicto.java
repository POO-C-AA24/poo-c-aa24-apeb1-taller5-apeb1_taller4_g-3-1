package problema05;

import java.util.ArrayList;
import java.time.LocalDate;

public class Conflicto {

    public String nombreConflicto;
    public ArrayList<Pais> paisesInvolucrados;
    public LocalDate fechaInicio;
    public String estadoActual;
    public String detalles;
    public ArrayList<Evento> eventos;
    public boolean usoArmasNucleares;

    public Conflicto(String nombreConflicto, LocalDate fechaInicio, String detalles) {
        this.nombreConflicto = nombreConflicto;
        this.fechaInicio = fechaInicio;
        this.estadoActual = "Iniciado";
        this.detalles = detalles;
        this.paisesInvolucrados = new ArrayList<>();
        this.eventos = new ArrayList<>();
        this.usoArmasNucleares = false;
    }

    public String getNombreConflicto() {
        return nombreConflicto;
    }

    public LocalDate getFechaInicio() {
        return fechaInicio;
    }

    public String getEstadoActual() {
        return estadoActual;
    }

    public void setEstadoActual(String estadoActual) {
        this.estadoActual = estadoActual;
    }

    public String getDetalles() {
        return detalles;
    }

    public void agregarPais(Pais pais) {
        paisesInvolucrados.add(pais);
    }

    public void agregarEvento(Evento evento) {
        eventos.add(evento);
    }

    public void usarArmasNucleares() {
        this.usoArmasNucleares = true;
    }

    public void verificarEstados() {
        int totalPaises = 195;
        int totalPaisesDesarrollados = 36;

        int paisesConBatallas = 0;
        int paisesDesarrolladosConBatallas = 0;

        for (Pais pais : paisesInvolucrados) {
            if (pais.getBajas() > 0) {
                paisesConBatallas++;
                if (pais.isPrimerMundo()) {
                    paisesDesarrolladosConBatallas++;
                }
            }
        }

        if (usoArmasNucleares && paisesDesarrolladosConBatallas > 0) {
            estadoActual = "Guerra Mundial";
        } else if ((double) paisesConBatallas / totalPaises > 0.5) {
            estadoActual = "Guerra Mundial";
        } else if ((double) paisesConBatallas / totalPaises >= 0.3) {
            System.out.println("Convocatoria urgente a la ONU.");
        }

        for (Pais pais : paisesInvolucrados) {
            if ((double) pais.getBajas() / pais.getPoblacion() >= 0.5) {
                System.out.println("Convocatoria urgente a la ONU debido a altas bajas en " + pais.getNombre());
            }
        }
    }

    @Override
    public String toString() {
        return "Conflicto: " + nombreConflicto
                + ", Fecha de Inicio: " + fechaInicio
                + ", Estado Actual: " + estadoActual
                + ", Detalles: " + detalles
                + ", Paises Involucrados: " + paisesInvolucrados
                + ", Eventos: " + eventos;
    }
}
