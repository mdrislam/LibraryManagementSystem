package library.management.system;

import java.awt.Image;
import java.io.File;
import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import library.management.system.HelperClass.MyCrud;
import java.time.LocalDate;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JRootPane;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import library.management.system.HelperClass.DBConnUtill;
import library.management.system.HelperClass.Dual;
import library.management.system.HelperClass.Utill_class;

public class iFrameMemberEntry extends javax.swing.JInternalFrame implements MyCrud {

    private static final FileSystem fs = FileSystems.getDefault();
    private static final JFileChooser fc = new JFileChooser();
    private static File chooseFile;
    private Integer currObj;

    public iFrameMemberEntry() {
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
        tfMemberCode = new javax.swing.JTextField();
        tfSearch = new javax.swing.JTextField();
        tfMName = new javax.swing.JTextField();
        tfMobile = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        comGender = new javax.swing.JComboBox<String>();
        taAddress = new javax.swing.JScrollPane();
        TxtAddress = new javax.swing.JTextArea();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        lblMamberImage = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        btnReset = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        btnBrowse = new javax.swing.JButton();
        btnSaveOrUpdate = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        lblDate = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        listMember = new javax.swing.JList<Dual>();

        setPreferredSize(new java.awt.Dimension(770, 580));

        jPanel1.setBackground(new java.awt.Color(127, 204, 204));
        jPanel1.setLayout(null);

        jLabel3.setBackground(new java.awt.Color(0, 51, 51));
        jLabel3.setFont(new java.awt.Font("Tahoma", 3, 30)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 51, 51));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Member entry form !");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(4, 4, 750, 50);
        jPanel1.add(jSeparator1);
        jSeparator1.setBounds(0, 50, 760, 20);

