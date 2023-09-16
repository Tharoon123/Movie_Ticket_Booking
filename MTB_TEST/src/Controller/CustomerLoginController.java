/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import View.Dashboard_Main;
import Model.DbConnection;
import Model.DbCustSearch;
import java.awt.Frame;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import View.Login_Admin;
import View.Login_Customer;
import View.Seat_Reserving_Customer;

public class CustomerLoginController {
    public static void login(String usname,String pass){
      try{
        String username =null;
        String password =null;
        
        ResultSet rs = new DbCustSearch().Main_Login(usname);
        while(rs.next()){
        username = rs.getString("cus_name");
        password = rs.getString("password");
        
        }
        if(username!= null && password != null){
           if(password.equals(pass)){
                JOptionPane.showMessageDialog(null, "Login Successful", "Welcome ", JOptionPane.INFORMATION_MESSAGE);
           
                Login_Customer close=new Login_Customer();
                close.close();
                Seat_Reserving_Customer go= new Seat_Reserving_Customer();
                go.setVisible(true);
                
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
              ex.printStackTrace();
        }
      }
    
}

   
    

