/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

import Model.DBPwordSearch;
import Model.DBSearchMovie;
import Model.DbConnection;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Vector;
import javax.swing.Timer;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author This PC
 */
public class Customer_Forgot_Pword extends javax.swing.JFrame {

    /**
     * Creates new form Customer_Forgot_
     */
    public Customer_Forgot_Pword() {
        initComponents();
        date();
        time();
    }
    public void date(){
        Date d=new Date();
        SimpleDateFormat format=new SimpleDateFormat("YYYY-MM-dd");
        
        String date= format.format(d);
        dateLBL.setText(date);
    
    }
    
     public void time(){
         new Timer(0, new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e) {
                 Date d2=new Date();
                 SimpleDateFormat format=new SimpleDateFormat("hh:mm:ss a");
                 String time=format.format(d2);
                 timeLBL.setText(time);
                 
                 
             }
         }).start();
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        exitLBL = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        dashboardLBL = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        idTF = new javax.swing.JTextField();
        findBTN = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        recoverTBL = new javax.swing.JTable();
        timeLBL = new javax.swing.JLabel();
        dateLBL = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        exitLBL.setFont(new java.awt.Font("Perpetua Titling MT", 1, 24)); // NOI18N
        exitLBL.setForeground(new java.awt.Color(255, 255, 255));
        exitLBL.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/power.png"))); // NOI18N
        exitLBL.setText(" Exit");
        exitLBL.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitLBLMouseClicked(evt);
            }
        });
        getContentPane().add(exitLBL, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 400, 130, 50));

        jLabel6.setBackground(new java.awt.Color(102, 0, 204));
        jLabel6.setFont(new java.awt.Font("Sitka Text", 3, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 255, 0));
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/tv.png"))); // NOI18N
        jLabel6.setText("TASA Cinema");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 300, 130));

        dashboardLBL.setFont(new java.awt.Font("Perpetua Titling MT", 1, 24)); // NOI18N
        dashboardLBL.setForeground(new java.awt.Color(255, 255, 255));
        dashboardLBL.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/backward.png"))); // NOI18N
        dashboardLBL.setText(" Back to Login");
        dashboardLBL.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dashboardLBLMouseClicked(evt);
            }
        });
        getContentPane().add(dashboardLBL, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, 270, 50));

        jPanel1.setBackground(new java.awt.Color(0, 51, 51));

        jLabel1.setFont(new java.awt.Font("Stencil", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 0));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/question.png"))); // NOI18N
        jLabel1.setText("Find Password");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 30)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Enter UserID :-");

        findBTN.setBackground(new java.awt.Color(0, 51, 0));
        findBTN.setFont(new java.awt.Font("Sitka Display", 0, 24)); // NOI18N
        findBTN.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/file.png"))); // NOI18N
        findBTN.setText("Find");
        findBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                findBTNActionPerformed(evt);
            }
        });

        recoverTBL.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        recoverTBL.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID", "Name", "Password", "Contact No:-", "CIty"
            }
        ));
        jScrollPane1.setViewportView(recoverTBL);

        timeLBL.setFont(new java.awt.Font("Monotype Corsiva", 0, 24)); // NOI18N
        timeLBL.setForeground(new java.awt.Color(255, 255, 51));
        timeLBL.setText("0");

        dateLBL.setFont(new java.awt.Font("Monotype Corsiva", 0, 24)); // NOI18N
        dateLBL.setForeground(new java.awt.Color(255, 255, 51));
        dateLBL.setText("0");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(82, 82, 82)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                            .addGap(20, 20, 20)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(timeLBL, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(dateLBL, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(findBTN)
                                        .addComponent(idTF, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 519, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(15, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(timeLBL)
                    .addComponent(dateLBL))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(61, 61, 61)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(idTF, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(findBTN)
                .addGap(52, 52, 52)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 0, 540, 510));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/dark-blue-green-gradient-4k-i4-1360x768.jpg"))); // NOI18N
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(-3, 0, 850, 510));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    
    
    private void dashboardLBLMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dashboardLBLMouseClicked
        // TODO add your handling code here:

        Login_Customer go= new Login_Customer();
        go.setVisible(true);
        super.dispose();
    }//GEN-LAST:event_dashboardLBLMouseClicked

    private void exitLBLMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitLBLMouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_exitLBLMouseClicked

    private void findBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_findBTNActionPerformed
       
        int id=Integer.parseInt(idTF.getText());
        
        System.out.println(id);
        
        ResultSet r = new DBPwordSearch().psearch(id);
        DefaultTableModel dtm = (DefaultTableModel)recoverTBL.getModel();
        dtm.setRowCount(0);
        try {
            Vector v;
            while (r.next()){
                v=new Vector();
                v.add(r.getString("cus_id"));
                v.add(r.getString("cus_name"));
                v.add(r.getString("password"));
                v.add(r.getString("telno"));
                v.add(r.getString("city"));
                dtm.addRow(v);
            }
            DbConnection.closeCon();
        }
        catch (Exception e){
            e.printStackTrace();
        }
        
    }//GEN-LAST:event_findBTNActionPerformed

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
            java.util.logging.Logger.getLogger(Customer_Forgot_Pword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Customer_Forgot_Pword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Customer_Forgot_Pword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Customer_Forgot_Pword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Customer_Forgot_Pword().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel dashboardLBL;
    private javax.swing.JLabel dateLBL;
    private javax.swing.JLabel exitLBL;
    private javax.swing.JButton findBTN;
    private javax.swing.JTextField idTF;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable recoverTBL;
    private javax.swing.JLabel timeLBL;
    // End of variables declaration//GEN-END:variables
}
