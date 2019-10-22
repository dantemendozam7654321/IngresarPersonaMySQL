package ejemplopersona;

import java.sql.*;
import java.util.Vector;

public class MetodosPersona {
    
    public Vector listaPersonas =new Vector();
    Conexion jeancarlos = new Conexion();
    
    public void ingresar(Object x){
    
        listaPersonas.add(x);
        
    }
   public void ingresarPersonaDB(){
       String consulta = "";
       consulta = "INSERT INTO persona"
                +"(identificador, nombre, appaterno, apmaterno) "
                +" values('5','Jorge','Ccamerccoa','Huillca')"; 
       try{
       Statement st = jeancarlos.Conectar().createStatement();
       st.executeUpdate(consulta);
       st.close();
       jeancarlos.Conectar().close();     
       
       System.out.println("Llamada agregada con exito a la base de datos. ");
       } catch (SQLException e) {
           System.out.println("Error!, la llama no pudo ser agregada a la base de datos");
           System.out.println(""+e.getMessage());
       }
   }
   public static void main(String[] args){
       MetodosPersona mp = new MetodosPersona();
       mp.ingresarPersonaDB();
   }

}
