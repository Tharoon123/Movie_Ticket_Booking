/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.sql.Statement;

/**
 *
 * @author tharo
 */
public class DeleteReservationRecord {
    Statement stmt;
    public void DelResForm(int id) {
        try{
          
      stmt = DbConnection.getStatementConnection();
      stmt.executeUpdate("DELETE FROM movieseats WHERE reservation_id= '"+id+"' ");
      
    }
    catch(Exception e){
        e.printStackTrace();
    }
    
    }
    
}
