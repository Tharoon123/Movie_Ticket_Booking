/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import javax.swing.JOptionPane;

/**
 *
 * @author tharo
 */
public class MovieDeleteController {

    public static void movie(String id) {
     new Model.DeleteMovieRecord().Form(id);    
     JOptionPane.showMessageDialog(null, "Record Deleted ", "Successfull", JOptionPane.WARNING_MESSAGE);
       
        
    }
    
}
