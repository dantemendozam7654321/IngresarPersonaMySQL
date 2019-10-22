package ejemplopersona;

import java.sql.*;
import javax.swing.JOptionPane;

public class Conexion {
    
    public String db = "crud-poo";
    public String url = "jdbc:mysql://localhost/"+db;
    public String user = "root";
    public String pass = "";
    
    public Connection Conectar(){
        
        Connection  link = null;
        try{
            Class.forName("org.gjt.mm.mysql.Driver");
            link = DriverManager.getConnection(this.url, this.user, this.pass);
            if(link!=null){
                System.out.println("Conexion Exitosa");
            }
            
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex);
        }
        return link;
    }
    
    public static void main(String[] args){
        Conexion conn = new Conexion();
        conn.Conectar();
    }
    
}
