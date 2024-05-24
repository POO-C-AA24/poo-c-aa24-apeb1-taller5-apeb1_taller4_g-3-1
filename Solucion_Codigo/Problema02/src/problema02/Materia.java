package problema02;

public class Materia {

    public String nombresMateria;
    public double acd;
    public double ape;
    public double aa;

    public Materia(String nombresMateria, double acd, double ape, double aa) {
        this.nombresMateria = nombresMateria;
        this.acd = acd;
        this.ape = ape;
        this.aa = aa;
    }

    public String getNombresMateria() {
        return nombresMateria;
    }

    public double getAcd() {
        return acd;
    }

    public double getApe() {
        return ape;
    }

    public double getAa() {
        return aa;
    }
    

    public boolean esAprobado() {
        double total = acd + ape + aa;
        return total >= 7.0;
    }

    public boolean necesitaRecuperacion() {
        return !esAprobado();
    }

    public double calcularNotaFinalConRecuperacion(double notaRecuperacion) {
        double total = acd + ape + aa;
        return total + notaRecuperacion;
    }
}
