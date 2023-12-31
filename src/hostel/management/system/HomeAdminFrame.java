/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package hostel.management.system;

import javax.swing.JOptionPane;

/**
 *
 * @author test
 */
public class HomeAdminFrame extends javax.swing.JFrame {

    /**
     * Creates new form HomeAdminFrame
     */
    public HomeAdminFrame() {
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

        jLabel1 = new javax.swing.JLabel();
        btnRooms = new javax.swing.JButton();
        btnRoomAlloc = new javax.swing.JButton();
        btnStudents = new javax.swing.JButton();
        btnVisitors = new javax.swing.JButton();
        btnHostel = new javax.swing.JButton();
        btnFurniture = new javax.swing.JButton();
        btnLogout = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Hostel Management System");

        btnRooms.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        btnRooms.setText("Add Rooms");
        btnRooms.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRoomsActionPerformed(evt);
            }
        });

        btnRoomAlloc.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        btnRoomAlloc.setText("Room Allocation");
        btnRoomAlloc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRoomAllocActionPerformed(evt);
            }
        });

        btnStudents.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        btnStudents.setText("Add Students");
        btnStudents.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStudentsActionPerformed(evt);
            }
        });

        btnVisitors.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        btnVisitors.setText("Add Visitors");
        btnVisitors.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVisitorsActionPerformed(evt);
            }
        });

        btnHostel.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        btnHostel.setText("Add Hostel");
        btnHostel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHostelActionPerformed(evt);
            }
        });

        btnFurniture.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        btnFurniture.setText("Add Furniture");
        btnFurniture.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFurnitureActionPerformed(evt);
            }
        });

        btnLogout.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        btnLogout.setText("LOGOUT");
        btnLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogoutActionPerformed(evt);
            }
        });

        btnExit.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        btnExit.setText("EXIT");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        jButton1.setText("View hostels having more than 50 rooms");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("View Adminitrators in descending order of mobile number");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("View Students with visitors");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Student Visitor Details");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setText("Student and room details");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setText("find Hostel with certain number of rooms");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.setText("Student Visitor Count");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton8.setText("Check Room availability ");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jButton9.setText("Update Number of rooms in hostel");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(btnVisitors)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(126, 126, 126)
                                .addComponent(btnFurniture))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton6))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(57, 57, 57)
                                .addComponent(jLabel1))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(91, 91, 91)
                        .addComponent(jButton3))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(390, 390, 390)
                        .addComponent(btnRoomAlloc)))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton2)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(277, 277, 277)
                        .addComponent(jButton8)
                        .addGap(197, 197, 197)
                        .addComponent(btnHostel))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(jButton4))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(581, 581, 581)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnRooms)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnLogout)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(155, 155, 155)
                                        .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(95, 95, 95)
                                        .addComponent(btnStudents))))))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(336, 336, 336)
                            .addComponent(jButton9)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton5))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(268, 268, 268)
                            .addComponent(jButton1)
                            .addGap(313, 313, 313)
                            .addComponent(jButton7))))
                .addContainerGap(395, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(btnLogout)
                        .addGap(102, 102, 102))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnStudents)
                        .addGap(45, 45, 45)
                        .addComponent(btnExit)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnRoomAlloc)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnFurniture)
                        .addGap(10, 10, 10)
                        .addComponent(jButton3))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton1)
                            .addComponent(jButton7))
                        .addGap(18, 18, 18)
                        .addComponent(jButton2)
                        .addGap(1, 1, 1)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton8)
                            .addComponent(btnHostel))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton9)
                    .addComponent(jButton5))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(btnVisitors)
                        .addGap(75, 75, 75)
                        .addComponent(jButton4))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnRooms)
                            .addComponent(jButton6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel1)))
                .addContainerGap(306, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutActionPerformed
        // TODO add your handling code here:
        int a = JOptionPane.showConfirmDialog(null, "Do You Really Want To Logout", "Select", JOptionPane.YES_NO_OPTION);
        if (a == 0) {
            setVisible(false);
            new Login().setVisible(true);
        }


    }//GEN-LAST:event_btnLogoutActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        // TODO add your handling code here:
        int a = JOptionPane.showConfirmDialog(null, "Do You Really Want To Exit Application", "Select", JOptionPane.YES_NO_OPTION);
        if (a == 0) {
            System.exit(0);

        }
    }//GEN-LAST:event_btnExitActionPerformed

    private void btnRoomAllocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRoomAllocActionPerformed
        // TODO add your handling code here:
        // TODO add your handling code here:
        // Create an instance of the ViewRoomAllocation page
        ViewRoomAllocation viewRoomAllocation = new ViewRoomAllocation();

        // Make the ViewRoomAllocation page visible
        viewRoomAllocation.setVisible(true);

        // Close the current page if needed
        this.dispose();  // Close the current page
    }//GEN-LAST:event_btnRoomAllocActionPerformed

    private void btnStudentsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStudentsActionPerformed
        // TODO add your handling code here:
        // TODO add your handling code here:
        // Create an instance of the ViewRoomAllocation page
        StudentADD StudentADD = new StudentADD();

        // Make the ViewRoomAllocation page visible
        StudentADD.setVisible(true);

        // Close the current page if needed
        this.dispose();  // Close the current page
    }//GEN-LAST:event_btnStudentsActionPerformed

    private void btnRoomsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRoomsActionPerformed
        // TODO add your handling code here:
        // TODO add your handling code here:
        // Create an instance of the ViewRoomAllocation page
        RoomADD RoomADD = new RoomADD();

        // Make the ViewRoomAllocation page visible
        RoomADD.setVisible(true);

        // Close the current page if needed
        this.dispose();  // Close the current page
    }//GEN-LAST:event_btnRoomsActionPerformed

    private void btnFurnitureActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFurnitureActionPerformed
        // TODO add your handling code here:
        // TODO add your handling code here:
        // Create an instance of the ViewRoomAllocation page
        FurnitureADD FurnitureADD = new FurnitureADD();

        // Make the ViewRoomAllocation page visible
        FurnitureADD.setVisible(true);

        // Close the current page if needed
        this.dispose();  // Close the current page

    }//GEN-LAST:event_btnFurnitureActionPerformed

    private void btnHostelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHostelActionPerformed
        // TODO add your handling code here:
        // TODO add your handling code here:
        // Create an instance of the ViewRoomAllocation page
        HostelADD HostelADD = new HostelADD();

        // Make the ViewRoomAllocation page visible
        HostelADD.setVisible(true);

        // Close the current page if needed
        this.dispose();  // Close the current page
    }//GEN-LAST:event_btnHostelActionPerformed

    private void btnVisitorsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVisitorsActionPerformed
        // TODO add your handling code here:
        // TODO add your handling code here:
        // Create an instance of the ViewRoomAllocation page
        VisitorADD VisitorADD = new VisitorADD();

        // Make the ViewRoomAllocation page visible
        VisitorADD.setVisible(true);

        // Close the current page if needed
        this.dispose();  // Close the current page
    }//GEN-LAST:event_btnVisitorsActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        // TODO add your handling code here:
        // Create an instance of the ViewRoomAllocation page
        HostelMoreThan50Rooms HostelMoreThan50Rooms = new HostelMoreThan50Rooms();

        // Make the ViewRoomAllocation page visible
        HostelMoreThan50Rooms.setVisible(true);

        // Close the current page if needed
        this.dispose();  // Close the current page
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        // TODO add your handling code here:
        // Create an instance of the ViewRoomAllocation page
        listadminnamesandsalindesc listadminnamesandsalindesc = new listadminnamesandsalindesc();

        // Make the ViewRoomAllocation page visible
        listadminnamesandsalindesc.setVisible(true);

        // Close the current page if needed
        this.dispose();  // Close the current page
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        // TODO add your handling code here:
        // Create an instance of the ViewRoomAllocation page
        studentwithvisitors studentwithvisitors = new studentwithvisitors();

        // Make the ViewRoomAllocation page visible
        studentwithvisitors.setVisible(true);

        // Close the current page if needed
        this.dispose();  // Close the current page
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        // TODO add your handling code here:
        // Create an instance of the ViewRoomAllocation page
        studentnamedatevisitor studentnamedatevisitor = new studentnamedatevisitor();

        // Make the ViewRoomAllocation page visible
        studentnamedatevisitor.setVisible(true);

        // Close the current page if needed
        this.dispose();  // Close the current page
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        // TODO add your handling code here:
        // Create an instance of the ViewRoomAllocation page
        studentroomhostel studentroomhostel = new studentroomhostel();

        // Make the ViewRoomAllocation page visible
        studentroomhostel.setVisible(true);

        // Close the current page if needed
        this.dispose();  // Close the current page
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        // TODO add your handling code here:
        // Create an instance of the ViewRoomAllocation page
        funchostelfewerrooms funchostelfewerrooms = new funchostelfewerrooms();

        // Make the ViewRoomAllocation page visible
        funchostelfewerrooms.setVisible(true);

        // Close the current page if needed
        this.dispose();  // Close the current page
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
        // TODO add your handling code here:
        // Create an instance of the ViewRoomAllocation page
        funccountstudentvisitor funccountstudentvisitor = new funccountstudentvisitor();

        // Make the ViewRoomAllocation page visible
        funccountstudentvisitor.setVisible(true);

        // Close the current page if needed
        this.dispose();  // Close the current page
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
        // TODO add your handling code here:
        // Create an instance of the ViewRoomAllocation page
        procedureavailableroom procedureavailableroom = new procedureavailableroom();

        // Make the ViewRoomAllocation page visible
        procedureavailableroom.setVisible(true);

        // Close the current page if needed
        this.dispose();  // Close the current page
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        // TODO add your handling code here:
        // TODO add your handling code here:
        // Create an instance of the ViewRoomAllocation page
        procedureupdaterooms procedureupdaterooms = new procedureupdaterooms();

        // Make the ViewRoomAllocation page visible
        procedureupdaterooms.setVisible(true);

        // Close the current page if needed
        this.dispose();  // Close the current page
    }//GEN-LAST:event_jButton9ActionPerformed

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
            java.util.logging.Logger.getLogger(HomeAdminFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HomeAdminFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HomeAdminFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HomeAdminFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HomeAdminFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnFurniture;
    private javax.swing.JButton btnHostel;
    private javax.swing.JButton btnLogout;
    private javax.swing.JButton btnRoomAlloc;
    private javax.swing.JButton btnRooms;
    private javax.swing.JButton btnStudents;
    private javax.swing.JButton btnVisitors;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
