package library.management.system;

import java.io.File;
import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import library.management.system.HelperClass.MyCrud;
import java.time.LocalDate;
import javax.swing.DefaultListModel;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JRootPane;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import library.management.system.HelperClass.DBConnUtill;
import library.management.system.HelperClass.Dual;
import library.management.system.HelperClass.Utill_class;

public class iFrameBookBarcode extends javax.swing.JInternalFrame implements MyCrud {

    private static final FileSystem fs = FileSystems.getDefault();
    private static final JFileChooser fc = new JFileChooser();
    private static File chooseFile;
    private Integer currObj;

    public iFrameBookBarcode() {
        initComponents();
        removedTitle();
        loadAll(null);
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
        tfCode = new javax.swing.JTextField();
        tfSearch = new javax.swing.JTextField();
        tfName = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        comStatus = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        lblimage = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        btnUpdate = new javax.swing.JButton();
        lblDate = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        listbook = new javax.swing.JList<>();

        setPreferredSize(new java.awt.Dimension(770, 580));

        jPanel1.setBackground(new java.awt.Color(127, 204, 204));
        jPanel1.setLayout(null);

        jLabel3.setBackground(new java.awt.Color(0, 51, 51));
        jLabel3.setFont(new java.awt.Font("Tahoma", 3, 30)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 51, 51));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Book Barcode form !");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(4, 4, 750, 50);
        jPanel1.add(jSeparator1);
        jSeparator1.setBounds(0, 50, 760, 20);

