/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.sql.ResultSet;
import java.sql.Statement;

public class DbCustSearch {
    
     Statement stmt; 
     ResultSet rs;
     
          
    public ResultSet Main_Login(String usname){
      try{
        stmt = DbConnection.getStatementConnection();
       
        rs = stmt.executeQuery("SELECT * FROM customer where cus_name ='"+usname+"'");
      }
      catch(Exception e){
        e.printStackTrace();
      }
      return rs;
    }
    
    public ResultSet customerView(){
        try{
            stmt=DbConnection.getStatementConnection();
            rs=stmt.executeQuery("SELECT * FROM customer");
                
        
        }catch(Exception e){
            e.printStackTrace();
        }
        
    
        return rs;
    }
}
