package library.management.system;

import java.sql.ResultSet;
import java.sql.Statement;
import java.time.LocalDate;
import javax.swing.JOptionPane;
import javax.swing.JRootPane;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import library.management.system.HelperClass.DBConnUtill;
import library.management.system.HelperClass.Utill_class;

public class iFrameReceived extends javax.swing.JInternalFrame  {

  Integer bookBarcodeId;

    public iFrameReceived() {
        initComponents();
        removedTitle();
        clear();

    }

    public void removedTitle() {
        putClientProperty("iFrameHome.isPalette", Boolean.TRUE);
        getRootPane().setWindowDecorationStyle(JRootPane.NONE);
        ((BasicInternalFrameUI) this.getUI()).setNorthPane(null);
        this.setBorder(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        tfBookCode = new javax.swing.JTextField();
        tfReceivedDate = new javax.swing.JTextField();
        lblBookImage = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        btnClear = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        btnReceived = new javax.swing.JButton();
        tfBOOKName = new javax.swing.JTextField();

        setPreferredSize(new java.awt.Dimension(770, 580));

        jPanel1.setBackground(new java.awt.Color(127, 204, 204));
        jPanel1.setLayout(null);

        jLabel3.setBackground(new java.awt.Color(0, 51, 51));
        jLabel3.setFont(new java.awt.Font("Tahoma", 3, 30)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 51, 51));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Book Received form !");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(4, 4, 750, 50);
        jPanel1.add(jSeparator1);
        jSeparator1.setBounds(0, 50, 760, 20);

        tfBookCode.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        tfBookCode.setForeground(new java.awt.Color(0, 102, 102));
        tfBookCode.setToolTipText("");
        tfBookCode.setDisabledTextColor(new java.awt.Color(153, 153, 153));
        tfBookCode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfBookCodeActionPerformed(evt);
            }
        });
        tfBookCode.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tfBookCodeKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tfBookCodeKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tfBookCodeKeyTyped(evt);
            }
        });
        jPanel1.add(tfBookCode);
        tfBookCode.setBounds(210, 220, 120, 30);

        tfReceivedDate.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        tfReceivedDate.setForeground(new java.awt.Color(0, 102, 102));
        tfReceivedDate.setText("20/10/1998");
        tfReceivedDate.setToolTipText("");
        tfReceivedDate.setDisabledTextColor(new java.awt.Color(153, 153, 153));
        tfReceivedDate.setEnabled(false);
        tfReceivedDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfReceivedDateActionPerformed(evt);
            }
        });
        tfReceivedDate.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tfReceivedDateKeyTyped(evt);
            }
        });
        jPanel1.add(tfReceivedDate);
        tfReceivedDate.setBounds(550, 60, 160, 30);

        lblBookImage.setFont(new java.awt.Font("Tahoma", 3, 36)); // NOI18N
        lblBookImage.setForeground(new java.awt.Color(255, 0, 0));
        lblBookImage.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblBookImage.setPreferredSize(new java.awt.Dimension(120, 120));
        jPanel1.add(lblBookImage);
        lblBookImage.setBounds(350, 130, 120, 120);

        jLabel8.setBackground(new java.awt.Color(153, 153, 153));
        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 51, 102));
        jLabel8.setText("Date :");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(492, 60, 55, 30);

        jLabel9.setBackground(new java.awt.Color(153, 153, 153));
        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 51, 102));
        jLabel9.setText(" Book Name :");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(80, 260, 120, 30);

        btnClear.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnClear.setForeground(new java.awt.Color(153, 0, 0));
        btnClear.setText("Clear");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });
        jPanel1.add(btnClear);
        btnClear.setBounds(140, 440, 150, 40);

        jLabel14.setBackground(new java.awt.Color(153, 153, 153));
        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 51, 102));
        jLabel14.setText("Book Code :");
        jPanel1.add(jLabel14);
        jLabel14.setBounds(90, 220, 120, 30);

        btnReceived.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnReceived.setForeground(new java.awt.Color(153, 0, 0));
        btnReceived.setText("Received");
        btnReceived.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReceivedActionPerformed(evt);
            }
        });
        jPanel1.add(btnReceived);
        btnReceived.setBounds(470, 440, 150, 40);

        tfBOOKName.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        tfBOOKName.setForeground(new java.awt.Color(0, 102, 102));
        tfBOOKName.setToolTipText("");
        tfBOOKName.setDisabledTextColor(new java.awt.Color(153, 153, 153));
        tfBOOKName.setEnabled(false);
        tfBOOKName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfBOOKNameActionPerformed(evt);
            }
        });
        tfBOOKName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tfBOOKNameKeyTyped(evt);
            }
        });
        jPanel1.add(tfBOOKName);
        tfBOOKName.setBounds(210, 260, 220, 30);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tfBookCodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfBookCodeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfBookCodeActionPerformed

    private void tfBookCodeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfBookCodeKeyTyped


    }//GEN-LAST:event_tfBookCodeKeyTyped

    private void tfReceivedDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfReceivedDateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfReceivedDateActionPerformed

    private void tfReceivedDateKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfReceivedDateKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_tfReceivedDateKeyTyped

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
      clear();
    }//GEN-LAST:event_btnClearActionPerformed

    private void btnReceivedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReceivedActionPerformed
        receivedBook();
    }//GEN-LAST:event_btnReceivedActionPerformed

    private void tfBOOKNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfBOOKNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfBOOKNameActionPerformed

    private void tfBOOKNameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfBOOKNameKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_tfBOOKNameKeyTyped

    private void tfBookCodeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfBookCodeKeyPressed
        loadBookBarcode(tfBookCode.getText().toString().trim());
    }//GEN-LAST:event_tfBookCodeKeyPressed

    private void tfBookCodeKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfBookCodeKeyReleased
        loadBookBarcode(tfBookCode.getText().toString().trim());
    }//GEN-LAST:event_tfBookCodeKeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnReceived;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblBookImage;
    private javax.swing.JTextField tfBOOKName;
    private javax.swing.JTextField tfBookCode;
    private javax.swing.JTextField tfReceivedDate;
    // End of variables declaration//GEN-END:variables

   void clear(){
   tfReceivedDate.setText(LocalDate.now().toString());
   tfBOOKName.setText("");
   tfBookCode.setText("");
   bookBarcodeId=null;
   Utill_class.setImage(-1, "lms_book", lblBookImage);
   }
    private void receivedBook() {
 if (bookBarcodeId == null) {
            JOptionPane.showMessageDialog(this, "book not found");
            return;
        }

        try {
            Statement st = DBConnUtill.getConn().createStatement();

            int ret = 0;

            String inst = "UPDATE LMS_TRANSACTION set RECEIVED_DATE='" + tfReceivedDate.getText() + "', UPDATE_DATE=CURRENT_TIMESTAMP   where RECEIVED_DATE is null and LMS_BOOK_BARCODE_ID=" + bookBarcodeId;

            System.out.println(inst);
            ret = st.executeUpdate(inst);

            if (ret == 1) {

                JOptionPane.showMessageDialog(this, "successfully received");
                btnClearActionPerformed(null);
            }

            st.close();

        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("err: " + e);
        }    }

   
  
    private void loadBookBarcode(String text) {

        try {
            Statement st = DBConnUtill.getConn().createStatement();

            ResultSet rs = st.executeQuery("SELECT C.ID,C.LMS_BOOK_ID,B.NAME FROM LMS_BOOK B, LMS_BOOK_BARCODE C  WHERE B.id=C.LMS_BOOK_ID and C.id  in  (select LMS_BOOK_BARCODE_ID from LMS_TRANSACTION  where RECEIVED_DATE is null) and C.BARCODE='" + text.trim() + "'");

            if (rs.next()) {
                bookBarcodeId = rs.getInt("ID");
                int bookId = rs.getInt("LMS_BOOK_ID");
                tfBOOKName.setText(rs.getString("NAME"));

                Utill_class.setImage(bookId, "lms_book", lblBookImage);
            } else {
                bookBarcodeId = null;

                Utill_class.setImage(0, "lms_book", lblBookImage);
            }

            rs.close();
            st.close();

        } catch (Exception e) {
            Utill_class.setImage(0, "lms_book", lblBookImage);

            bookBarcodeId = null;

            System.out.println("err: " + e);
        }

    }

    
   

}
