/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author tharo
 */
public class DBSearchReservation {
    Statement stmt;
    ResultSet rs;
   public ResultSet searchReservation(){
     try{
          stmt = DbConnection.getStatementConnection();
          rs = stmt.executeQuery("SELECT * FROM movieseats");
     }  
     catch (Exception e){
         e.printStackTrace();
     }
       return rs;
   }    
}
