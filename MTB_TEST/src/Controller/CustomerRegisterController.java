/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import javax.swing.JOptionPane;

/**
 *
 * @author AYESHA
 */
public class CustomerRegisterController {
   
     public static void Formcus(String custName,String password,String telnum,String city,String conpword){
        
        int x =Integer.parseInt(password);
        int y =Integer.parseInt(conpword);
        
        if(x!=y){
            JOptionPane.showMessageDialog(null, "Password Doesn't Match", "Re-Enter", JOptionPane.ERROR_MESSAGE);
        
        }
        if(x==y){
        new Model.AddCustRecord().Formcus(custName,password,telnum,city);
        JOptionPane.showMessageDialog(null, "New Record has been inserted ", "Successfull", JOptionPane.INFORMATION_MESSAGE);
        }
        
     
     }
     
     public static void Formadmin(String custName,String password,String telnum,String city,String conpword){
        
        int x =Integer.parseInt(password);
        int y =Integer.parseInt(conpword);
        
        if(x!=y){
            JOptionPane.showMessageDialog(null, "Password Doesn't Match", "Re-Enter", JOptionPane.ERROR_MESSAGE);
        
        }
        if(x==y){
        new Model.AddCustRecord().Formadmin(custName,password,telnum,city);
        JOptionPane.showMessageDialog(null, "New Record has been inserted ", "Successfull", JOptionPane.INFORMATION_MESSAGE);
        }
        
     
     }
}
    
