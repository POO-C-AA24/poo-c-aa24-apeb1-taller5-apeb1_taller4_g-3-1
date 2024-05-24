package problema04;

class Persona {

    public String nombre;
    public int edad;
    public String ocupacion;
    public String nivelImplicacion;
    public boolean colaboracion;

    public Persona(String nombre, int edad, String ocupacion, String nivelImplicacion) {
        this.nombre = nombre;
        this.edad = edad;
        this.ocupacion = ocupacion;
        this.nivelImplicacion = nivelImplicacion;
        this.colaboracion = false;
    }

    public String getNombre() {
        return nombre;
    }

    public String getNivelImplicacion() {
        return nivelImplicacion;
    }

    public boolean isColaboracion() {
        return colaboracion;
    }

    public void setColaboracion(boolean colaboracion) {
        this.colaboracion = colaboracion;
    }

    public void reducirPena() {
        if (nivelImplicacion.equals("acusado") && colaboracion) {
            System.out.println(nombre + " se ha acogido a la reducción de pena por colaborar confesando la verdad.");
        }

    }

    public void pagarFianza(double totalDanioEconomico) {
        if (nivelImplicacion.equals("acusado") && colaboracion) {
            double fianza = totalDanioEconomico * 0.5;
            System.out.println(nombre + " puede pagar una fianza de $" + fianza + " por colaborar con información útil.");
        }
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre
                + ", Edad: " + edad
                + ", Ocupación: " + ocupacion
                + ", Nivel de Implicación: " + nivelImplicacion;
    }
}
