/*
 * La Tiendita
 * Tarea Laboratorio#2 POO 01/2018
 * 
 */


package la.tiendita;

/**
 *
 * @author HsCanales <00136317@uca.edu.sv>
 */



public class LaTiendita {

   
    public static void main(String[] args) {
       SDVC Sistema= new SDVC();
       User user= new User();
       user.login();
       
       if(user.isAdmin() && user.isLogged()){
           //Verificamos si el usuario es administrador e inicio sesion en el sistema
       }
        
        
        
    }
    
}
