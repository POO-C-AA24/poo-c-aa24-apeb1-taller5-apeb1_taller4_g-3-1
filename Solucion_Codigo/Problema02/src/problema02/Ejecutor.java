package problema02;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejecutor {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Estudiante> estudiantes = new ArrayList<>();

        boolean continuar = true;

        while (continuar) {
            System.out.println("Seleccione una opción:");
            System.out.println("1. Ingresar datos de un estudiante");
            System.out.println("2. Ingresar datos de una materia");
            System.out.println("3. Vincular materia a estudiante");
            System.out.println("4. Verificar aprobación de materia");
            System.out.println("5. Realizar recuperación");
            System.out.println("6. Mostrar materias del estudiante");
            System.out.println("7. Salir");

            int opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el nombre del estudiante: ");
                    String nombreEstudiante = scanner.nextLine();
                    System.out.print("Ingrese la edad del estudiante: ");
                    int edad = scanner.nextInt();
                    estudiantes.add(new Estudiante(nombreEstudiante, edad));
                    break;
                case 2:
                    System.out.println("Ingrese el nombre del estudiante");
                    String nombreEstudiantes = scanner.nextLine();
                    System.out.print("Ingrese el nombre de la materia: ");
                    String nombreMateria = scanner.nextLine();
                    System.out.print("Ingrese la calificación de ACD: ");
                    double calificacionACD = scanner.nextDouble();
                    System.out.print("Ingrese la calificación de APE: ");
                    double calificacionAPE = scanner.nextDouble();
                    System.out.print("Ingrese la calificación de AA: ");
                    double calificacionAA = scanner.nextDouble();
                    Materia materia = new Materia(nombreMateria, calificacionACD, calificacionAPE, calificacionAA);
                    for (Estudiante estudiante : estudiantes) {
                        if (estudiante.getNombreEstudiante().equals(nombreEstudiantes)) {
                            estudiante.agregarMateria(materia);
                            break;
                        }
                    }
                    break;
                case 3:
                    System.out.print("Ingrese el nombre del estudiante: ");
                    String nombreEst = scanner.nextLine();
                    System.out.print("Ingrese el nombre de la materia: ");
                    String nombreMat = scanner.nextLine();
                    for (Estudiante estudiante : estudiantes) {
                        if (estudiante.getNombreEstudiante().equals(nombreEst)) {
                            for (Materia mat : estudiante.materias) {
                                if (mat.getNombresMateria().equals(nombreMat)) {
                                    estudiante.agregarMateria(mat);
                                    break;
                                }
                            }
                            break;
                        }
                    }
                    break;
                case 4:
                    System.out.print("Ingrese el nombre del estudiante: ");
                    nombreEst = scanner.nextLine();
                    System.out.print("Ingrese el nombre de la materia: ");
                    nombreMat = scanner.nextLine();
                    for (Estudiante estudiante : estudiantes) {
                        if (estudiante.getNombreEstudiante().equals(nombreEst)) {
                            estudiante.verificarAprobacion(nombreMat);
                            break;
                        }
                    }
                    break;
                case 5:
                    System.out.print("Ingrese el nombre del estudiante: ");
                    nombreEst = scanner.nextLine();
                    System.out.print("Ingrese el nombre de la materia: ");
                    nombreMat = scanner.nextLine();
                    System.out.print("Ingrese la nota de recuperación: ");
                    double notaRecuperacion = scanner.nextDouble();
                    for (Estudiante estudiante : estudiantes) {
                        if (estudiante.getNombreEstudiante().equals(nombreEst)) {
                            estudiante.realizarRecuperacion(nombreMat, notaRecuperacion);
                            break;
                        }
                    }
                    break;
                case 6:
                    System.out.print("Ingrese el nombre del estudiante: ");
                    nombreEst = scanner.nextLine();
                    for (Estudiante estudiante : estudiantes) {
                        if (estudiante.getNombreEstudiante().equals(nombreEst)) {
                            estudiante.mostrarMaterias();
                            break;
                        }
                    }
                    break;
                case 7:
                    continuar = false;
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        }
        scanner.close();
    }

}
