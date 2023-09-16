/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

import Controller.MovieDeleteController;
import Model.DBSearchMovie;
import Model.DbConnection;
import Model.DbCustSearch;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.Timer;

/**
 *
 * @author This PC
 */
public class View_Customers extends javax.swing.JFrame {

    /**
     * Creates new form View_Movie
     */
    public View_Customers() {
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

        jLabel6 = new javax.swing.JLabel();
        backLBL = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        viewTBL = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        dateLBL = new javax.swing.JLabel();
        timeLBL = new javax.swing.JLabel();
        exitLBL = new javax.swing.JLabel();
        deleteJP = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        deleteTF = new javax.swing.JTextField();
        deleteBTN = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        updateJP = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        idTF = new javax.swing.JTextField();
        updateBTN = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        nameTF = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        tpTF = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        cityTF = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        pwordTF = new javax.swing.JPasswordField();
        conpwordTF = new javax.swing.JPasswordField();
        updateLBL = new javax.swing.JLabel();
        deleteLBL = new javax.swing.JLabel();
        displayLBL = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setBackground(new java.awt.Color(102, 0, 204));
        jLabel6.setFont(new java.awt.Font("Sitka Text", 3, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 255, 0));
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/tv.png"))); // NOI18N
        jLabel6.setText("TASA Cinema");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 300, 130));

        backLBL.setFont(new java.awt.Font("Perpetua Titling MT", 1, 24)); // NOI18N
        backLBL.setForeground(new java.awt.Color(255, 255, 255));
        backLBL.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/backward.png"))); // NOI18N
        backLBL.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backLBLMouseClicked(evt);
            }
        });
        getContentPane().add(backLBL, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 470, 40, 50));

        jPanel1.setBackground(new java.awt.Color(0, 0, 51));

        viewTBL.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "CUS_ID", "Name", "Password", "Tel:- Num:", "City"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, false, true, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(viewTBL);

        jLabel2.setFont(new java.awt.Font("Algerian", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 102, 102));
        jLabel2.setText("Customer List");

        dateLBL.setFont(new java.awt.Font("Monotype Corsiva", 0, 24)); // NOI18N
        dateLBL.setForeground(new java.awt.Color(255, 255, 51));
        dateLBL.setText("0");

        timeLBL.setFont(new java.awt.Font("Monotype Corsiva", 0, 24)); // NOI18N
        timeLBL.setForeground(new java.awt.Color(255, 255, 51));
        timeLBL.setText("0");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(147, 147, 147))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 563, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(timeLBL, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(dateLBL, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(11, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(timeLBL)
                    .addComponent(dateLBL))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 0, 590, 230));

        exitLBL.setFont(new java.awt.Font("Perpetua Titling MT", 1, 24)); // NOI18N
        exitLBL.setForeground(new java.awt.Color(255, 255, 255));
        exitLBL.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/power.png"))); // NOI18N
        exitLBL.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitLBLMouseClicked(evt);
            }
        });
        getContentPane().add(exitLBL, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 470, 40, 50));

        deleteJP.setBackground(new java.awt.Color(51, 0, 0));

        jLabel5.setFont(new java.awt.Font("Sitka Heading", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Enter CUS_ID to be Deleted : - ");

        deleteBTN.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/delete.png"))); // NOI18N
        deleteBTN.setText("Delete");
        deleteBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteBTNActionPerformed(evt);
            }
        });

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/delete (1).png"))); // NOI18N

        javax.swing.GroupLayout deleteJPLayout = new javax.swing.GroupLayout(deleteJP);
        deleteJP.setLayout(deleteJPLayout);
        deleteJPLayout.setHorizontalGroup(
            deleteJPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(deleteJPLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(deleteTF, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
            .addGroup(deleteJPLayout.createSequentialGroup()
                .addGap(225, 225, 225)
                .addComponent(jLabel3)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, deleteJPLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(deleteBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(192, 192, 192))
        );
        deleteJPLayout.setVerticalGroup(
            deleteJPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, deleteJPLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel3)
                .addGap(31, 31, 31)
                .addGroup(deleteJPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(deleteTF, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(deleteBTN)
                .addGap(15, 15, 15))
        );

        getContentPane().add(deleteJP, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 240, 590, 290));

        updateJP.setBackground(new java.awt.Color(0, 102, 102));

        jLabel7.setFont(new java.awt.Font("Sitka Heading", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(204, 255, 153));
        jLabel7.setText("CUS_ID      : -");

        idTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idTFActionPerformed(evt);
            }
        });

        updateBTN.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/update.png"))); // NOI18N
        updateBTN.setText("Update");
        updateBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateBTNActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Sitka Heading", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(204, 255, 153));
        jLabel8.setText("New Name : -");

        jLabel9.setFont(new java.awt.Font("Sitka Heading", 1, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(204, 255, 153));
        jLabel9.setText("New TP No : -");

        jLabel10.setFont(new java.awt.Font("Sitka Heading", 1, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(204, 255, 153));
        jLabel10.setText("City              : -");

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/updated.png"))); // NOI18N

        jLabel11.setFont(new java.awt.Font("Sitka Heading", 1, 24)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(204, 255, 153));
        jLabel11.setText("New Pssword : -");

        jLabel12.setFont(new java.awt.Font("Sitka Heading", 1, 24)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(204, 255, 153));
        jLabel12.setText("Confrom Password: -");

        pwordTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pwordTFActionPerformed(evt);
            }
        });

        conpwordTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                conpwordTFActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout updateJPLayout = new javax.swing.GroupLayout(updateJP);
        updateJP.setLayout(updateJPLayout);
        updateJPLayout.setHorizontalGroup(
            updateJPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(updateJPLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(updateJPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(updateJPLayout.createSequentialGroup()
                        .addGroup(updateJPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9)
                            .addComponent(jLabel10))
                        .addGap(83, 83, 83)
                        .addGroup(updateJPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tpTF, javax.swing.GroupLayout.DEFAULT_SIZE, 191, Short.MAX_VALUE)
                            .addComponent(nameTF)
                            .addComponent(cityTF)))
                    .addGroup(updateJPLayout.createSequentialGroup()
                        .addGroup(updateJPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11)
                            .addComponent(jLabel7))
                        .addGap(59, 59, 59)
                        .addGroup(updateJPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(idTF)
                            .addComponent(pwordTF)))
                    .addGroup(updateJPLayout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(conpwordTF)))
                .addGap(18, 18, 18)
                .addGroup(updateJPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(updateBTN))
                .addContainerGap(16, Short.MAX_VALUE))
        );
        updateJPLayout.setVerticalGroup(
            updateJPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, updateJPLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(updateJPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(updateJPLayout.createSequentialGroup()
                        .addGroup(updateJPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(idTF, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(updateJPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(updateJPLayout.createSequentialGroup()
                                .addGap(5, 5, 5)
                                .addComponent(nameTF, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(updateJPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(updateJPLayout.createSequentialGroup()
                                .addComponent(pwordTF, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(updateJPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(conpwordTF, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(4, 4, 4)
                        .addGroup(updateJPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tpTF, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(updateJPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(updateBTN)
                    .addComponent(cityTF, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(127, 127, 127))
        );

        getContentPane().add(updateJP, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 240, 590, 290));

        updateLBL.setFont(new java.awt.Font("Perpetua Titling MT", 1, 24)); // NOI18N
        updateLBL.setForeground(new java.awt.Color(255, 255, 255));
        updateLBL.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/update.png"))); // NOI18N
        updateLBL.setText("update Customer");
        updateLBL.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                updateLBLMouseClicked(evt);
            }
        });
        getContentPane().add(updateLBL, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 310, 300, 50));

        deleteLBL.setFont(new java.awt.Font("Perpetua Titling MT", 1, 24)); // NOI18N
        deleteLBL.setForeground(new java.awt.Color(255, 255, 255));
        deleteLBL.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/delete.png"))); // NOI18N
        deleteLBL.setText("Delete Customer");
        deleteLBL.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                deleteLBLMouseClicked(evt);
            }
        });
        getContentPane().add(deleteLBL, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, 300, 50));

        displayLBL.setFont(new java.awt.Font("Perpetua Titling MT", 1, 24)); // NOI18N
        displayLBL.setForeground(new java.awt.Color(255, 255, 255));
        displayLBL.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/customer-service.png"))); // NOI18N
        displayLBL.setText("Show Customers");
        displayLBL.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                displayLBLMouseClicked(evt);
            }
        });
        getContentPane().add(displayLBL, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 290, 50));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/GRADIENT-3.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 910, 530));

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
            idTF.setText("");
            nameTF.setText("");
            pwordTF.setText("");
            conpwordTF.setText("");
            tpTF.setText("");
            cityTF.setText("");
        
          }
    private void exitLBLMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitLBLMouseClicked
        // TODO add your handling code here:
        System.exit(0);

    }//GEN-LAST:event_exitLBLMouseClicked

    private void updateLBLMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updateLBLMouseClicked
        // TODO add your handling code here:
        updateJP.setVisible(true);
        deleteJP.setVisible(false);
        
        
    }//GEN-LAST:event_updateLBLMouseClicked

    private void displayLBLMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_displayLBLMouseClicked
        // TODO add your handling code here:
        ResultSet r = new DbCustSearch().customerView();
        DefaultTableModel dtm = (DefaultTableModel)viewTBL.getModel();
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
    }//GEN-LAST:event_displayLBLMouseClicked

    private void deleteLBLMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteLBLMouseClicked
        // TODO add your handling code here:
        
        deleteJP.setVisible(true);
        updateJP.setVisible(false);
       
    }//GEN-LAST:event_deleteLBLMouseClicked

    private void deleteBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBTNActionPerformed
        // TODO add your handling code here:
        
        int id=Integer.parseInt(deleteTF.getText());
        
        Controller.Delete_Customer_Controller.deleteCus(id);
        
        deleteTF.setText("");
        
        
    }//GEN-LAST:event_deleteBTNActionPerformed
        
    
    private void updateBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateBTNActionPerformed
        // TODO add your handling code here:
        
        int id= Integer.parseInt(idTF.getText());
        String name=nameTF.getText();
        String pword=pwordTF.getText();
        String conpword=conpwordTF.getText();
        String tp=tpTF.getText();
        String city=cityTF.getText();
        
        Controller.Update_Controller.updateCus(id, name, pword, conpword, tp, city);
        
        clearfield();
        
    }//GEN-LAST:event_updateBTNActionPerformed

    private void idTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idTFActionPerformed

    private void pwordTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pwordTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pwordTFActionPerformed

    private void conpwordTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_conpwordTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_conpwordTFActionPerformed

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
            java.util.logging.Logger.getLogger(View_Customers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(View_Customers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(View_Customers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(View_Customers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new View_Customers().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel backLBL;
    private javax.swing.JTextField cityTF;
    private javax.swing.JPasswordField conpwordTF;
    private javax.swing.JLabel dateLBL;
    private javax.swing.JButton deleteBTN;
    private javax.swing.JPanel deleteJP;
    private javax.swing.JLabel deleteLBL;
    private javax.swing.JTextField deleteTF;
    private javax.swing.JLabel displayLBL;
    private javax.swing.JLabel exitLBL;
    private javax.swing.JTextField idTF;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField nameTF;
    private javax.swing.JPasswordField pwordTF;
    private javax.swing.JLabel timeLBL;
    private javax.swing.JTextField tpTF;
    private javax.swing.JButton updateBTN;
    private javax.swing.JPanel updateJP;
    private javax.swing.JLabel updateLBL;
    private javax.swing.JTable viewTBL;
    // End of variables declaration//GEN-END:variables
}
