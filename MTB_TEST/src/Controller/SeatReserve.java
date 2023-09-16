/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import View.Payment_Admin;
import View.Payment_Customer;
import View.Seat_Reserving_Customer;
import javax.swing.JOptionPane;
import java.sql.ResultSet;

/**
 *
 * @author AYESHA
 */
public class SeatReserve {

    public static void seat(String name, String mid, String mname, int numseats) {
        
        
        
        if(numseats!=0){
            new Model.AddSeatReserve().Form(name,mid, mname, numseats);
            JOptionPane.showMessageDialog(null, "New Record has been inserted ", "Successfull", JOptionPane.INFORMATION_MESSAGE);
            Seat_Reserving_Customer.getFrames()[0].dispose();
            Payment_Admin go4=new Payment_Admin();
            go4.setVisible(true);
            Seat_Reserving_Customer.getFrames()[0].dispose();
        
        }
        if(numseats==0){
            JOptionPane.showConfirmDialog(null, "Please Re-Fill", "Error Please Re-fill", JOptionPane.ERROR_MESSAGE);
       
        }
        
    }
   
}
