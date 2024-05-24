package problema04;

import java.time.LocalDate;
import java.util.Scanner;

public class Ejecutor {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el nombre de la fiscalía: ");
        String nombreFiscalia = scanner.nextLine();
        System.out.print("Ingrese el RUC de la fiscalía: ");
        String ruc = scanner.nextLine();
        System.out.print("Ingrese la dirección de la fiscalía: ");
        String direccion = scanner.nextLine();

        Fiscalia fiscalia = new Fiscalia(nombreFiscalia, ruc, direccion);

        boolean continuar = true;

        while (continuar) {
            System.out.println("Seleccione una opción:");
            System.out.println("1. Agregar caso de corrupción");
            System.out.println("2. Agregar persona implicada a un caso");
            System.out.println("3. Mostrar casos");
            System.out.println("4. Actualizar estados de los casos");
            System.out.println("5. Salir");

            int opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el nombre del caso: ");
                    String nombreCaso = scanner.nextLine();
                    System.out.print("Ingrese la fecha de inicio (AAAA-MM-DD): ");
                    String fechaInicioStr = scanner.nextLine();
                    LocalDate fechaInicio = LocalDate.parse(fechaInicioStr);
                    System.out.print("Ingrese los detalles del caso: ");
                    String detalles = scanner.nextLine();
                    CasoCorrupcion caso = new CasoCorrupcion(nombreCaso, fechaInicio, detalles);
                    fiscalia.agregarCaso(caso);
                    break;
                case 2:
                    System.out.print("Ingrese el nombre del caso: ");
                    nombreCaso = scanner.nextLine();
                    CasoCorrupcion casoSeleccionado = null;
                    for (CasoCorrupcion c : fiscalia.casos) {
                        if (c.getNombreCaso().equals(nombreCaso)) {
                            casoSeleccionado = c;
                            break;
                        }
                    }
                    if (casoSeleccionado != null) {
                        System.out.print("Ingrese el nombre de la persona: ");
                        String nombrePersona = scanner.nextLine();
                        System.out.print("Ingrese la edad de la persona: ");
                        int edad = scanner.nextInt();
                        scanner.nextLine();  // Consumir la nueva línea
                        System.out.print("Ingrese la ocupación de la persona: ");
                        String ocupacion = scanner.nextLine();
                        System.out.print("Ingrese el nivel de implicación (acusado, testigo, víctima, etc.): ");
                        String nivelImplicacion = scanner.nextLine();
                        Persona persona = new Persona(nombrePersona, edad, ocupacion, nivelImplicacion);
                        casoSeleccionado.agregarPersonaImplicada(persona);
                    } else {
                        System.out.println("Caso no encontrado.");
                    }
                    break;
                case 3:
                    fiscalia.mostrarCasos();
                    break;
                case 4:
                    fiscalia.actualizarEstadosCasos();
                    break;
                case 5:
                    continuar = false;
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        }
        scanner.close();
    }
}
