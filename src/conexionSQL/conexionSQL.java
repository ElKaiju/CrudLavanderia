/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conexionSQL;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author ztx187
 */
public class conexionSQL {
    
    Connection conectar = null;
    
    public Connection conexion(){
        try {
            
            Class.forName("com.mysql.jdbc.Driver");
            
            conectar = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/LavanderiaCRUD","root","");
            
            JOptionPane.showMessageDialog(null, "Conectado exitosamente a la base de datos. Bienvenido a ExtraLimpio Software.");
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error de conexión" + e.toString());
        }
        
        return conectar;
    }
    
}
