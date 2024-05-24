package problema05;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class Ejecutor {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ONU onu = new ONU();

        boolean continuar = true;

        while (continuar) {
            System.out.println("Seleccione una opción:");
            System.out.println("1. Agregar conflicto internacional");
            System.out.println("2. Agregar país involucrado a un conflicto");
            System.out.println("3. Agregar evento a un conflicto");
            System.out.println("4. Mostrar conflictos");
            System.out.println("5. Salir");

            int opcion = scanner.nextInt();
            scanner.nextLine();  // Consumir la nueva línea

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el nombre del conflicto: ");
                    String nombreConflicto = scanner.nextLine();
                    System.out.print("Ingrese la fecha de inicio (AAAA-MM-DD): ");
                    String fechaInicioStr = scanner.nextLine();
                    LocalDate fechaInicio = LocalDate.parse(fechaInicioStr);
                    System.out.print("Ingrese los detalles del conflicto: ");
                    String detalles = scanner.nextLine();
                    Conflicto conflicto = new Conflicto(nombreConflicto, fechaInicio, detalles);
                    onu.agregarConflicto(conflicto);
                    break;
                case 2:
                    System.out.print("Ingrese el nombre del conflicto: ");
                    nombreConflicto = scanner.nextLine();
                    Conflicto conflictoSeleccionado = null;
                    for (Conflicto c : onu.conflictos) {
                        if (c.getNombreConflicto().equals(nombreConflicto)) {
                            conflictoSeleccionado = c;
                            break;
                        }
                    }
                    if (conflictoSeleccionado != null) {
                        System.out.print("Ingrese el nombre del país: ");
                        String nombrePais = scanner.nextLine();
                        System.out.print("¿Es un país de primer mundo? (true/false): ");
                        boolean primerMundo = scanner.nextBoolean();
                        System.out.print("Ingrese la población del país: ");
                        int poblacion = scanner.nextInt();
                        scanner.nextLine();  // Consumir la nueva línea
                        Pais pais = new Pais(nombrePais, primerMundo, poblacion);
                        conflictoSeleccionado.agregarPais(pais);
                    } else {
                        System.out.println("Conflicto no encontrado.");
                    }
                    break;
                case 3:
                    System.out.print("Ingrese el nombre del conflicto: ");
                    nombreConflicto = scanner.nextLine();
                    conflictoSeleccionado = null;
                    for (Conflicto c : onu.conflictos) {
                        if (c.getNombreConflicto().equals(nombreConflicto)) {
                            conflictoSeleccionado = c;
                            break;
                        }
                    }
                    if (conflictoSeleccionado != null) {
                        System.out.print("Ingrese el nombre del evento: ");
                        String nombreEvento = scanner.nextLine();
                        System.out.print("Ingrese la fecha del evento (AAAA-MM-DD): ");
                        String fechaEventoStr = scanner.nextLine();
                        LocalDate fechaEvento = LocalDate.parse(fechaEventoStr);
                        System.out.print("Ingrese la ubicación del evento: ");
                        String ubicacion = scanner.nextLine();
                        System.out.print("Ingrese la descripción del evento: ");
                        String descripcion = scanner.nextLine();
                        Evento evento = new Evento(nombreEvento, fechaEvento, ubicacion, descripcion);
                        conflictoSeleccionado.agregarEvento(evento);
                    } else {
                        System.out.println("Conflicto no encontrado.");
                    }
                    break;
                case 4:
                    onu.mostrarConflictos();
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
