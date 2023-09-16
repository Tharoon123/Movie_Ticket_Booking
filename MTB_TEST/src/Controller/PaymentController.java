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
public class PaymentController {

    public static void pay(int id, String name, int numseat, int tot) {
        new Model.DBPaymentRecord().pay(id, name, numseat, tot);
        JOptionPane.showMessageDialog(null, "Your Payment is Pending...", "Pay at the Gate", JOptionPane.INFORMATION_MESSAGE);
    
    
    }

    public static void clearPay(int id) {
 
        new Model.DBSearchPayment().clear(id);
        JOptionPane.showMessageDialog(null, "Your Payment Recieved", "Payment Clear", JOptionPane.WARNING_MESSAGE);
        
    }

    
    
    
   
    
}
