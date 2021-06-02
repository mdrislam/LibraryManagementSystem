/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package library.management.system;

import java.net.InetAddress;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import library.management.system.HelperClass.DBConnUtill;
import org.apache.derby.drda.NetworkServerControl;

/**
 *
 * @author RISAD'S_PC
 */
public class LogFrame extends javax.swing.JFrame {

    /**
     * Creates new form LogFrame
     */
    public LogFrame() {
        initComponents();
        // save_Admin();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tfPassword = new javax.swing.JPasswordField();
        lblExitt = new javax.swing.JLabel();
        lblTop = new javax.swing.JLabel();
        tfUserName = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        comUserType = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        btnLoging = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        lblBackground = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(1050, 620));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tfPassword.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        tfPassword.setForeground(new java.awt.Color(0, 0, 51));
        tfPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfPasswordActionPerformed(evt);
            }
        });
        getContentPane().add(tfPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 260, 220, -1));

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
        getContentPane().add(lblExitt, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 0, 40, 40));

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
        getContentPane().add(lblTop, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1050, 40));

        tfUserName.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        tfUserName.setForeground(new java.awt.Color(0, 0, 51));
        tfUserName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfUserNameActionPerformed(evt);
            }
        });
        getContentPane().add(tfUserName, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 200, 220, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 102, 102));
        jLabel1.setText(" Loging Panel !");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 94, 690, 40));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 51, 51));
        jLabel4.setText("Password :");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 250, 130, 40));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 51, 51));
        jLabel2.setText("User Name :");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 190, 130, 40));

        comUserType.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        comUserType.setForeground(new java.awt.Color(0, 0, 51));
        comUserType.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Admin", "Oparator" }));
        comUserType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comUserTypeActionPerformed(evt);
            }
        });
        getContentPane().add(comUserType, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 320, 220, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 51, 51));
        jLabel3.setText("User Type :");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 310, 130, 40));

        btnLoging.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        btnLoging.setForeground(new java.awt.Color(0, 102, 0));
        btnLoging.setText("Login");
        btnLoging.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogingActionPerformed(evt);
            }
        });
        getContentPane().add(btnLoging, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 420, 170, 40));

        jLabel5.setFont(new java.awt.Font("Tahoma", 3, 20)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 0, 51));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("All Rights reserved Mri@Soft Ltd: ");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 574, 770, 40));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 140, 720, 20));

        lblBackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/library/management/system/Untitled-1.jpg"))); // NOI18N
        getContentPane().add(lblBackground, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1050, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void lblExittMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblExittMouseClicked
        System.exit(0);
    }//GEN-LAST:event_lblExittMouseClicked

    private void lblExittMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblExittMousePressed
        System.exit(0);
    }//GEN-LAST:event_lblExittMousePressed
    int x;
    int y;
    private void lblTopMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblTopMousePressed
        x = evt.getX();
        y = evt.getY();
    }//GEN-LAST:event_lblTopMousePressed

    private void lblTopMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblTopMouseDragged
        int xx = evt.getXOnScreen();
        int yy = evt.getYOnScreen();
        this.setLocation(xx - x, yy - y);

    }//GEN-LAST:event_lblTopMouseDragged

    private void btnLogingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogingActionPerformed
        
        
        int type = comUserType.getSelectedIndex();
        
        btnLoging.setEnabled(false);
        LogingWithType(type);
        
        


    }//GEN-LAST:event_btnLogingActionPerformed

    private void comUserTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comUserTypeActionPerformed


    }//GEN-LAST:event_comUserTypeActionPerformed

    private void tfUserNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfUserNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfUserNameActionPerformed

    private void tfPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfPasswordActionPerformed

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
            java.util.logging.Logger.getLogger(LogFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LogFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LogFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LogFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
                 try {
                    NetworkServerControl server = new NetworkServerControl(InetAddress.getByName("localhost"), 1527);
                    server.start(null);
                    System.out.println("db setver on");
                } catch (Exception e) {
                    System.out.println("err: " + e);
                }
                
                
                new LogFrame().setVisible(true);

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLoging;
    private javax.swing.JComboBox comUserType;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblBackground;
    private javax.swing.JLabel lblExitt;
    private javax.swing.JLabel lblTop;
    private javax.swing.JPasswordField tfPassword;
    private javax.swing.JTextField tfUserName;
    // End of variables declaration//GEN-END:variables

    private void LogingWithType(int type) {
        String uname = tfUserName.getText().toString().toLowerCase().trim();
        String password = new String(tfPassword.getPassword());

        if (!uname.isEmpty() && !password.isEmpty()) {
            try {
                Statement st = DBConnUtill.getConn().createStatement();

                if (type == 0) {
                    ResultSet rs = st.executeQuery("select USER_NAME,PASSWORD from LMS_ADMIN where USER_NAME='" + uname + "' ");

                    if (rs.next()) {

                        if (uname.equals(rs.getString("USER_NAME")) && password.equals(rs.getString("PASSWORD"))) {
                            new AdminFrame().setVisible(true);
                            this.setVisible(false);
                        } else {
                            JOptionPane.showMessageDialog(this, "User Name or password does not match !");
                               btnLoging.setEnabled(true);
                        }

                    } else {
                        JOptionPane.showMessageDialog(this, "User Name or password does not match !");
                        btnLoging.setEnabled(true);
                    }

                } else {
                    ResultSet rs = st.executeQuery("select USER_NAME,PASSWORD from LMS_EMPLOYEE where USER_NAME='" + uname + "' ");

                    if (rs.next()) {

                        if (uname.equals(rs.getString("USER_NAME")) && password.equals(rs.getString("PASSWORD"))) {
                            new RootFrame().setVisible(true);
                            this.setVisible(false);

                        } else {
                            JOptionPane.showMessageDialog(this, "User Name or password does not match !");
                             btnLoging.setEnabled(true);
                        }

                    } else {
                        JOptionPane.showMessageDialog(this, "User Name or password does not match !");
                        btnLoging.setEnabled(true);
                    }
                }

            } catch (Exception e) {
                e.printStackTrace();
                System.out.println("error: " + e);
                btnLoging.setEnabled(true);
            }

        } else {
            System.out.println("kkk");
        }

    }

}
