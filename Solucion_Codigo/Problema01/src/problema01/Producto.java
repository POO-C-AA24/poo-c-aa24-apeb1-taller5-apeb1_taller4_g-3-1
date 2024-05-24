/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package problema01;

/**
 *
 * @author VEL-USER
 */
public class Producto {
    public String nombreProducto;
    public double precioProducto;
    public int cantidadProducto;
    
    public Producto(String nombre, double precio, int cantidad) {
        this.nombreProducto = nombre;
        this.precioProducto = precio;
        this.cantidadProducto = cantidad;
    }

    public void setCantidadProducto(int cantidadProducto) {
        this.cantidadProducto = cantidadProducto;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public double getPrecioProducto() {
        return precioProducto;
    }

    public int getCantidadProducto() {
        return cantidadProducto;
    }
}
