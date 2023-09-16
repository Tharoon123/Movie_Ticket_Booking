/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;


import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.JOptionPane;


/**
 *
 * @author This PC
 */
public class Loading extends javax.swing.JFrame {

    /**
     * Creates new form Loading
     */
    public Loading() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        loadingBar = new javax.swing.JProgressBar();
        txtLBL = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        perLBL = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        jLabel2.setText("jLabel2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        loadingBar.setBackground(new java.awt.Color(255, 255, 255));
        loadingBar.setForeground(new java.awt.Color(255, 0, 0));
        getContentPane().add(loadingBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 463, 800, 20));

        txtLBL.setFont(new java.awt.Font("Modern No. 20", 0, 24)); // NOI18N
        txtLBL.setForeground(new java.awt.Color(255, 255, 255));
        txtLBL.setText("Loading ...");
        getContentPane().add(txtLBL, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 430, 250, -1));

        jLabel3.setFont(new java.awt.Font("Arial Black", 3, 60)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 255, 255));
        jLabel3.setText("TASA Cinema ");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 10, 490, -1));

        perLBL.setFont(new java.awt.Font("Modern No. 20", 0, 36)); // NOI18N
        perLBL.setForeground(new java.awt.Color(255, 255, 255));
        perLBL.setText("0%");
        getContentPane().add(perLBL, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 410, -1, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/loading.gif"))); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 490));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Loading.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Loading.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Loading.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Loading.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        Loading load=new Loading();
        load.setVisible(true);
        
         try{
            File musicPath=new File("src\\Pictures\\intro5.wav");
            if(musicPath.exists()){
                AudioInputStream audioInput=AudioSystem.getAudioInputStream(musicPath);
                Clip clip=AudioSystem.getClip();
                clip.open(audioInput);
                clip.start();
                
            }
            else{
                System.out.println("Can't Find File");
            }
            
        }catch(Exception e){
            e.printStackTrace();
        }
        
        
        
        try{
            int x;
            for (x=0; x<=100; x++){
        
                Thread.sleep(100);
                load.perLBL.setText(x + "%");
                load.loadingBar.setValue(x);
                
            if(x==20){
                load.txtLBL.setText("Initializing Components...");
            }
            if(x==50){
                load.txtLBL.setText("Archiving Data...");
            }
            if(x==70){
                load.txtLBL.setText("Opennning Projects...");
            }
            if(x==90){
                load.txtLBL.setText("Launching Application...");
            }
            
            }
        
        }catch(Exception e){
                JOptionPane.showMessageDialog(null, "Error..."  , "Error Message", JOptionPane.INFORMATION_MESSAGE);
        }
        
        new Welcome().setVisible(true);
        load.dispose();

        
        /* Create and display the form */
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    public static javax.swing.JProgressBar loadingBar;
    public static javax.swing.JLabel perLBL;
    public static javax.swing.JLabel txtLBL;
    // End of variables declaration//GEN-END:variables
}