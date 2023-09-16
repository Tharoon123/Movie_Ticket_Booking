/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.DbAdminSearch;
import Model.DbConnection;
import Model.DbCustSearch;
import View.Login_Admin;
import View.Login_Employee;
import View.Login_Customer;
import View.Dashboard_Employee;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author AYESHA
 */
public class LoginController {
    

 
    public static void loginadmin(String usname,String pass){
      try{
        String username =null;
        String password = null;
        
        ResultSet rs = new DbAdminSearch().Main_Login(usname);
        while(rs.next()){
        username = rs.getString("name");
        password = rs.getString("password");
        
        }
        if(username!= null && password != null){
           if(password.equals(pass)){
               JOptionPane.showMessageDialog(null, "Login Successful", "Done", JOptionPane.INFORMATION_MESSAGE);
               Login_Admin go5=new Login_Admin();
               go5.complete();
               Dashboard_Employee login=new Dashboard_Employee();
               login.setVisible(true);
               
               
           }
           else{
              JOptionPane.showMessageDialog(null, "Please check the credentials ", "Error ", JOptionPane.ERROR_MESSAGE);
           }
        }
           else{
              JOptionPane.showMessageDialog(null, "Please check the credentials ", "Error ", JOptionPane.ERROR_MESSAGE);
           }
           DbConnection.closeCon();
           
        }
      
        catch(SQLException ex){
              Logger.getLogger(CustomerLoginController.class.getName()).log(Level.SEVERE, null, ex);  
        }
      }
}

   
    


    

