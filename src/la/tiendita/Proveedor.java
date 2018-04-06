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
public class Proveedor {
    private String nombre,apellido,telefono,email;
    private ArrayList<Empresa> listadeEmpresas;

    public Proveedor(String nombre, String apellido, String telefono, String email) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.email = email;
        this.listadeEmpresas = new ArrayList<>();
    }
  
    public Proveedor(){
        this.listadeEmpresas = new ArrayList<>();        
    }    
    
    public void cargarLista(){
        //Carga una lista de empresas con las que trabaja el proveedor
        Empresa empresa= new Empresa();
        listadeEmpresas.add(empresa);
    }
    
    public ArrayList<Empresa> getLista(){
        return listadeEmpresas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    
    
    
}
