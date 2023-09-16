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
public class Delete_Reservation {

    public static void delRes(int id) {
       
        new Model.DeleteReservationRecord().DelResForm(id);
        
        JOptionPane.showMessageDialog(null, "Reservation Deleted...!", "Delete Successful", JOptionPane.WARNING_MESSAGE);
        
    }
    
}
