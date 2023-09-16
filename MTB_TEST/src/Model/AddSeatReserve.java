/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author AYESHA
 */
public class AddSeatReserve {
    Statement stmt;
    
    public void Form(String cus_name, String movieid, String mname,int numseats){
       int seat_id = 0;
       try{     
           stmt = DbConnection.getStatementConnection();
           ResultSet rs = stmt.executeQuery("SELECT MAX(reservation_id) FROM movieseats");
           
            if(rs.next()){
             int lastid= rs.getInt(1);
             seat_id=lastid+1;
             
            }
            
            
            
            
            stmt.executeUpdate("INSERT INTO movieseats VALUES ('"+seat_id+"', '"+cus_name+"', '"+movieid+"','"+mname+"', '"+numseats+"')");
          
        }
       catch(Exception e){
         e.printStackTrace();
       }
    }
    
}

