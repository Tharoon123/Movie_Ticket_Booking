/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.sql.Statement;
import java.sql.ResultSet;

/**
 *
 * @author This PC
 */
public class DBUpdateRecord {
    
    Statement stmt;
    ResultSet rs;
    
    public void updateCus(int id, String name, String pword, String conpword, String tp, String city) {
        try{
            stmt=DbConnection.getStatementConnection();
            
            stmt.executeUpdate("UPDATE customer SET cus_name='"+name+"', password='"+pword+"', telno='"+tp+"', city='"+city+"' WHERE cus_id='"+id+"'");
            
        
        }catch(Exception e){
            e.printStackTrace();
        }
        
        
    }

    public void updateRes(int id, String name, int seats) {
      try{
            stmt=DbConnection.getStatementConnection();
            
            stmt.executeUpdate("UPDATE movieseats SET cus_name='"+name+"', no_seats='"+seats+"' WHERE reservation_id ='"+id+"'");
            
        
        }catch(Exception e){
            e.printStackTrace();
        }
        
    }

    public void updateMovie(int id, String name, String time) {
        try{
            stmt=DbConnection.getStatementConnection();
            stmt.executeUpdate("UPDATE movie SET m_name='"+name+"', m_time='"+time+"' WHERE m_id='"+id+"'");
            
        }catch(Exception e){
        e.printStackTrace();
        
        }
        
        
    }
    
    
    
}
