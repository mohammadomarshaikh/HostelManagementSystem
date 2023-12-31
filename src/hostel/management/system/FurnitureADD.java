/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package hostel.management.system;

import dao.FurnitureDao;
import javax.swing.JOptionPane;
import model.Furniture;

/**
 *
 * @author test
 */
public class FurnitureADD extends javax.swing.JFrame {

    /**
     * Creates new form FurnitureADD
     */
    public FurnitureADD() {
        initComponents();
        btnSave.setEnabled(false);
    }

    public void validateFields() {
        String furnitureIDTxt = txtfurnitureid.getText();
        String furnitureTypeTxt = txtfurnituretype.getText();
        String hostelIDTxt = txthostelid.getText();
        String roomIDTxt = txtroomid.getText();

        if (!furnitureIDTxt.isEmpty() && !furnitureTypeTxt.isEmpty() && !hostelIDTxt.isEmpty() && !roomIDTxt.isEmpty()) {
            btnSave.setEnabled(true);
        } else {
            btnSave.setEnabled(false);
        }
    }

    public void clear() {
        txtfurnitureid.setText("");
        txtfurnituretype.setText("");
        txthostelid.setText("");
        txtroomid.setText("");
        btnSave.setEnabled(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtfurnitureid = new javax.swing.JTextField();
        txtfurnituretype = new javax.swing.JTextField();
        txthostelid = new javax.swing.JTextField();
        txtroomid = new javax.swing.JTextField();
        btnSave = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Furniture");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(405, 63, -1, -1));

        jLabel2.setText("Furniture ID");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(267, 151, -1, -1));

        jLabel3.setText("Furniture type");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(267, 201, -1, -1));

        jLabel4.setText("Hostel ID");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(267, 252, -1, -1));

        jLabel5.setText("Room ID");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(267, 305, -1, -1));

        txtfurnitureid.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtfurnitureidKeyReleased(evt);
            }
        });
        getContentPane().add(txtfurnitureid, new org.netbeans.lib.awtextra.AbsoluteConstraints(497, 148, 71, -1));

        txtfurnituretype.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtfurnituretypeKeyReleased(evt);
            }
        });
        getContentPane().add(txtfurnituretype, new org.netbeans.lib.awtextra.AbsoluteConstraints(497, 198, 71, -1));

        txthostelid.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txthostelidKeyReleased(evt);
            }
        });
        getContentPane().add(txthostelid, new org.netbeans.lib.awtextra.AbsoluteConstraints(497, 249, 71, -1));

        txtroomid.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtroomidKeyReleased(evt);
            }
        });
        getContentPane().add(txtroomid, new org.netbeans.lib.awtextra.AbsoluteConstraints(497, 302, 71, -1));

        btnSave.setText("SAVE");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });
        getContentPane().add(btnSave, new org.netbeans.lib.awtextra.AbsoluteConstraints(368, 342, -1, -1));

        jButton1.setText("Clear");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(629, 224, -1, -1));

        jButton2.setText("BACK");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(705, 34, -1, -1));

        jButton3.setText("EXIT");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(831, 34, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        // TODO add your handling code here:
    // TODO add your handling code here:
    // Fields are valid, proceed with saving
    String furnitureID = txtfurnitureid.getText();
    String furnitureType = txtfurnituretype.getText();
    String hostelID = txthostelid.getText();
    String roomID = txtroomid.getText();

    // Create a Furniture object
    Furniture furniture = new Furniture();
    furniture.setFurniture_ID(furnitureID);
    furniture.setFurniture_type(furnitureType);
    furniture.setHostel_ID(hostelID);
    furniture.setRoom_ID(roomID);

    // Save the Furniture object to the database
    FurnitureDao.save(furniture);

    // Clear the text fields if needed
    txtfurnitureid.setText("");
    txtfurnituretype.setText("");
    txthostelid.setText("");
    txtroomid.setText("");
    }//GEN-LAST:event_btnSaveActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        clear();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtfurnitureidKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtfurnitureidKeyReleased
        // TODO add your handling code here:
        validateFields();
    }//GEN-LAST:event_txtfurnitureidKeyReleased

    private void txtfurnituretypeKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtfurnituretypeKeyReleased
        // TODO add your handling code here:
        validateFields();
    }//GEN-LAST:event_txtfurnituretypeKeyReleased

    private void txthostelidKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txthostelidKeyReleased
        // TODO add your handling code here:
        validateFields();
    }//GEN-LAST:event_txthostelidKeyReleased

    private void txtroomidKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtroomidKeyReleased
        // TODO add your handling code here:
        validateFields();
    }//GEN-LAST:event_txtroomidKeyReleased

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    // Create an instance of HomeAdminFrame
    HomeAdminFrame adminHome = new HomeAdminFrame();
    
    // Display the HomeAdminFrame
    adminHome.setVisible(true);
    
    // Close the current frame if needed
    this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        int a = JOptionPane.showConfirmDialog(null,"Do You Really Want To Close Application","Select",JOptionPane.YES_NO_OPTION);
        if (a==0){
            System.exit(0);
        }
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(FurnitureADD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FurnitureADD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FurnitureADD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FurnitureADD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FurnitureADD().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSave;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField txtfurnitureid;
    private javax.swing.JTextField txtfurnituretype;
    private javax.swing.JTextField txthostelid;
    private javax.swing.JTextField txtroomid;
    // End of variables declaration//GEN-END:variables
}
