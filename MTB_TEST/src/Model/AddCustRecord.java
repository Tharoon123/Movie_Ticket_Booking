/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;



import View.Add_Customer_Cus;
import View.Add_Customer_Admin;
import java.sql.ResultSet;
import java.sql.Statement;

public class AddCustRecord{
    Statement stmt;
    int cus_id =0;
    public void Formcus(String name,String password,String telno,String city){
       try{
            stmt = DbConnection.getStatementConnection();
           ResultSet rs = stmt.executeQuery("SELECT MAX(cus_id) FROM customer");
            if(rs.next()){
             int lastid = rs.getInt(1);
             lastid=lastid+1;
             cus_id = lastid;
             }
            Add_Customer_Cus load2=new Add_Customer_Cus();
            load2.show(cus_id);

         
         stmt.executeUpdate("INSERT INTO customer VALUES ('"+cus_id+"', '"+name+"', '"+password+"', '"+telno+"', '"+city+"')");
       }
       catch(Exception e){
         e.printStackTrace();
       }
    }
    
    public void Formadmin(String name,String password,String telno,String city){
       try{
            stmt = DbConnection.getStatementConnection();
           ResultSet rs = stmt.executeQuery("SELECT MAX(cus_id) FROM customer");
            if(rs.next()){
             int lastid = rs.getInt(1);
             lastid=lastid+1;
             cus_id = lastid;
             }
            
            Add_Customer_Admin load3=new Add_Customer_Admin();
            load3.show(cus_id);
            
         
         stmt.executeUpdate("INSERT INTO customer VALUES ('"+cus_id+"', '"+name+"', '"+password+"', '"+telno+"', '"+city+"')");
       }
       catch(Exception e){
         e.printStackTrace();
       }
    }

    
}

    