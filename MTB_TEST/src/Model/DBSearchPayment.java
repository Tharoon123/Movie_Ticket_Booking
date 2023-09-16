/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author This PC
 */
public class DBSearchPayment {
    Statement stmt;
    ResultSet rs;
    int lastid=0;
    
    public ResultSet searchReservation(){
        try {
            
            stmt=DbConnection.getStatementConnection();
            
            rs = stmt.executeQuery("SELECT MAX(reservation_id) FROM movieseats");
             if(rs.next()){
             lastid= rs.getInt(1);
             
            }
            rs = stmt.executeQuery("SELECT reservation_id,cus_name,no_seats FROM movieseats WHERE reservation_id = '"+lastid+"'");
            
        
        }catch(Exception e){
            e.printStackTrace();
        }
            
        
        return rs;
    }
    
    public ResultSet ViewPayment(){
        try{
            stmt=DbConnection.getStatementConnection();
            rs=stmt.executeQuery("SELECT * FROM payment");
        
        }catch(Exception e){
            e.printStackTrace();
        }
    
        return rs;
    }

    public void clear(int id) {
        try{
            stmt=DbConnection.getStatementConnection();
            stmt.executeUpdate("DELETE FROM payment WHERE payment_id = '"+id+"'");
            System.out.println(id);
            
            
        }catch(Exception e){
        
            e.printStackTrace();
        }
        
       
    }

    
    
}
