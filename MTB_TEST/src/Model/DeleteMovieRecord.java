/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.sql.Statement;

/**
 *
 * @author AYESHA
 */
public class DeleteMovieRecord {
    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author student.lab1
 */

  
    Statement stmt;
    
    public void Form(String id){
    try{
          //System.out.println(name);
      stmt = DbConnection.getStatementConnection();
      stmt.executeUpdate("DELETE FROM movie WHERE m_id= '"+id+"' ");
      
    }
    catch(Exception e){
        e.printStackTrace();
    }
    
    }
}
    