        tfMemberCode.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        tfMemberCode.setForeground(new java.awt.Color(0, 102, 102));
        tfMemberCode.setToolTipText("");
        tfMemberCode.setDisabledTextColor(new java.awt.Color(153, 153, 153));
        tfMemberCode.setEnabled(false);
        tfMemberCode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfMemberCodeActionPerformed(evt);
            }
        });
        tfMemberCode.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tfMemberCodeKeyTyped(evt);
            }
        });
        jPanel1.add(tfMemberCode);
        tfMemberCode.setBounds(330, 230, 100, 30);

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
        tfSearch.setBounds(20, 130, 220, 30);

        tfMName.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        tfMName.setForeground(new java.awt.Color(0, 102, 102));
        tfMName.setToolTipText("");
        tfMName.setDisabledTextColor(new java.awt.Color(153, 153, 153));
        tfMName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfMNameActionPerformed(evt);
            }
        });
        tfMName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tfMNameKeyTyped(evt);
            }
        });
        jPanel1.add(tfMName);
        tfMName.setBounds(330, 270, 210, 30);

        tfMobile.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        tfMobile.setForeground(new java.awt.Color(0, 102, 102));
        tfMobile.setToolTipText("");
        tfMobile.setDisabledTextColor(new java.awt.Color(153, 153, 153));
        tfMobile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfMobileActionPerformed(evt);
            }
        });
        tfMobile.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tfMobileKeyTyped(evt);
            }
        });
        jPanel1.add(tfMobile);
        tfMobile.setBounds(330, 350, 210, 30);

        jLabel4.setBackground(new java.awt.Color(153, 153, 153));
        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 51, 102));
        jLabel4.setText("Code || Name");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(20, 110, 220, 20);

        comGender.setBackground(new java.awt.Color(204, 204, 204));
        comGender.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        comGender.setForeground(new java.awt.Color(0, 51, 102));
        comGender.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Male", "Female" }));
        comGender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comGenderActionPerformed(evt);
            }
        });
        jPanel1.add(comGender);
        comGender.setBounds(330, 310, 210, 30);

        TxtAddress.setColumns(20);
        TxtAddress.setFont(new java.awt.Font("Monospaced", 0, 16)); // NOI18N
        TxtAddress.setForeground(new java.awt.Color(0, 51, 102));
        TxtAddress.setRows(5);
        taAddress.setViewportView(TxtAddress);

        jPanel1.add(taAddress);
        taAddress.setBounds(330, 390, 210, 70);

        jLabel6.setBackground(new java.awt.Color(153, 153, 153));
        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 51, 102));
        jLabel6.setText("Address :");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(250, 390, 90, 20);

        jLabel7.setBackground(new java.awt.Color(153, 153, 153));
        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 51, 102));
        jLabel7.setText("Gender :");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(250, 310, 80, 30);

        lblMamberImage.setFont(new java.awt.Font("Tahoma", 3, 36)); // NOI18N
        lblMamberImage.setForeground(new java.awt.Color(255, 0, 0));
        lblMamberImage.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblMamberImage.setPreferredSize(new java.awt.Dimension(120, 120));
        jPanel1.add(lblMamberImage);
        lblMamberImage.setBounds(460, 110, 120, 120);

        jLabel8.setBackground(new java.awt.Color(153, 153, 153));
        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 51, 102));
        jLabel8.setText("Date :");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(492, 60, 55, 30);

        btnReset.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnReset.setForeground(new java.awt.Color(153, 0, 0));
        btnReset.setText("New");
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });
        jPanel1.add(btnReset);
        btnReset.setBounds(40, 500, 150, 40);

        jLabel9.setBackground(new java.awt.Color(153, 153, 153));
        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 51, 102));
        jLabel9.setText(" Name :");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(250, 270, 70, 30);

        btnBrowse.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnBrowse.setForeground(new java.awt.Color(153, 0, 0));
        btnBrowse.setText("Browse");
        btnBrowse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBrowseActionPerformed(evt);
            }
        });
        jPanel1.add(btnBrowse);
        btnBrowse.setBounds(460, 230, 80, 30);

        btnSaveOrUpdate.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnSaveOrUpdate.setForeground(new java.awt.Color(153, 0, 0));
        btnSaveOrUpdate.setText("Save");
        btnSaveOrUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveOrUpdateActionPerformed(evt);
            }
        });
        jPanel1.add(btnSaveOrUpdate);
        btnSaveOrUpdate.setBounds(280, 500, 150, 40);

        btnDelete.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnDelete.setForeground(new java.awt.Color(153, 0, 0));
        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        jPanel1.add(btnDelete);
        btnDelete.setBounds(540, 500, 150, 40);

        lblDate.setBackground(new java.awt.Color(153, 153, 153));
        lblDate.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblDate.setForeground(new java.awt.Color(0, 51, 102));
        lblDate.setText("20/10/1998");
        jPanel1.add(lblDate);
        lblDate.setBounds(560, 60, 160, 30);

        jLabel13.setBackground(new java.awt.Color(153, 153, 153));
        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 51, 102));
        jLabel13.setText("Mobile :");
        jPanel1.add(jLabel13);
        jLabel13.setBounds(250, 350, 80, 30);

        jLabel14.setBackground(new java.awt.Color(153, 153, 153));
        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 51, 102));
        jLabel14.setText("Code :");
        jPanel1.add(jLabel14);
        jLabel14.setBounds(260, 230, 60, 30);

        listMember.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        listMember.setForeground(new java.awt.Color(0, 51, 51));
        listMember.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        listMember.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        listMember.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                listMemberValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(listMember);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(20, 170, 220, 230);

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

    private void tfMemberCodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfMemberCodeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfMemberCodeActionPerformed

    private void tfMemberCodeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfMemberCodeKeyTyped


    }//GEN-LAST:event_tfMemberCodeKeyTyped

    private void tfSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfSearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfSearchActionPerformed

    private void tfSearchKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfSearchKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_tfSearchKeyTyped

    private void tfMNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfMNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfMNameActionPerformed

    private void tfMNameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfMNameKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_tfMNameKeyTyped

    private void tfMobileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfMobileActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfMobileActionPerformed

    private void tfMobileKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfMobileKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_tfMobileKeyTyped

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        clear();
        int cd = Utill_class.getMaxCode("LMS_MEMBER") + 1;
        String code = Utill_class.lpad(cd, 6, "0");
        tfMemberCode.setText(code);
    }//GEN-LAST:event_btnResetActionPerformed

    private void btnSaveOrUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveOrUpdateActionPerformed
        saveOrUpdate();
    }//GEN-LAST:event_btnSaveOrUpdateActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        delete("LMS_MEMBER");
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void comGenderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comGenderActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comGenderActionPerformed

    private void btnBrowseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBrowseActionPerformed
        int returnVal = fc.showOpenDialog(this);

        if (returnVal == JFileChooser.APPROVE_OPTION) {
            chooseFile = fc.getSelectedFile();

            ImageIcon gg = new ImageIcon(chooseFile.toString());
            System.out.println("image Path==" + chooseFile);

            Image nn = gg.getImage().getScaledInstance(lblMamberImage.getWidth(), lblMamberImage.getHeight(), 0);

            lblMamberImage.setIcon(new ImageIcon(nn));

            //This is where a real application would open the file.
            System.out.println("Opening: " + chooseFile.getName());
        } else {
            System.out.println("Open command cancelled by user.");
        }
    }//GEN-LAST:event_btnBrowseActionPerformed

    private void listMemberValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_listMemberValueChanged
        if (evt.getValueIsAdjusting()) {
            loadSingleObject(listMember.getSelectedValue().id);
        }
    }//GEN-LAST:event_listMemberValueChanged

    private void tfSearchKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfSearchKeyPressed
        loadAll(tfSearch.getText().toLowerCase().toString().trim());
    }//GEN-LAST:event_tfSearchKeyPressed

    private void tfSearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfSearchKeyReleased
   loadAll(tfSearch.getText().toLowerCase().toString().trim());
       }//GEN-LAST:event_tfSearchKeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea TxtAddress;
    private javax.swing.JButton btnBrowse;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnReset;
    private javax.swing.JButton btnSaveOrUpdate;
    private javax.swing.JComboBox<String> comGender;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblDate;
    private javax.swing.JLabel lblMamberImage;
    private javax.swing.JList<Dual> listMember;
    private javax.swing.JScrollPane taAddress;
    private javax.swing.JTextField tfMName;
    private javax.swing.JTextField tfMemberCode;
    private javax.swing.JTextField tfMobile;
    private javax.swing.JTextField tfSearch;
    // End of variables declaration//GEN-END:variables

    @Override
    public void clear() {
        lblDate.setText(LocalDate.now().toString());
        tfMName.setText("");
        comGender.setSelectedIndex(0);
        tfMobile.setText("");
        TxtAddress.setText("");
        tfMemberCode.setText("");
        btnSaveOrUpdate.setText("Save");
        lblDate.setText(LocalDate.now().toString());
        Utill_class.setImage(-1, "LMS_MEMBER", lblMamberImage);
    }

    @Override
    public void saveOrUpdate() {

        try {
            Statement st = DBConnUtill.getConn().createStatement();

            int ret = 0;

            String name = tfMName.getText().toString();
            String gender = comGender.getSelectedItem().toString();
            String mobile = tfMobile.getText().toString();
            String address = TxtAddress.getText();

            if (currObj == null) {
                if (validation(chooseFile, name, gender, mobile, address)) {
                    currObj = Utill_class.getMaxId("LMS_MEMBER") + 1;

                    int cd = Utill_class.getMaxCode("LMS_MEMBER") + 1;

                    String code = Utill_class.lpad(cd, 6, "0");
                    ret = st.executeUpdate("insert into LMS_MEMBER(id,code,name,mobile,ADDRESS,GENDER) values(" + currObj + ",'" + code + "','" + name + "','" + mobile + "','" + address + "','" + gender + "')");

                    if (chooseFile != null) {
                        File dest = new File("LMS_IMAGE\\LMS_MEMBER\\" + currObj + ".jpg");
                        //save image to folder
                        Utill_class.imageCopy(chooseFile, dest);

                    }

                } else {
                    JOptionPane.showMessageDialog(this, "Empty Fields not allowed !");
                }

            } else {
                if (!name.isEmpty() && !gender.isEmpty() && !mobile.isEmpty() && !address.isEmpty()) {

                    ret = st.executeUpdate("update LMS_MEMBER set name='" + name + "' , mobile='" + mobile + "', ADDRESS='" + address + "',GENDER='" + gender + "' where id= " + currObj);

                    if (chooseFile != null) {
                        File dest = new File("LMS_IMAGE\\LMS_MEMBER\\" + currObj + ".jpg");
                        //save image to folder
                        Utill_class.imageCopy(chooseFile, dest);
                    }

                } else {
                    JOptionPane.showMessageDialog(this, "Name or Author field is empty !");
                }

            }

            if (ret == 1) {
                loadAll(tfSearch.getText());
                JOptionPane.showMessageDialog(this, "successfully " + btnSaveOrUpdate.getText());
                clear();
            }

            st.close();

        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("err: " + e);
        }
    }

    @Override
    public void delete(String tabName) {
        boolean isDel = Utill_class.delete(currObj, tabName);

        if (isDel) {
            JOptionPane.showMessageDialog(this, "successfully delete");
            loadAll(tfSearch.getText());
            clear();
        }
    }

    @Override
    public void loadAll(String sch) {
        try {
            Statement st = DBConnUtill.getConn().createStatement();

            String whr = "";

            if (sch != null) {
                whr = "where lower(CODE||NAME) like'%" + sch.trim().toLowerCase() + "%'";
            }

            ResultSet rs = st.executeQuery("select * from LMS_MEMBER " + whr + " order by name ");

            DefaultListModel<Dual> model = new DefaultListModel();

            while (rs.next()) {
            
                int id = rs.getInt("ID");
                String display = rs.getString("CODE") + "-" + rs.getString("NAME") + "-" + rs.getString("MOBILE");
                model.addElement(new Dual(id, display));
            }
            
            listMember.setModel(model);

            rs.close();
            st.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void loadSingleObject(int id) {

        clear();
        try {

            Statement st = DBConnUtill.getConn().createStatement();

            ResultSet rs = st.executeQuery("select * from LMS_MEMBER where id=" + id);
            if (rs.next()) {
                currObj = rs.getInt("ID");

                Utill_class.setImage(currObj, "LMS_MEMBER", lblMamberImage);

                tfMemberCode.setText(rs.getString("CODE"));
                tfMName.setText(rs.getString("NAME"));
                TxtAddress.setText(rs.getString("ADDRESS"));
                comGender.setSelectedItem(rs.getString("GENDER"));
                tfMobile.setText(rs.getString("MOBILE"));
                btnSaveOrUpdate.setText("Update");
            }
            rs.close();
            st.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }

    }

    private boolean validation(File chooseFile, String name, String gender, String mobile, String address) {
        boolean valid = true;
        if (chooseFile == null) {
            valid = false;
        }
        if (name.isEmpty()) {
            valid = false;

        }
        if (gender.isEmpty()) {
            valid = false;

        }
        if (mobile.isEmpty()) {
            valid = false;

        }
        if (address.isEmpty()) {
            valid = false;

        }
        return valid;
    }
}
