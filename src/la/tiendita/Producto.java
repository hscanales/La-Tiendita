/*
 * 
 * 
 * 
 */
package la.tiendita;

/**
 *
 * @author HsCanales <00136317@uca.edu.sv>
 */
public class Producto {
    private String nombre;
    private int costo,preciodeventa,cantidad;
    boolean seVende;

    
    public Producto() {
    }

    public Producto(String nombre, int cantidad, int costo, int preciodeventa, boolean seVende) {
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.costo = costo;
        this.preciodeventa = preciodeventa;
        this.seVende = seVende;
    }

    public boolean isSeVende() {
        return seVende;
    }

    public void setSeVende(boolean seVende) {
        this.seVende = seVende;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getCosto() {
        return costo;
    }

    public void setCosto(int costo) {
        this.costo = costo;
    }

    public int getPreciodeventa() {
        return preciodeventa;
    }

    public void setPreciodeventa(int preciodeventa) {
        this.preciodeventa = preciodeventa;
    }
    
    
    
}
