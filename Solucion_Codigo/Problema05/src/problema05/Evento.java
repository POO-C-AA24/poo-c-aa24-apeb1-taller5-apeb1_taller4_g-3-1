package problema05;

import java.time.LocalDate;

public class Evento {

    public String nombreEvento;
    public LocalDate fecha;
    public String ubicacion;
    public String descripcion;

    public Evento(String nombreEvento, LocalDate fecha, String ubicacion, String descripcion) {
        this.nombreEvento = nombreEvento;
        this.fecha = fecha;
        this.ubicacion = ubicacion;
        this.descripcion = descripcion;
    }

    public String getNombreEvento() {
        return nombreEvento;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public String toString() {
        return "Evento: " + nombreEvento
                + ", Fecha: " + fecha
                + ", Ubicación: " + ubicacion
                + ", Descripción: " + descripcion;
    }
}
