package problema05;

public class Pais {

    public String nombre;
    public boolean primerMundo;
    public int poblacion;
    public int bajas;

    public Pais(String nombre, boolean primerMundo, int poblacion) {
        this.nombre = nombre;
        this.primerMundo = primerMundo;
        this.poblacion = poblacion;
        this.bajas = 0;
    }

    public String getNombre() {
        return nombre;
    }

    public boolean isPrimerMundo() {
        return primerMundo;
    }

    public int getPoblacion() {
        return poblacion;
    }

    public int getBajas() {
        return bajas;
    }

    public void setBajas(int bajas) {
        this.bajas = bajas;
    }

    @Override
    public String toString() {
        return nombre + " (Población: " + poblacion + ", Bajas: " + bajas + ")";
    }
}
