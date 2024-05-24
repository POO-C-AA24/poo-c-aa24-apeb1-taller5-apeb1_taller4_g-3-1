package problema01;

import java.util.ArrayList;

public class CarritoDeCompras {

    public ArrayList<Producto> carrito;
    public ArrayList<Producto> tienda;

    public CarritoDeCompras(ArrayList<Producto> tienda) {
        this.carrito = new ArrayList<>();
        this.tienda = tienda;
    }

    public void agregarProducto(String nombre, int cantidad) {
        for (Producto productoTienda : tienda) {
            if (productoTienda.getNombreProducto().equals(nombre)) {
                if (productoTienda.getCantidadProducto() >= cantidad) {
                    carrito.add(new Producto(nombre, productoTienda.getPrecioProducto(), cantidad));
                    productoTienda.setCantidadProducto(productoTienda.getCantidadProducto() - cantidad);
                    System.out.println("Producto agregado al carrito.");
                } else {
                    System.out.println("No hay suficiente cantidad disponible del producto.");
                }
                return;
            }
        }
        System.out.println("El producto no existe en la tienda.");
    }

    public double calcularTotal() {
        double total = 0;
        for (Producto producto : carrito) {
            total += producto.getPrecioProducto() * producto.getCantidadProducto();
        }
        return total;
    }

    public void mostrarDetalleCompra() {
        System.out.println("Detalle de la compra:");
        for (Producto producto : carrito) {
            System.out.println("Producto: " + producto.getNombreProducto() + ", Cantidad: " + producto.getCantidadProducto() + ", Precio: $" + producto.getPrecioProducto());
        }
    }

    public void realizarPago(double montoPagado, double descuento) {
        double total = calcularTotal();
        if (total > 1000) {
            total -= descuento;
            System.out.println("Descuento aplicado: $" + descuento);
        }
        if (montoPagado >= total) {
            System.out.println("Pago realizado con éxito. Gracias por su compra.");
            carrito.clear(); 
        } else {
            System.out.println("Monto insuficiente. Faltan $" + (total - montoPagado));
        }
    }
}
