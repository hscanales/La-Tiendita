/* System Administrator
 * 
 * 
 * 
 */
package la.tiendita;

/**
 *
 * @author HsCanales <00136317@uca.edu.sv>
 */
public class Admon {
    
    private String nombre,username,contraseña;
    private boolean logged;
    
    public Admon(){
        logged=false;
    }
    
    public Admon(String nombre, String username, String contraseña){
        this.nombre=nombre;
        this.username=username;
        this.contraseña=contraseña;
    }

    public boolean isLogged() {
        return logged;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }
    
    
    
}
