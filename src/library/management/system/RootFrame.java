
package library.management.system;

import java.awt.Color;
import java.net.InetAddress;
import javax.swing.JLabel;
import org.apache.derby.drda.NetworkServerControl;

public class RootFrame extends javax.swing.JFrame {

   
    public RootFrame() {
        initComponents();
        showHome();
    }

    public void showHome(){
        jDesktop.removeAll();
        iFrameHome iHome=new iFrameHome();
        jDesktop.add(iHome).setVisible(true);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblExit = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        btnHome = new javax.swing.JButton();
        btnMemberEntry = new javax.swing.JButton();
        btnBookEntry = new javax.swing.JButton();
        btnIssu = new javax.swing.JButton();
        btnReceived = new javax.swing.JButton();
        btnBookBarcode = new javax.swing.JButton();
        btnBookCopy = new javax.swing.JButton();
        btnReport = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();
        jDesktop = new javax.swing.JDesktopPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 0, 51));
        jPanel1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel1MouseDragged(evt);
            }
        });
        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel1MousePressed(evt);
            }
        });

        lblExit.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lblExit.setForeground(new java.awt.Color(204, 204, 204));
        lblExit.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblExit.setText("X");
        lblExit.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        lblExit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblExitMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblExitMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblExitMouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 1013, Short.MAX_VALUE)
                .addComponent(lblExit, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(lblExit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1050, 40));

        jPanel2.setBackground(new java.awt.Color(0, 102, 102));
        jPanel2.setPreferredSize(new java.awt.Dimension(280, 580));

        jPanel3.setBackground(new java.awt.Color(0, 102, 102));
        jPanel3.setPreferredSize(new java.awt.Dimension(277, 50));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 277, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        jPanel2.add(jPanel3);

        btnHome.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnHome.setForeground(new java.awt.Color(0, 0, 102));
        btnHome.setText("Home");
        btnHome.setPreferredSize(new java.awt.Dimension(200, 45));
        btnHome.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnHomeMouseClicked(evt);
            }
        });
        btnHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHomeActionPerformed(evt);
            }
        });
        jPanel2.add(btnHome);

        btnMemberEntry.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnMemberEntry.setForeground(new java.awt.Color(0, 0, 102));
        btnMemberEntry.setText("Member Entry");
        btnMemberEntry.setPreferredSize(new java.awt.Dimension(200, 45));
        btnMemberEntry.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMemberEntryActionPerformed(evt);
            }
        });
        jPanel2.add(btnMemberEntry);

        btnBookEntry.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnBookEntry.setForeground(new java.awt.Color(0, 0, 102));
        btnBookEntry.setText("Book Entry");
        btnBookEntry.setPreferredSize(new java.awt.Dimension(200, 45));
        btnBookEntry.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBookEntryActionPerformed(evt);
            }
        });
        jPanel2.add(btnBookEntry);

        btnIssu.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        btnIssu.setForeground(new java.awt.Color(0, 0, 102));
        btnIssu.setText("Issu");
        btnIssu.setPreferredSize(new java.awt.Dimension(200, 45));
        btnIssu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIssuActionPerformed(evt);
            }
        });
        jPanel2.add(btnIssu);

        btnReceived.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnReceived.setForeground(new java.awt.Color(0, 0, 102));
        btnReceived.setText("Received");
        btnReceived.setPreferredSize(new java.awt.Dimension(200, 45));
        btnReceived.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReceivedActionPerformed(evt);
            }
        });
        jPanel2.add(btnReceived);

        btnBookBarcode.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnBookBarcode.setForeground(new java.awt.Color(0, 0, 102));
        btnBookBarcode.setText("Book Barcode");
        btnBookBarcode.setPreferredSize(new java.awt.Dimension(200, 45));
        btnBookBarcode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBookBarcodeActionPerformed(evt);
            }
        });
        jPanel2.add(btnBookBarcode);

        btnBookCopy.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnBookCopy.setForeground(new java.awt.Color(0, 0, 102));
        btnBookCopy.setText("Book Copy");
        btnBookCopy.setPreferredSize(new java.awt.Dimension(200, 45));
        btnBookCopy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBookCopyActionPerformed(evt);
            }
        });
        jPanel2.add(btnBookCopy);

        btnReport.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnReport.setForeground(new java.awt.Color(0, 0, 102));
        btnReport.setText("Report");
        btnReport.setPreferredSize(new java.awt.Dimension(200, 45));
        btnReport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReportActionPerformed(evt);
            }
        });
        jPanel2.add(btnReport);

        btnExit.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnExit.setForeground(java.awt.Color.red);
        btnExit.setText("Exit");
        btnExit.setPreferredSize(new java.awt.Dimension(200, 45));
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });
        jPanel2.add(btnExit);

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, -1, -1));

        jDesktop.setBackground(new java.awt.Color(0, 204, 204));

        javax.swing.GroupLayout jDesktopLayout = new javax.swing.GroupLayout(jDesktop);
        jDesktop.setLayout(jDesktopLayout);
        jDesktopLayout.setHorizontalGroup(
            jDesktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 770, Short.MAX_VALUE)
        );
        jDesktopLayout.setVerticalGroup(
            jDesktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 580, Short.MAX_VALUE)
        );

        getContentPane().add(jDesktop, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 40, 770, 580));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHomeActionPerformed
       showHome();
    }//GEN-LAST:event_btnHomeActionPerformed

    private void btnMemberEntryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMemberEntryActionPerformed
       jDesktop.removeAll();
        iFrameMemberEntry iMember=new iFrameMemberEntry();
        jDesktop.add(iMember).setVisible(true);

    }//GEN-LAST:event_btnMemberEntryActionPerformed

    private void btnBookEntryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBookEntryActionPerformed
        jDesktop.removeAll();
        iFrameBookEntry iBook=new iFrameBookEntry();
        jDesktop.add(iBook).setVisible(true);
    }//GEN-LAST:event_btnBookEntryActionPerformed

    private void btnBookBarcodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBookBarcodeActionPerformed
       jDesktop.removeAll();
        iFrameBookBarcode iBook=new iFrameBookBarcode();
        jDesktop.add(iBook).setVisible(true);
    }//GEN-LAST:event_btnBookBarcodeActionPerformed

    private void btnBookCopyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBookCopyActionPerformed
      jDesktop.removeAll();
        iFrameBookCopy iBookCopy=new iFrameBookCopy();
        jDesktop.add(iBookCopy).setVisible(true);
    }//GEN-LAST:event_btnBookCopyActionPerformed

    private void btnIssuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIssuActionPerformed
   jDesktop.removeAll();
        iFrameBookIssu issu=new iFrameBookIssu();
        jDesktop.add(issu).setVisible(true);
    }//GEN-LAST:event_btnIssuActionPerformed

    private void btnReceivedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReceivedActionPerformed
     jDesktop.removeAll();
        iFrameReceived iReceived=new iFrameReceived();
        jDesktop.add(iReceived).setVisible(true);
    }//GEN-LAST:event_btnReceivedActionPerformed

    private void btnReportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReportActionPerformed
      jDesktop.removeAll();
        iFrameViewReport iReport=new iFrameViewReport();
        jDesktop.add(iReport).setVisible(true);
    }//GEN-LAST:event_btnReportActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        System.exit(0);
        
    }//GEN-LAST:event_btnExitActionPerformed

    int x,y;
    
    private void jPanel1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MousePressed
      
        x=evt.getX();
        y=evt.getY();
        
        
    }//GEN-LAST:event_jPanel1MousePressed

    private void jPanel1MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseDragged
       
        int xx=evt.getXOnScreen();
        int yy=evt.getYOnScreen();
        this.setLocation(xx-x, yy-y);
        
    }//GEN-LAST:event_jPanel1MouseDragged

    private void lblExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblExitMouseClicked
        System.exit(0);
        
    }//GEN-LAST:event_lblExitMouseClicked

   public void setColor(JLabel l){
   l.setBackground(Color.red);
   }
   public void resetColor(JLabel l){
   l.setBackground(Color.gray);
   }
    
    private void lblExitMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblExitMouseEntered
        setColor(lblExit);
    }//GEN-LAST:event_lblExitMouseEntered

    private void lblExitMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblExitMouseExited
        resetColor(lblExit);
    }//GEN-LAST:event_lblExitMouseExited

    private void btnHomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnHomeMouseClicked
        // TODO add your handling code here:
         iFrameHome iHome=new iFrameHome();
        jDesktop.add(iHome).setVisible(true);
        
    }//GEN-LAST:event_btnHomeMouseClicked

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
            java.util.logging.Logger.getLogger(RootFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RootFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RootFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RootFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                  
                new RootFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBookBarcode;
    private javax.swing.JButton btnBookCopy;
    private javax.swing.JButton btnBookEntry;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnHome;
    private javax.swing.JButton btnIssu;
    private javax.swing.JButton btnMemberEntry;
    private javax.swing.JButton btnReceived;
    private javax.swing.JButton btnReport;
    private javax.swing.JDesktopPane jDesktop;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel lblExit;
    // End of variables declaration//GEN-END:variables
}
