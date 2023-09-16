/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import javax.swing.JOptionPane;

/**
 *
 * @author This PC
 */
public class Delete_Customer_Controller {

    public static void deleteCus(int id) {
        
        new Model.DeleteCustomer().deletCus(id);
        JOptionPane.showMessageDialog(null, "A Customer Record Deleted", "Delete Successful", JOptionPane.WARNING_MESSAGE);
        
        
    }
    
}