        tfCode.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        tfCode.setForeground(new java.awt.Color(0, 102, 102));
        tfCode.setToolTipText("");
        tfCode.setDisabledTextColor(new java.awt.Color(153, 153, 153));
        tfCode.setEnabled(false);
        tfCode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfCodeActionPerformed(evt);
            }
        });
        tfCode.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tfCodeKeyTyped(evt);
            }
        });
        jPanel1.add(tfCode);
        tfCode.setBounds(410, 230, 100, 30);

        tfSearch.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        tfSearch.setForeground(new java.awt.Color(0, 102, 102));
        tfSearch.setToolTipText("");
        tfSearch.setDisabledTextColor(new java.awt.Color(153, 153, 153));
        tfSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfSearchActionPerformed(evt);
            }
        });
        tfSearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tfSearchKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tfSearchKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tfSearchKeyTyped(evt);
            }
        });
        jPanel1.add(tfSearch);
        tfSearch.setBounds(20, 130, 290, 30);

        tfName.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        tfName.setForeground(new java.awt.Color(0, 102, 102));
        tfName.setToolTipText("");
        tfName.setDisabledTextColor(new java.awt.Color(153, 153, 153));
        tfName.setEnabled(false);
        tfName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfNameActionPerformed(evt);
            }
        });
        tfName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tfNameKeyTyped(evt);
            }
        });
        jPanel1.add(tfName);
        tfName.setBounds(420, 270, 210, 30);

        jLabel4.setBackground(new java.awt.Color(153, 153, 153));
        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 51, 102));
        jLabel4.setText("Code || Name");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(20, 110, 290, 20);

        comStatus.setBackground(new java.awt.Color(204, 204, 204));
        comStatus.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        comStatus.setForeground(new java.awt.Color(0, 51, 102));
        comStatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ok", "Damage", "Lost" }));
        comStatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comStatusActionPerformed(evt);
            }
        });
        jPanel1.add(comStatus);
        comStatus.setBounds(420, 310, 210, 30);

        jLabel7.setBackground(new java.awt.Color(153, 153, 153));
        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 51, 102));
        jLabel7.setText("Gender :");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(340, 310, 80, 30);

        lblimage.setFont(new java.awt.Font("Tahoma", 3, 36)); // NOI18N
        lblimage.setForeground(new java.awt.Color(255, 0, 0));
        lblimage.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblimage.setPreferredSize(new java.awt.Dimension(120, 120));
        jPanel1.add(lblimage);
        lblimage.setBounds(550, 130, 120, 120);

        jLabel8.setBackground(new java.awt.Color(153, 153, 153));
        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 51, 102));
        jLabel8.setText("Date :");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(492, 60, 55, 30);

        jLabel9.setBackground(new java.awt.Color(153, 153, 153));
        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 51, 102));
        jLabel9.setText(" Name :");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(340, 270, 70, 30);

        btnUpdate.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnUpdate.setForeground(new java.awt.Color(153, 0, 0));
        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });
        jPanel1.add(btnUpdate);
        btnUpdate.setBounds(400, 460, 150, 40);

        lblDate.setBackground(new java.awt.Color(153, 153, 153));
        lblDate.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblDate.setForeground(new java.awt.Color(0, 51, 102));
        lblDate.setText("20/10/1998");
        jPanel1.add(lblDate);
        lblDate.setBounds(560, 60, 160, 30);

        jLabel14.setBackground(new java.awt.Color(153, 153, 153));
        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 51, 102));
        jLabel14.setText("Code :");
        jPanel1.add(jLabel14);
        jLabel14.setBounds(350, 230, 60, 30);

        listbook.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        listbook.setForeground(new java.awt.Color(0, 51, 51));
        listbook.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        listbook.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        listbook.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                listbookValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(listbook);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(20, 170, 290, 230);

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

    private void tfCodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfCodeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfCodeActionPerformed

    private void tfCodeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfCodeKeyTyped


    }//GEN-LAST:event_tfCodeKeyTyped

    private void tfSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfSearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfSearchActionPerformed

    private void tfSearchKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfSearchKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_tfSearchKeyTyped

    private void tfNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfNameActionPerformed

    private void tfNameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfNameKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_tfNameKeyTyped

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        saveOrUpdate();
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void comStatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comStatusActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comStatusActionPerformed

    private void listbookValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_listbookValueChanged
        if (evt.getValueIsAdjusting()) {
            loadSingleObject(listbook.getSelectedValue().id);
        }
    }//GEN-LAST:event_listbookValueChanged

    private void tfSearchKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfSearchKeyPressed
        loadAll(tfSearch.getText().toLowerCase().toString().trim());
    }//GEN-LAST:event_tfSearchKeyPressed

    private void tfSearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfSearchKeyReleased
        loadAll(tfSearch.getText().toLowerCase().toString().trim());
       }//GEN-LAST:event_tfSearchKeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnUpdate;
    private javax.swing.JComboBox<String> comStatus;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblDate;
    private javax.swing.JLabel lblimage;
    private javax.swing.JList<Dual> listbook;
    private javax.swing.JTextField tfCode;
    private javax.swing.JTextField tfName;
    private javax.swing.JTextField tfSearch;
    // End of variables declaration//GEN-END:variables

    @Override
    public void clear() {
        
    }

    @Override
    public void saveOrUpdate() {

        try {
            Statement st = DBConnUtill.getConn().createStatement();
            int ret = 0;
            String status = comStatus.getSelectedItem().toString();

            if (currObj != null) {
                if (!status.isEmpty()) {

                    ret = st.executeUpdate("update LMS_BOOK_BARCODE set status='" + status + "' where id= " + currObj);
                } else {
                    JOptionPane.showMessageDialog(this, "Please Status !");
                }

            }

            if (ret == 1) {
                loadAll(tfSearch.getText());
                JOptionPane.showMessageDialog(this, "successfully Update");
                loadAll(tfSearch.getText());
            }

            st.close();

        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("err: " + e);
        }
    }

    @Override
    public void delete(String tabName) {
       
    }

    @Override
    public void loadAll(String sch) {
        try {
            Statement st = DBConnUtill.getConn().createStatement();

            String whr = "";

            if (sch != null) {
                whr = "and lower(C.BARCODE||B.NAME) like'%" + sch.trim().toLowerCase() + "%'";
            }
            ResultSet rs = st.executeQuery("select B.NAME,B.AUTHOR,C.BARCODE,C.STATUS,C.ID FROM LMS_BOOK B,LMS_BOOK_BARCODE C WHERE B.ID=C.LMS_BOOK_ID " + whr + " order by B.NAME ");

            DefaultListModel<Dual> model = new DefaultListModel();

            while (rs.next()) {

                int id = rs.getInt("ID");
                String display = rs.getString("BARCODE") + "-" + rs.getString("NAME") + "-" + rs.getString("AUTHOR")+"("+rs.getString("STATUS")+")";
                model.addElement(new Dual(id, display));
            }

            listbook.setModel(model);

            rs.close();
            st.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void loadSingleObject(int id) {

        try {

            Statement st = DBConnUtill.getConn().createStatement();

            ResultSet rs = st.executeQuery("select B.NAME,C.BARCODE,C.ID,C.LMS_BOOK_ID,C.STATUS FROM LMS_BOOK B,LMS_BOOK_BARCODE C WHERE B.ID=C.LMS_BOOK_ID and C.id=" + id);
            if (rs.next()) {
                currObj = rs.getInt("ID");
                
                    System.out.println("id==="+rs.getInt("LMS_BOOK_ID"));
                Utill_class.setImage(rs.getInt("LMS_BOOK_ID"), "LMS_BOOK", lblimage);

                tfCode.setText(rs.getString("BARCODE"));
                tfName.setText(rs.getString("NAME"));

                comStatus.setSelectedItem(rs.getString("STATUS"));

            }
            rs.close();
            st.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }

    }

}
