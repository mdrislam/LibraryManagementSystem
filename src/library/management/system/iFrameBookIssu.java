package library.management.system;

import java.sql.ResultSet;
import java.sql.Statement;
import java.time.LocalDate;
import javax.swing.JOptionPane;
import javax.swing.JRootPane;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import library.management.system.HelperClass.DBConnUtill;
import library.management.system.HelperClass.Utill_class;

public class iFrameBookIssu extends javax.swing.JInternalFrame  {

    Integer memberId;
    Integer bookBarcodeId;
    String barcode;
    public iFrameBookIssu() {
        initComponents();
        removedTitle();
        clear();
        Utill_class.setImage(-1, "lms_member", lblMemberimage);
        Utill_class.setImage(-1, "lms_book", lblBookImage);
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
        tfMemberCode = new javax.swing.JTextField();
        tfIssuDate = new javax.swing.JTextField();
        lblMemberimage = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        btnclear = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        lblBookImage = new javax.swing.JLabel();
        tfBookCode = new javax.swing.JTextField();
        tfBookName = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        btnIssu = new javax.swing.JButton();
        tfMemberName = new javax.swing.JTextField();

        setPreferredSize(new java.awt.Dimension(770, 580));

        jPanel1.setBackground(new java.awt.Color(127, 204, 204));
        jPanel1.setLayout(null);

        jLabel3.setBackground(new java.awt.Color(0, 51, 51));
        jLabel3.setFont(new java.awt.Font("Tahoma", 3, 30)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 51, 51));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Book Issu form !");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(4, 4, 750, 50);
        jPanel1.add(jSeparator1);
        jSeparator1.setBounds(0, 50, 760, 20);

