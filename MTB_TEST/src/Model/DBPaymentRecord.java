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
public class DBPaymentRecord {
    Statement stmt;
    ResultSet rs;

    public void pay(int id, String name, int numseat, int tot) {
       
        
        int pay_id=0;
        
        try{
           stmt = DbConnection.getStatementConnection();
           rs = stmt.executeQuery("SELECT MAX(payment_id) FROM payment");
         if(rs.next()){
             int lastid= rs.getInt(1);
             lastid=lastid+1;
             pay_id=lastid;
         }
         
            stmt.executeUpdate("INSERT INTO payment VALUES ('"+pay_id+"','"+id+"','"+name+"','"+numseat+"','"+tot+"')");
         
            
            
        
        }catch(Exception e){
            e.printStackTrace();
        }
        
    
    }

    
    
}
