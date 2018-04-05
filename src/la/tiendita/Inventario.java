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
public class Inventario {
    private ArrayList<Producto> inventario;
    
    
    public Inventario(){
        inventario= new ArrayList<>();
    }
    
    
    public void add(Producto producto){
        if(producto!=null){
        inventario.add(producto);    
        }
        
    }
}