        tfMemberCode.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        tfMemberCode.setForeground(new java.awt.Color(0, 102, 102));
        tfMemberCode.setToolTipText("");
        tfMemberCode.setDisabledTextColor(new java.awt.Color(153, 153, 153));
        tfMemberCode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfMemberCodeActionPerformed(evt);
            }
        });
        tfMemberCode.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tfMemberCodeKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tfMemberCodeKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tfMemberCodeKeyTyped(evt);
            }
        });
        jPanel1.add(tfMemberCode);
        tfMemberCode.setBounds(200, 180, 100, 30);

        tfIssuDate.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        tfIssuDate.setForeground(new java.awt.Color(0, 51, 102));
        tfIssuDate.setText("20/10/1998");
        tfIssuDate.setToolTipText("");
        tfIssuDate.setDisabledTextColor(new java.awt.Color(153, 153, 153));
        tfIssuDate.setEnabled(false);
        tfIssuDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfIssuDateActionPerformed(evt);
            }
        });
        tfIssuDate.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tfIssuDateKeyTyped(evt);
            }
        });
        jPanel1.add(tfIssuDate);
        tfIssuDate.setBounds(570, 60, 160, 40);

        lblMemberimage.setFont(new java.awt.Font("Tahoma", 3, 36)); // NOI18N
        lblMemberimage.setForeground(new java.awt.Color(255, 0, 0));
        lblMemberimage.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblMemberimage.setPreferredSize(new java.awt.Dimension(120, 120));
        jPanel1.add(lblMemberimage);
        lblMemberimage.setBounds(310, 90, 120, 120);

        jLabel8.setBackground(new java.awt.Color(153, 153, 153));
        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 51, 102));
        jLabel8.setText("Date :");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(510, 60, 55, 40);

        jLabel9.setBackground(new java.awt.Color(153, 153, 153));
        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 51, 102));
        jLabel9.setText("Member Name :");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(60, 220, 130, 30);

        btnclear.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnclear.setForeground(new java.awt.Color(153, 0, 0));
        btnclear.setText("Clear");
        btnclear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnclearActionPerformed(evt);
            }
        });
        jPanel1.add(btnclear);
        btnclear.setBounds(110, 470, 150, 40);

        jLabel14.setBackground(new java.awt.Color(153, 153, 153));
        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 51, 102));
        jLabel14.setText("Member Code :");
        jPanel1.add(jLabel14);
        jLabel14.setBounds(60, 180, 130, 30);

        lblBookImage.setFont(new java.awt.Font("Tahoma", 3, 36)); // NOI18N
        lblBookImage.setForeground(new java.awt.Color(255, 0, 0));
        lblBookImage.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblBookImage.setPreferredSize(new java.awt.Dimension(120, 120));
        jPanel1.add(lblBookImage);
        lblBookImage.setBounds(310, 270, 120, 120);

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
        tfBookCode.setBounds(200, 360, 100, 30);

        tfBookName.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        tfBookName.setForeground(new java.awt.Color(0, 102, 102));
        tfBookName.setToolTipText("");
        tfBookName.setDisabledTextColor(new java.awt.Color(153, 153, 153));
        tfBookName.setEnabled(false);
        tfBookName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfBookNameActionPerformed(evt);
            }
        });
        tfBookName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tfBookNameKeyTyped(evt);
            }
        });
        jPanel1.add(tfBookName);
        tfBookName.setBounds(200, 400, 210, 30);

        jLabel15.setBackground(new java.awt.Color(153, 153, 153));
        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(0, 51, 102));
        jLabel15.setText("Book Code :");
        jPanel1.add(jLabel15);
        jLabel15.setBounds(60, 360, 130, 30);

        jLabel10.setBackground(new java.awt.Color(153, 153, 153));
        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 51, 102));
        jLabel10.setText("Book Name :");
        jPanel1.add(jLabel10);
        jLabel10.setBounds(60, 400, 130, 30);

        btnIssu.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnIssu.setForeground(new java.awt.Color(153, 0, 0));
        btnIssu.setText("Issu");
        btnIssu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIssuActionPerformed(evt);
            }
        });
        jPanel1.add(btnIssu);
        btnIssu.setBounds(500, 470, 150, 40);

        tfMemberName.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        tfMemberName.setForeground(new java.awt.Color(0, 102, 102));
        tfMemberName.setToolTipText("");
        tfMemberName.setDisabledTextColor(new java.awt.Color(153, 153, 153));
        tfMemberName.setEnabled(false);
        tfMemberName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfMemberNameActionPerformed(evt);
            }
        });
        tfMemberName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tfMemberNameKeyTyped(evt);
            }
        });
        jPanel1.add(tfMemberName);
        tfMemberName.setBounds(200, 220, 210, 30);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(26, 26, 26))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tfMemberCodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfMemberCodeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfMemberCodeActionPerformed

    private void tfMemberCodeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfMemberCodeKeyTyped


    }//GEN-LAST:event_tfMemberCodeKeyTyped

    private void tfIssuDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfIssuDateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfIssuDateActionPerformed

    private void tfIssuDateKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfIssuDateKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_tfIssuDateKeyTyped

    private void btnclearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnclearActionPerformed
        clear();
        Utill_class.setImage(-1, "lms_member", lblMemberimage);
        Utill_class.setImage(-1, "lms_book", lblBookImage);
    }//GEN-LAST:event_btnclearActionPerformed

    private void tfBookCodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfBookCodeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfBookCodeActionPerformed

    private void tfBookCodeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfBookCodeKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_tfBookCodeKeyTyped

    private void tfBookNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfBookNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfBookNameActionPerformed

    private void tfBookNameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfBookNameKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_tfBookNameKeyTyped

    private void btnIssuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIssuActionPerformed
      
        IssuBook();
      
    }//GEN-LAST:event_btnIssuActionPerformed

    private void tfMemberNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfMemberNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfMemberNameActionPerformed

    private void tfMemberNameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfMemberNameKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_tfMemberNameKeyTyped

    private void tfMemberCodeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfMemberCodeKeyPressed
        loadMemberFromCode(tfMemberCode.getText().toString().trim());
    }//GEN-LAST:event_tfMemberCodeKeyPressed

    private void tfMemberCodeKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfMemberCodeKeyReleased
        loadMemberFromCode(tfMemberCode.getText().toString().trim());
    }//GEN-LAST:event_tfMemberCodeKeyReleased

    private void tfBookCodeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfBookCodeKeyPressed
        loadBookBarcode(tfBookCode.getText().toString());
    }//GEN-LAST:event_tfBookCodeKeyPressed

    private void tfBookCodeKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfBookCodeKeyReleased
        loadBookBarcode(tfBookCode.getText().toString());
    }//GEN-LAST:event_tfBookCodeKeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnIssu;
    private javax.swing.JButton btnclear;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblBookImage;
    private javax.swing.JLabel lblMemberimage;
    private javax.swing.JTextField tfBookCode;
    private javax.swing.JTextField tfBookName;
    private javax.swing.JTextField tfIssuDate;
    private javax.swing.JTextField tfMemberCode;
    private javax.swing.JTextField tfMemberName;
    // End of variables declaration//GEN-END:variables

    
    public void clear() {
        tfMemberCode.setText("");
        tfMemberName.setText("");
        tfBookCode.setText("");
        tfBookName.setText("");
        tfIssuDate.setText(LocalDate.now().toString());
        memberId=null;
        bookBarcodeId=null;
       
        
    }

   
    public void loadMemberFromCode(String sch) {
         try {
            Statement st = DBConnUtill.getConn().createStatement();

            ResultSet rs = st.executeQuery("select * from lms_member where code='" + tfMemberCode.getText().trim() + "'");

            if (rs.next()) {
                memberId = rs.getInt("ID");
                System.out.println("idd=="+memberId);
                tfMemberCode.setText(rs.getString("CODE"));
                tfMemberName.setText(rs.getString("NAME"));
                Utill_class.setImage(memberId, "lms_member", lblMemberimage);
            } else {
                memberId = null;
                tfMemberName.setText("member not found");
                Utill_class.setImage(0, "lb_member", lblMemberimage);
            }

            rs.close();
            st.close();

        } catch (Exception e) {
             memberId = null;
             tfMemberName.setText("member not found");
             Utill_class.setImage(0, "lms_member", lblMemberimage);

            System.out.println("err: " + e);
        }
    }

    private void loadBookBarcode(String text) {

        try {
            Statement st = DBConnUtill.getConn().createStatement();

            ResultSet rs = st.executeQuery("SELECT C.ID,C.LMS_BOOK_ID,C.BARCODE,B.NAME FROM LMS_BOOK B,LMS_BOOK_BARCODE C  WHERE B.ID=C.LMS_BOOK_ID and C.id not in  (select LMS_BOOK_BARCODE_ID from LMS_TRANSACTION  where RECEIVED_DATE is null) and C.BARCODE='" + text.trim() + "'");

            if (rs.next()) {
                bookBarcodeId = rs.getInt("ID");
                barcode=rs.getString("BARCODE");
                int bookId = rs.getInt("lms_BOOK_ID");
                tfBookName.setText(rs.getString("NAME"));
                Utill_class.setImage(bookId, "lms_book", lblBookImage);
            } else {
                bookBarcodeId = null;

                Utill_class.setImage(0, "lms_book", lblBookImage);
                tfBookName.setText("Book not found");
            }

            rs.close();
            st.close();

        } catch (Exception e) {
            Utill_class.setImage(0, "lms_book", lblBookImage);
            tfBookName.setText("Book not found");

            bookBarcodeId = null;
            e.printStackTrace();

            System.out.println("err: " + e);
        }

    }

    private void IssuBook() {
      if (memberId == null) {
            JOptionPane.showMessageDialog(this, "member not found"); 
            return;
        }

        if (bookBarcodeId == null) {
            JOptionPane.showMessageDialog(this, "book not found");
            return;
        }

        try {
            Statement st = DBConnUtill.getConn().createStatement();

            int ret = 0;

            int id =Utill_class.getMaxId("LMS_TRANSACTION") + 1;

            System.out.println("id: " + id);
            String inst = "INSERT INTO LMS_TRANSACTION(ID,LMS_MEMBER_ID,LMS_BOOK_BARCODE_ID,BOOKBARCODE,ISSU_DATE,CREATE_DATE) VALUES(" + id + "," + memberId + "," + bookBarcodeId + ",'" + barcode+ "','"+tfIssuDate.getText().trim()+"',CURRENT_TIMESTAMP)";

            System.out.println(inst);
            ret = st.executeUpdate(inst);

            if (ret == 1) {

                JOptionPane.showMessageDialog(this, "successfully issue");
                clear();
            }

            st.close();

        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("err: " + e);
        }}

}
