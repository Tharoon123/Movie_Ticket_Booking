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
public class AddMovieController {
     public static void Form(String movieName, String time){
     new Model.AddFilmRecord().Form(movieName, time);
     JOptionPane.showMessageDialog(null, "New Record has been inserted ", "Successfull", JOptionPane.INFORMATION_MESSAGE);
    
     }
}
