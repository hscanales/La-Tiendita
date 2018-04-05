/*
 * 
 * 
 * 
 */
package la.tiendita;

import java.util.ArrayList;

/**
 *
 * @author HsCanales <00136317@uca.edu.sv>
 */
public class Empresa {
    private ArrayList<Producto> lista; //Lista de productos ofrecedios por la empresa
    private String Nombre,Email,Telefono;

    public Empresa( String Nombre, String Email, String Telefono) {
        lista = new ArrayList<>();
        this.Nombre = Nombre;
        this.Email = Email;
        this.Telefono = Telefono;
    }

    
    
    
    public ArrayList<Producto> getLista() {
        return lista;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getTelefono() {
        return Telefono;
    }

    public void setTelefono(String Telefono) {
        this.Telefono = Telefono;
    }
    
    
}
