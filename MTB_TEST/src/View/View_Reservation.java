/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;


import Model.DBReservation;
import Model.DBSearchReservation;
import Model.DbConnection;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.Timer;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author This PC
 */
public class View_Reservation extends javax.swing.JFrame {

    /**
     * Creates new form View_Reservation
     */
    public View_Reservation() {
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

        jPanel1 = new javax.swing.JPanel();
        viewJP = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        resviewTBL = new javax.swing.JTable();
        dateLBL = new javax.swing.JLabel();
        timeLBL = new javax.swing.JLabel();
        backLBL = new javax.swing.JLabel();
        exitLBL = new javax.swing.JLabel();
        resviewLBL = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        deleteLBL = new javax.swing.JLabel();
        deleteResJP = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        deleteTF = new javax.swing.JTextField();
        deleteBTN = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        viewJP.setBackground(new java.awt.Color(0, 0, 51));

        jLabel12.setFont(new java.awt.Font("Book Antiqua", 1, 36)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Reservation Details");

        resviewTBL.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Reservation ID", "Name", "Movie ID", "Movie Name", "No:- of Seats"
            }
        ));
        jScrollPane1.setViewportView(resviewTBL);

        dateLBL.setFont(new java.awt.Font("Monotype Corsiva", 0, 24)); // NOI18N
        dateLBL.setForeground(new java.awt.Color(255, 255, 51));
        dateLBL.setText("0");

        timeLBL.setFont(new java.awt.Font("Monotype Corsiva", 0, 24)); // NOI18N
        timeLBL.setForeground(new java.awt.Color(255, 255, 51));
        timeLBL.setText("0");

        javax.swing.GroupLayout viewJPLayout = new javax.swing.GroupLayout(viewJP);
        viewJP.setLayout(viewJPLayout);
        viewJPLayout.setHorizontalGroup(
            viewJPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(viewJPLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel12)
                .addGap(124, 124, 124))
            .addGroup(viewJPLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(viewJPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 578, Short.MAX_VALUE)
                    .addGroup(viewJPLayout.createSequentialGroup()
                        .addComponent(timeLBL, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(dateLBL, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        viewJPLayout.setVerticalGroup(
            viewJPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(viewJPLayout.createSequentialGroup()
                .addContainerGap(14, Short.MAX_VALUE)
                .addGroup(viewJPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(timeLBL)
                    .addComponent(dateLBL))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        getContentPane().add(viewJP, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 0, 590, 260));

        backLBL.setFont(new java.awt.Font("Perpetua Titling MT", 1, 24)); // NOI18N
        backLBL.setForeground(new java.awt.Color(255, 255, 255));
        backLBL.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/backward.png"))); // NOI18N
        backLBL.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backLBLMouseClicked(evt);
            }
        });
        getContentPane().add(backLBL, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 460, 40, 50));

        exitLBL.setFont(new java.awt.Font("Perpetua Titling MT", 1, 24)); // NOI18N
        exitLBL.setForeground(new java.awt.Color(255, 255, 255));
        exitLBL.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/power.png"))); // NOI18N
        exitLBL.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitLBLMouseClicked(evt);
            }
        });
        getContentPane().add(exitLBL, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 460, 40, 50));

        resviewLBL.setFont(new java.awt.Font("Perpetua Titling MT", 1, 24)); // NOI18N
        resviewLBL.setForeground(new java.awt.Color(255, 255, 255));
        resviewLBL.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/dashboard.png"))); // NOI18N
        resviewLBL.setText("View Reservation");
        resviewLBL.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                resviewLBLMouseClicked(evt);
            }
        });
        getContentPane().add(resviewLBL, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, 300, 50));

        jLabel6.setBackground(new java.awt.Color(102, 0, 204));
        jLabel6.setFont(new java.awt.Font("Sitka Text", 3, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 255, 0));
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/tv.png"))); // NOI18N
        jLabel6.setText("TASA Cinema");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 300, 130));

        deleteLBL.setFont(new java.awt.Font("Perpetua Titling MT", 1, 24)); // NOI18N
        deleteLBL.setForeground(new java.awt.Color(255, 255, 255));
        deleteLBL.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/delete.png"))); // NOI18N
        deleteLBL.setText("Del: Reservation");
        deleteLBL.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                deleteLBLMouseClicked(evt);
            }
        });
        getContentPane().add(deleteLBL, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, 290, 50));

        deleteResJP.setBackground(new java.awt.Color(51, 0, 0));

        jLabel5.setFont(new java.awt.Font("Sitka Heading", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Enter Res_ID to be Deleted : - ");

        deleteBTN.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/delete.png"))); // NOI18N
        deleteBTN.setText("Delete");
        deleteBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteBTNActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/delete (1).png"))); // NOI18N

        javax.swing.GroupLayout deleteResJPLayout = new javax.swing.GroupLayout(deleteResJP);
        deleteResJP.setLayout(deleteResJPLayout);
        deleteResJPLayout.setHorizontalGroup(
            deleteResJPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(deleteResJPLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(deleteResJPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(deleteResJPLayout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(deleteTF, javax.swing.GroupLayout.DEFAULT_SIZE, 251, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, deleteResJPLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addGap(185, 185, 185))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, deleteResJPLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(deleteBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(178, 178, 178))
        );
        deleteResJPLayout.setVerticalGroup(
            deleteResJPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, deleteResJPLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(deleteResJPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(deleteTF, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addComponent(deleteBTN)
                .addGap(20, 20, 20))
        );

        getContentPane().add(deleteResJP, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 270, 590, 260));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/GRADIENT-3.png"))); // NOI18N
        jLabel2.setText("jLabel2");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, 530));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void backLBLMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backLBLMouseClicked
        // TODO add your handling code here:

        Dashboard_Main go= new Dashboard_Main();
        go.setVisible(true);
        super.dispose();
    }//GEN-LAST:event_backLBLMouseClicked

    public void clearfield(){
        
    }
    
    private void exitLBLMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitLBLMouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_exitLBLMouseClicked

    private void resviewLBLMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_resviewLBLMouseClicked
        // TODO add your handling code here:
        ResultSet r = new DBReservation().ViewReservation();
        DefaultTableModel dtm = (DefaultTableModel)resviewTBL.getModel();
        dtm.setRowCount(0);
        try {
            Vector v;
            while (r.next()){
                v=new Vector();
                v.add(r.getString("reservation_id"));
                v.add(r.getString("cus_name"));
                v.add(r.getString("m_id"));
                v.add(r.getString("m_name"));
                v.add(r.getString("no_seats"));
                dtm.addRow(v);
            }
            DbConnection.closeCon();
        }
        catch (Exception e){
            e.printStackTrace();
        }
        
        
    }//GEN-LAST:event_resviewLBLMouseClicked

    private void deleteLBLMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteLBLMouseClicked
        // TODO add your handling code here:
        
        
    }//GEN-LAST:event_deleteLBLMouseClicked

    private void deleteBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBTNActionPerformed
        // TODO add your handling code here:
        
        int id = Integer.parseInt(deleteTF.getText());
        
        Controller.Delete_Reservation.delRes(id);
        
    }//GEN-LAST:event_deleteBTNActionPerformed

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
            java.util.logging.Logger.getLogger(View_Reservation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(View_Reservation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(View_Reservation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(View_Reservation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new View_Reservation().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel backLBL;
    private javax.swing.JLabel dateLBL;
    private javax.swing.JButton deleteBTN;
    private javax.swing.JLabel deleteLBL;
    private javax.swing.JPanel deleteResJP;
    private javax.swing.JTextField deleteTF;
    private javax.swing.JLabel exitLBL;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel resviewLBL;
    private javax.swing.JTable resviewTBL;
    private javax.swing.JLabel timeLBL;
    private javax.swing.JPanel viewJP;
    // End of variables declaration//GEN-END:variables
}
