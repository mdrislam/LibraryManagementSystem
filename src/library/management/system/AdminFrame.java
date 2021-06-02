/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package library.management.system;

/**
 *
 * @author RISAD'S_PC
 */
public class AdminFrame extends javax.swing.JFrame {

    /**
     * Creates new form AdminFrame
     */
    public AdminFrame() {
        initComponents();
        showHome();
    }
     public void showHome(){
        jdesktop.removeAll();
        iFrameAdminHome iHome=new iFrameAdminHome();
        jdesktop.add(iHome).setVisible(true);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        lblExitt = new javax.swing.JLabel();
        lblTop = new javax.swing.JLabel();
        jdesktop = new javax.swing.JDesktopPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(1050, 620));
        getContentPane().setLayout(null);

        jPanel3.setBackground(new java.awt.Color(0, 102, 102));
        jPanel3.setPreferredSize(new java.awt.Dimension(210, 200));
        jPanel3.setLayout(null);

        jButton1.setBackground(new java.awt.Color(204, 204, 204));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 0, 51));
        jButton1.setText("Log out");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton1);
        jButton1.setBounds(40, 500, 200, 50);

        jButton2.setBackground(new java.awt.Color(204, 204, 204));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(0, 0, 51));
        jButton2.setText("Oparator info");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton2);
        jButton2.setBounds(40, 180, 200, 50);

        jButton3.setBackground(new java.awt.Color(204, 204, 204));
        jButton3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton3.setForeground(new java.awt.Color(0, 0, 51));
        jButton3.setText("Admin info");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton3);
        jButton3.setBounds(40, 70, 200, 50);

        jButton4.setBackground(new java.awt.Color(204, 204, 204));
        jButton4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton4.setForeground(new java.awt.Color(0, 0, 51));
        jButton4.setText("Go to LMS");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton4);
        jButton4.setBounds(40, 300, 200, 50);

        jButton5.setBackground(new java.awt.Color(204, 204, 204));
        jButton5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton5.setForeground(new java.awt.Color(0, 0, 51));
        jButton5.setText("Report");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton5);
        jButton5.setBounds(40, 400, 200, 50);

        getContentPane().add(jPanel3);
        jPanel3.setBounds(0, 50, 280, 630);

        jPanel2.setBackground(new java.awt.Color(255, 204, 255));
        jPanel2.setLayout(null);

        lblExitt.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        lblExitt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblExitt.setText("X");
        lblExitt.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(255, 0, 0), new java.awt.Color(204, 255, 255), new java.awt.Color(153, 153, 255), new java.awt.Color(204, 204, 204)));
        lblExitt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblExittMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblExittMousePressed(evt);
            }
        });
        jPanel2.add(lblExitt);
        lblExitt.setBounds(1010, 0, 40, 31);

        lblTop.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                lblTopMouseDragged(evt);
            }
        });
        lblTop.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblTopMousePressed(evt);
            }
        });
        jPanel2.add(lblTop);
        lblTop.setBounds(0, 4, 1059, 60);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(0, 0, 1068, 50);

        javax.swing.GroupLayout jdesktopLayout = new javax.swing.GroupLayout(jdesktop);
        jdesktop.setLayout(jdesktopLayout);
        jdesktopLayout.setHorizontalGroup(
            jdesktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 780, Short.MAX_VALUE)
        );
        jdesktopLayout.setVerticalGroup(
            jdesktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 610, Short.MAX_VALUE)
        );

        getContentPane().add(jdesktop);
        jdesktop.setBounds(280, 50, 780, 610);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       new LogFrame().setVisible(true);
       this.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
       jButton4.setEnabled(false);
        new RootFrame().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

    private void lblTopMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblTopMouseDragged
        int xx=evt.getXOnScreen();
        int yy=evt.getYOnScreen();
        this.setLocation(xx-x, yy-y);

    }//GEN-LAST:event_lblTopMouseDragged

    int x;
    int y;
    private void lblTopMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblTopMousePressed
        x=evt.getX();
        y=evt.getY();
    }//GEN-LAST:event_lblTopMousePressed

    private void lblExittMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblExittMouseClicked
        System.exit(0);
    }//GEN-LAST:event_lblExittMouseClicked

    private void lblExittMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblExittMousePressed
        System.exit(0);
    }//GEN-LAST:event_lblExittMousePressed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
       jdesktop.removeAll();
        iFrameAdminInfo iHome=new iFrameAdminInfo();
        jdesktop.add(iHome).setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        jdesktop.removeAll();
        iFrameOparatorInfo iHome=new iFrameOparatorInfo();
        jdesktop.add(iHome).setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(AdminFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JDesktopPane jdesktop;
    private javax.swing.JLabel lblExitt;
    private javax.swing.JLabel lblTop;
    // End of variables declaration//GEN-END:variables
}
