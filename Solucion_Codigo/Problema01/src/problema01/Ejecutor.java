package problema01;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejecutor {

    public static void main(String[] args) {
        ArrayList<Producto> tienda = new ArrayList<>();
        tienda.add(new Producto("Laptop", 1200, 10));
        tienda.add(new Producto("Mouse", 20, 50));
        tienda.add(new Producto("Teclado", 50, 30));

        CarritoDeCompras carrito = new CarritoDeCompras(tienda);

        Scanner scanner = new Scanner(System.in);
        boolean continuar = true;

        while (continuar) {
            System.out.println("Seleccione una opción:");
            System.out.println("1. Agregar producto al carrito");
            System.out.println("2. Calcular total");
            System.out.println("3. Realizar pago");
            System.out.println("4. Mostrar detalle de compra");
            System.out.println("5. Salir");

            int opcion = scanner.nextInt();
            scanner.nextLine();  // Consumir la nueva línea

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el nombre del producto: ");
                    String nombre = scanner.nextLine();
                    System.out.print("Ingrese la cantidad: ");
                    int cantidad = scanner.nextInt();
                    carrito.agregarProducto(nombre, cantidad);
                    break;
                case 2:
                    double total = carrito.calcularTotal();
                    System.out.println("El total de la compra es: $" + total);
                    break;
                case 3:
                    System.out.print("Ingrese el monto pagado: ");
                    double montoPagado = scanner.nextDouble();
                    System.out.print("Ingrese el descuento: ");
                    double descuento = scanner.nextDouble();
                    carrito.realizarPago(montoPagado, descuento);
                    break;
                case 4:
                    carrito.mostrarDetalleCompra();
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
