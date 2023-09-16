/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author This PC
 */
public class DBPwordSearch {
    Statement stmt; 
     ResultSet rs;
     
          
    public ResultSet psearch(int id){
      try{
        stmt = DbConnection.getStatementConnection();
        
        
        rs = stmt.executeQuery("SELECT * FROM customer where cus_id ='"+id+"'");
      }
      catch(Exception e){
        e.printStackTrace();
      }
      return rs;
    }
}
