package problema03;

import java.util.Scanner;

public class Ejecutor {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el nombre de la empresa: ");
        String nombreEmpresa = scanner.nextLine();
        System.out.print("Ingrese el RUC de la empresa: ");
        String ruc = scanner.nextLine();
        System.out.print("Ingrese la dirección de la empresa: ");
        String direccion = scanner.nextLine();

        Empresa empresa = new Empresa(nombreEmpresa, ruc, direccion);

        boolean continuar = true;

        while (continuar) {
            System.out.println("Seleccione una opción:");
            System.out.println("1. Agregar departamento");
            System.out.println("2. Mostrar departamentos");
            System.out.println("3. Salir");

            int opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el nombre del departamento: ");
                    String nombreDepartamento = scanner.nextLine();
                    System.out.print("Ingrese el número de empleados: ");
                    int numeroEmpleados = scanner.nextInt();
                    System.out.print("Ingrese la producción anual: ");
                    double produccionAnual = scanner.nextDouble();
                    Departamentos departamento = new Departamentos(nombreDepartamento, numeroEmpleados, produccionAnual);
                    empresa.agregarDepartamento(departamento);
                    break;
                case 2:
                    empresa.mostrarDepartamentos();
                    break;
                case 3:
                    continuar = false;
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        }
        scanner.close();
    }
}
