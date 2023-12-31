/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package views;

import controllers.DaftarController;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import models.Daftar;
import utils.ConstUtil;

/**
 *
 * @author ASUS
 */
public class mainViewKeasramaan extends javax.swing.JFrame {

    /**
     * Creates new form mainViewKeasramaan
     */
    public mainViewKeasramaan() {
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

        pnlMenu = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnHomeKeasramaan = new javax.swing.JButton();
        btnViewKeasramaan = new javax.swing.JButton();
        btnLogOut = new javax.swing.JButton();
        pnlMain = new javax.swing.JPanel();
        pnlHome = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        lblName = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        lblNamaKeasramaan = new javax.swing.JLabel();
        lblRoleKeasramaan = new javax.swing.JLabel();
        lblAsramaKeasramaan = new javax.swing.JLabel();
        lblUsernameKeasramaan = new javax.swing.JLabel();
        lblPasswordKeasramaan = new javax.swing.JLabel();
        pnlViewIK = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblDaftarReq = new javax.swing.JTable();
        jLabel14 = new javax.swing.JLabel();
        btnApproved = new javax.swing.JButton();
        btnDisapproved = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        txtKode = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        pnlMenu.setBackground(new java.awt.Color(0, 102, 153));

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 0, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Izin Keluar");

        btnHomeKeasramaan.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnHomeKeasramaan.setText("HOME");
        btnHomeKeasramaan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnHomeKeasramaanMouseClicked(evt);
            }
        });

        btnViewKeasramaan.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnViewKeasramaan.setText("VIEW IK");
        btnViewKeasramaan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnViewKeasramaanMouseClicked(evt);
            }
        });
        btnViewKeasramaan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewKeasramaanActionPerformed(evt);
            }
        });

        btnLogOut.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        btnLogOut.setText("Log Out");
        btnLogOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogOutActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlMenuLayout = new javax.swing.GroupLayout(pnlMenu);
        pnlMenu.setLayout(pnlMenuLayout);
        pnlMenuLayout.setHorizontalGroup(
            pnlMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlMenuLayout.createSequentialGroup()
                .addGroup(pnlMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlMenuLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1))
                    .addGroup(pnlMenuLayout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(pnlMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnLogOut, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(pnlMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(btnHomeKeasramaan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnViewKeasramaan, javax.swing.GroupLayout.DEFAULT_SIZE, 183, Short.MAX_VALUE)))))
                .addContainerGap(17, Short.MAX_VALUE))
        );
        pnlMenuLayout.setVerticalGroup(
            pnlMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlMenuLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel1)
                .addGap(35, 35, 35)
                .addComponent(btnHomeKeasramaan, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(btnViewKeasramaan, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 333, Short.MAX_VALUE)
                .addComponent(btnLogOut, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29))
        );

        pnlMain.setLayout(new java.awt.CardLayout());

        jLabel2.setFont(new java.awt.Font("Cambria", 0, 36)); // NOI18N
        jLabel2.setText("Selamat datang di MyAzik");

        lblName.setFont(new java.awt.Font("Cambria", 1, 24)); // NOI18N
        lblName.setText("{nama pengguna  disini}");

        jLabel4.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        jLabel4.setText("Nama         :");

        jLabel5.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        jLabel5.setText("Role            :");

        jLabel6.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        jLabel6.setText("Asrama      :");

        jLabel7.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        jLabel7.setText("Username :");

        jLabel8.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        jLabel8.setText("Password  :");

        lblNamaKeasramaan.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        lblNamaKeasramaan.setText("jLabel9");

        lblRoleKeasramaan.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        lblRoleKeasramaan.setText("jLabel10");

        lblAsramaKeasramaan.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        lblAsramaKeasramaan.setText("jLabel11");

        lblUsernameKeasramaan.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        lblUsernameKeasramaan.setText("jLabel12");

        lblPasswordKeasramaan.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        lblPasswordKeasramaan.setText("jLabel13");

        javax.swing.GroupLayout pnlHomeLayout = new javax.swing.GroupLayout(pnlHome);
        pnlHome.setLayout(pnlHomeLayout);
        pnlHomeLayout.setHorizontalGroup(
            pnlHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlHomeLayout.createSequentialGroup()
                .addGroup(pnlHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlHomeLayout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addGroup(pnlHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8))
                        .addGap(45, 45, 45)
                        .addGroup(pnlHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblUsernameKeasramaan)
                            .addComponent(lblPasswordKeasramaan)
                            .addComponent(lblAsramaKeasramaan)
                            .addComponent(lblRoleKeasramaan)
                            .addComponent(lblNamaKeasramaan)))
                    .addGroup(pnlHomeLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2)
                        .addGap(28, 28, 28)
                        .addComponent(lblName)))
                .addGap(0, 66, Short.MAX_VALUE))
        );
        pnlHomeLayout.setVerticalGroup(
            pnlHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlHomeLayout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(pnlHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(lblName))
                .addGap(147, 147, 147)
                .addGroup(pnlHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(lblNamaKeasramaan))
                .addGap(29, 29, 29)
                .addGroup(pnlHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(lblRoleKeasramaan))
                .addGap(35, 35, 35)
                .addGroup(pnlHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(lblAsramaKeasramaan))
                .addGap(41, 41, 41)
                .addGroup(pnlHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(lblUsernameKeasramaan))
                .addGap(31, 31, 31)
                .addGroup(pnlHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(lblPasswordKeasramaan))
                .addContainerGap(142, Short.MAX_VALUE))
        );

        pnlMain.add(pnlHome, "card2");

        tblDaftarReq.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        tblDaftarReq.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tblDaftarReq.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblDaftarReqMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblDaftarReq);

        jLabel14.setFont(new java.awt.Font("Cambria", 1, 36)); // NOI18N
        jLabel14.setText("Daftar Request IK");

        btnApproved.setBackground(new java.awt.Color(102, 255, 102));
        btnApproved.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        btnApproved.setText("Approve");
        btnApproved.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnApprovedActionPerformed(evt);
            }
        });

        btnDisapproved.setBackground(new java.awt.Color(255, 0, 51));
        btnDisapproved.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        btnDisapproved.setText("Disapprove");
        btnDisapproved.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnDisapprovedMouseClicked(evt);
            }
        });

        jLabel3.setText("Kode ");

        javax.swing.GroupLayout pnlViewIKLayout = new javax.swing.GroupLayout(pnlViewIK);
        pnlViewIK.setLayout(pnlViewIKLayout);
        pnlViewIKLayout.setHorizontalGroup(
            pnlViewIKLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlViewIKLayout.createSequentialGroup()
                .addGap(230, 230, 230)
                .addComponent(jLabel14)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(pnlViewIKLayout.createSequentialGroup()
                .addGroup(pnlViewIKLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlViewIKLayout.createSequentialGroup()
                        .addGap(219, 219, 219)
                        .addComponent(btnApproved, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(73, 73, 73)
                        .addComponent(btnDisapproved)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(pnlViewIKLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(pnlViewIKLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlViewIKLayout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addComponent(txtKode, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 749, Short.MAX_VALUE))))
                .addContainerGap())
        );
        pnlViewIKLayout.setVerticalGroup(
            pnlViewIKLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlViewIKLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel14)
                .addGap(27, 27, 27)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlViewIKLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtKode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 112, Short.MAX_VALUE)
                .addGroup(pnlViewIKLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnApproved, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDisapproved, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(55, 55, 55))
        );

        pnlMain.add(pnlViewIK, "card3");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnlMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlMain, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlMain, javax.swing.GroupLayout.DEFAULT_SIZE, 0, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnlMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnViewKeasramaanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewKeasramaanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnViewKeasramaanActionPerformed

    private void btnHomeKeasramaanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnHomeKeasramaanMouseClicked
         // TODO add your handling code here:
        pnlMain.removeAll();
        pnlMain.repaint();
        pnlMain.revalidate();
        
        // add panel
        
        pnlMain.add(pnlHome);
        pnlMain.repaint();
        pnlMain.revalidate();
    }//GEN-LAST:event_btnHomeKeasramaanMouseClicked

    private void btnViewKeasramaanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnViewKeasramaanMouseClicked
        pnlMain.removeAll();
        pnlMain.repaint();
        pnlMain.revalidate();
        
        // add panel
        
        pnlMain.add(pnlViewIK);
        pnlMain.repaint();
        pnlMain.revalidate();
        

        tblDaftarReq.removeAll();
        
        DefaultTableModel dtm = new DefaultTableModel();
        tblDaftarReq.setModel(dtm);
        
        dtm.addColumn("kode");
        dtm.addColumn("username");
        dtm.addColumn("rencana berangkat");
        dtm.addColumn("rencana kembali");
        dtm.addColumn("tujuan");
        dtm.addColumn("alasan");
        dtm.addColumn("status dosen");
        dtm.addColumn("Status keasramaan");
   
        ArrayList<Daftar> daftar = dc.getAllbyAsrama();
        
        if(daftar.size() > 0){
            int no = 0;
            for(Daftar d: daftar){
                no++;
                dtm.addRow(new Object[]{
                d.getId(),
                d.getUsername(),
                d.getWaktuPergi(),
                d.getWaktuKembali(),
                d.getTujuan(),
                d.getAlasan(),
                d.getIzinDosen(),
                d.getIzinKeasramaan()
                });
            }
        }
    }//GEN-LAST:event_btnViewKeasramaanMouseClicked

    private void btnLogOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogOutActionPerformed
        this.setVisible(false);
        new TampilanAwal().setVisible(true);
    }//GEN-LAST:event_btnLogOutActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        lblName.setText( ConstUtil.auth.getNama());
        lblRoleKeasramaan.setText( ConstUtil.auth.getRole());
        lblNamaKeasramaan.setText( ConstUtil.auth.getNama());
        lblAsramaKeasramaan.setText( ConstUtil.auth.getAsrama());
        lblUsernameKeasramaan.setText( ConstUtil.auth.getUsername());
        lblPasswordKeasramaan.setText( ConstUtil.auth.getPassword());
    }//GEN-LAST:event_formWindowOpened

    DaftarController dc = new DaftarController();
    
    private void btnApprovedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnApprovedActionPerformed
        // TODO add your handling code here:
        if (dc.updateApproveK(txtKode.getText())) {
            JOptionPane.showMessageDialog(this,"Request berhasil diapprove");
            
        pnlMain.removeAll();
        pnlMain.repaint();
        pnlMain.revalidate();
        
        // add panel
        
        pnlMain.add(pnlViewIK);
        pnlMain.repaint();
        pnlMain.revalidate();
        
        tblDaftarReq.removeAll();
        
        DefaultTableModel dtm = new DefaultTableModel();
        tblDaftarReq.setModel(dtm);
        
        dtm.addColumn("kode");
        dtm.addColumn("username");
        dtm.addColumn("rencana berangkat");
        dtm.addColumn("rencana kembali");
        dtm.addColumn("tujuan");
        dtm.addColumn("alasan");
        dtm.addColumn("status dosen");
        dtm.addColumn("Status keasramaan");
        
        DaftarController dc = new DaftarController();
        
        ArrayList<Daftar> daftar = dc.getAllbyAsrama();
        
        if(daftar.size() > 0){
            int no = 0;
            for(Daftar d: daftar){
                no++;
                dtm.addRow(new Object[]{
                
                d.getId(),
                d.getUsername(),
                d.getWaktuPergi(),
                d.getWaktuKembali(),
                d.getTujuan(),
                d.getAlasan(),
                d.getIzinDosen(),
                d.getIzinKeasramaan()
                });
            }
        }
        }
    }//GEN-LAST:event_btnApprovedActionPerformed

    private void btnDisapprovedMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDisapprovedMouseClicked
        // TODO add your handling code here:
        if (dc.updateDisapproveK(txtKode.getText())) {
            JOptionPane.showMessageDialog(this,"Request berhasil tidak diapprove");
            
        pnlMain.removeAll();
        pnlMain.repaint();
        pnlMain.revalidate();
        
        // add panel
        
        pnlMain.add(pnlViewIK);
        pnlMain.repaint();
        pnlMain.revalidate();
        
        tblDaftarReq.removeAll();
        
        DefaultTableModel dtm = new DefaultTableModel();
        tblDaftarReq.setModel(dtm);
        
        dtm.addColumn("kode");
        dtm.addColumn("username");
        dtm.addColumn("rencana berangkat");
        dtm.addColumn("rencana kembali");
        dtm.addColumn("tujuan");
        dtm.addColumn("alasan");
        dtm.addColumn("status dosen");
        dtm.addColumn("Status keasramaan");
        
        DaftarController dc = new DaftarController();
        
        ArrayList<Daftar> daftar = dc.getAllbyAsrama();
        
        if(daftar.size() > 0){
            int no = 0;
            for(Daftar d: daftar){
                no++;
                dtm.addRow(new Object[]{
                
                d.getId(),
                d.getUsername(),
                d.getWaktuPergi(),
                d.getWaktuKembali(),
                d.getTujuan(),
                d.getAlasan(),
                d.getIzinDosen(),
                d.getIzinKeasramaan()
                });
            }
        }
        }

    }//GEN-LAST:event_btnDisapprovedMouseClicked

    private void tblDaftarReqMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblDaftarReqMouseClicked
        // TODO add your handling code here:
        int baris = tblDaftarReq.rowAtPoint(evt.getPoint());
        String kode = tblDaftarReq.getValueAt(baris, 0).toString();
        txtKode.setText(kode);
    }//GEN-LAST:event_tblDaftarReqMouseClicked

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
            java.util.logging.Logger.getLogger(mainViewKeasramaan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(mainViewKeasramaan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(mainViewKeasramaan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(mainViewKeasramaan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new mainViewKeasramaan().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnApproved;
    private javax.swing.JButton btnDisapproved;
    private javax.swing.JButton btnHomeKeasramaan;
    private javax.swing.JButton btnLogOut;
    private javax.swing.JButton btnViewKeasramaan;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblAsramaKeasramaan;
    private javax.swing.JLabel lblNamaKeasramaan;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblPasswordKeasramaan;
    private javax.swing.JLabel lblRoleKeasramaan;
    private javax.swing.JLabel lblUsernameKeasramaan;
    private javax.swing.JPanel pnlHome;
    private javax.swing.JPanel pnlMain;
    private javax.swing.JPanel pnlMenu;
    private javax.swing.JPanel pnlViewIK;
    private javax.swing.JTable tblDaftarReq;
    private javax.swing.JTextField txtKode;
    // End of variables declaration//GEN-END:variables
}
