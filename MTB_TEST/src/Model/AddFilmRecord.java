/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import com.mysql.cj.protocol.Resultset;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class AddFilmRecord {
    Statement stmt;
    
    
    public void Form(String movie_name, String time){
       int movie_id = 0;
       try{
         stmt = DbConnection.getStatementConnection();
         ResultSet rs = stmt.executeQuery("SELECT MAX(m_id) FROM movie");
         if(rs.next()){
             int lastid= rs.getInt(1);
             lastid=lastid+1;
             movie_id=lastid;
         }
         
            stmt.executeUpdate("INSERT INTO movie VALUES ('"+movie_id+"','"+movie_name+"','"+time+"')");
         
       }
       catch(Exception e){
         e.printStackTrace();
       }
    }

    
}

