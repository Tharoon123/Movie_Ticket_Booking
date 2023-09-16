/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.sql.Statement;

/**
 *
 * @author This PC
 */
public class DeleteCustomer {
    
    Statement stmt;

    public void deletCus(int id) {
        try{
          //System.out.println(name);
      stmt = DbConnection.getStatementConnection();
      stmt.executeUpdate("DELETE FROM customer WHERE cus_id= '"+id+"' ");
      
    }
    catch(Exception e){
        e.printStackTrace();
    }
        
    }

    
    
}
