/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author This PC
 */
public class DBReservation {
        Statement stmt;
        ResultSet rs;
    
    public ResultSet ViewReservation() {
       
            try {
                stmt=DbConnection.getStatementConnection();
                rs=stmt.executeQuery("SELECT * FROM movieseats");
                
            } catch (SQLException ex) {
               ex.printStackTrace();
            }
            
        return rs;
    }
    
}
