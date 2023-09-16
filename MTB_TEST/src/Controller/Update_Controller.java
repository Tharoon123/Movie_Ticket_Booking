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
public class Update_Controller {

    public static void updateCus(int id, String name, String pword, String conpword, String tp, String city) {
       new Model.DBUpdateRecord().updateCus(id, name, pword, conpword, tp, city);
       JOptionPane.showMessageDialog(null, "Your Record has Updated", "Complete", JOptionPane.INFORMATION_MESSAGE);
       
    }

    public static void updateReservation(int id, String name, int seats) {
       new Model.DBUpdateRecord().updateRes(id, name, seats);
       JOptionPane.showMessageDialog(null, "Your Record has Updated", "Complete", JOptionPane.INFORMATION_MESSAGE);
       
        
    
    }

    public static void updateMovie(int id, String name, String time) {
        new Model.DBUpdateRecord().updateMovie(id, name, time);
        JOptionPane.showMessageDialog(null, "Your Record has Updated", "Complete", JOptionPane.INFORMATION_MESSAGE);
          
    }
    
    
}
