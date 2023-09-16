/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author tharo
 */

import Model.DbConnection;
import java.sql.ResultSet;
import java.sql.Statement;

public class DBSearchMovie {
    Statement stmt;
    ResultSet rs;
   public ResultSet searchMovie(){
     try{
          stmt = DbConnection.getStatementConnection();
          rs = stmt.executeQuery("SELECT * FROM movie");
     }  
     catch (Exception e){
         e.printStackTrace();
     }
       return rs;
   }    
}
