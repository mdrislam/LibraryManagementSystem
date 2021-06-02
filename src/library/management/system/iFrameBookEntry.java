package library.management.system;

import java.awt.Image;
import java.io.File;
import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import library.management.system.HelperClass.Utill_class;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JRootPane;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import library.management.system.HelperClass.DBConnUtill;
import library.management.system.HelperClass.Dual;
import library.management.system.HelperClass.MyCrud;

public class iFrameBookEntry extends javax.swing.JInternalFrame implements MyCrud {

    private static final FileSystem fs = FileSystems.getDefault();
    private static final JFileChooser fc = new JFileChooser();
    private static File chooseFile;
    private Integer currObj;

    public iFrameBookEntry() {
        initComponents();
        removedTitle();
        loadAll(null);
        clear();
        Utill_class.setImage(-1, "LMS_BOOK", lblMamberImage);

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
        tfAuthor = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
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
        listBook = new javax.swing.JList<>();

        setPreferredSize(new java.awt.Dimension(770, 580));

        jPanel1.setBackground(new java.awt.Color(0, 204, 204));
        jPanel1.setLayout(null);

        jLabel3.setBackground(new java.awt.Color(0, 51, 51));
        jLabel3.setFont(new java.awt.Font("Tahoma", 3, 30)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 51, 51));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Book entry form !");
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
        tfCode.setBounds(320, 250, 100, 30);

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

        tfName.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        tfName.setForeground(new java.awt.Color(0, 102, 102));
        tfName.setToolTipText("");
        tfName.setDisabledTextColor(new java.awt.Color(153, 153, 153));
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
        tfName.setBounds(320, 290, 230, 30);

        tfAuthor.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        tfAuthor.setForeground(new java.awt.Color(0, 102, 102));
        tfAuthor.setToolTipText("");
        tfAuthor.setDisabledTextColor(new java.awt.Color(153, 153, 153));
        tfAuthor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfAuthorActionPerformed(evt);
            }
        });
        tfAuthor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tfAuthorKeyTyped(evt);
            }
        });
        jPanel1.add(tfAuthor);
        tfAuthor.setBounds(320, 330, 230, 30);

        jLabel4.setBackground(new java.awt.Color(153, 153, 153));
        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 51, 102));
        jLabel4.setText("Code || Name");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(20, 110, 220, 20);

        lblMamberImage.setFont(new java.awt.Font("Tahoma", 3, 36)); // NOI18N
        lblMamberImage.setForeground(new java.awt.Color(255, 0, 0));
        lblMamberImage.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblMamberImage.setPreferredSize(new java.awt.Dimension(120, 120));
        jPanel1.add(lblMamberImage);
        lblMamberImage.setBounds(440, 130, 120, 120);

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
        jLabel9.setBounds(250, 290, 70, 30);

        btnBrowse.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnBrowse.setForeground(new java.awt.Color(153, 0, 0));
        btnBrowse.setText("Browse");
        btnBrowse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBrowseActionPerformed(evt);
            }
        });
        jPanel1.add(btnBrowse);
        btnBrowse.setBounds(440, 250, 80, 30);

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
        jLabel13.setText("Author :");
        jPanel1.add(jLabel13);
        jLabel13.setBounds(250, 330, 80, 30);

        jLabel14.setBackground(new java.awt.Color(153, 153, 153));
        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 51, 102));
        jLabel14.setText("Code :");
        jPanel1.add(jLabel14);
        jLabel14.setBounds(260, 250, 60, 30);

        listBook.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        listBook.setForeground(new java.awt.Color(0, 51, 51));
        listBook.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        listBook.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        listBook.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                listBookValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(listBook);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(20, 170, 220, 230);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 762, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
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

    private void tfAuthorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfAuthorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfAuthorActionPerformed

    private void tfAuthorKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfAuthorKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_tfAuthorKeyTyped

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        clear();
        int code = Utill_class.getMaxCode("LMS_BOOK") + 1;
        String cd = Utill_class.lpad(code, 4, "0");
        tfCode.setText(cd);
    }//GEN-LAST:event_btnResetActionPerformed

    private void btnSaveOrUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveOrUpdateActionPerformed
        saveOrUpdate();
    }//GEN-LAST:event_btnSaveOrUpdateActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        delete("LMS_BOOK");
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void listBookValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_listBookValueChanged
        if (evt.getValueIsAdjusting()) {
            loadSingleObject(listBook.getSelectedValue().id);
        }
    }//GEN-LAST:event_listBookValueChanged

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
        }    }//GEN-LAST:event_btnBrowseActionPerformed

    private void tfSearchKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfSearchKeyPressed
        loadAll(tfSearch.getText().toLowerCase().toString().trim());
    }//GEN-LAST:event_tfSearchKeyPressed

    private void tfSearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfSearchKeyReleased
        loadAll(tfSearch.getText().toLowerCase().toString().trim());
    }//GEN-LAST:event_tfSearchKeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBrowse;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnReset;
    private javax.swing.JButton btnSaveOrUpdate;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblDate;
    private javax.swing.JLabel lblMamberImage;
    private javax.swing.JList<Dual> listBook;
    private javax.swing.JTextField tfAuthor;
    private javax.swing.JTextField tfCode;
    private javax.swing.JTextField tfName;
    private javax.swing.JTextField tfSearch;
    // End of variables declaration//GEN-END:variables

    @Override
    public void clear() {
        currObj = null;
        tfCode.setText("");
        tfName.setText("");
        tfAuthor.setText("");
        btnSaveOrUpdate.setText("Save");
        lblDate.setText(LocalDate.now().toString());
        Utill_class.setImage(-1, "LMS_BOOK", lblMamberImage);
        tfCode.setText("");
        chooseFile = null;

    }

    @Override
    public void saveOrUpdate() {

        try {
            Statement st = DBConnUtill.getConn().createStatement();

            int ret = 0;

            String name = tfName.getText();
            String author = tfAuthor.getText();

            if (currObj == null) {
                if (validation(chooseFile, name, author)) {
                    currObj = Utill_class.getMaxId("LMS_BOOK") + 1;

                    int cd = Utill_class.getMaxCode("LMS_BOOK") + 1;

                    String code = Utill_class.lpad(cd, 4, "0");
                    ret = st.executeUpdate("insert into LMS_BOOK(id,code,name,author) values(" + currObj + ",'" + code + "','" + name + "','" + author + "')");

                    if (chooseFile != null) {
                        File dest = new File("LMS_IMAGE\\LMS_BOOK\\" + currObj + ".jpg");
                        //save image to folder
                        Utill_class.imageCopy(chooseFile, dest);

                    }

                }
            } else {
                if (!name.isEmpty() && !author.isEmpty()) {
                    ret = st.executeUpdate("update LMS_BOOK set name='" + name + "' , author='" + author + "' where id= " + currObj);
                    if (chooseFile != null) {
                        File dest = new File("LMS_IMAGE\\LMS_BOOK\\" + currObj + ".jpg");
                        //save image to folder
                        Utill_class.imageCopy(chooseFile, dest);
                    }

                }else{
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

            ResultSet rs = st.executeQuery("select * from LMS_BOOK " + whr + " order by name ");

            DefaultListModel<Dual> model = new DefaultListModel();

            while (rs.next()) {
                int id = rs.getInt("ID");
                String display = rs.getString("CODE") + "-" + rs.getString("NAME") + "-" + rs.getString("AUTHOR");
                model.addElement(new Dual(id, display));
            }
            listBook.setModel(model);

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

            ResultSet rs = st.executeQuery("select * from LMS_BOOK where id=" + id);
            if (rs.next()) {
                currObj = rs.getInt("ID");
                System.out.println("curr up obj==" + currObj);
                Utill_class.setImage(currObj, "LMS_BOOK", lblMamberImage);

                tfCode.setText(rs.getString("CODE"));
                tfName.setText(rs.getString("NAME"));
                tfAuthor.setText(rs.getString("AUTHOR"));
                btnSaveOrUpdate.setText("Update");
            }
            rs.close();
            st.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }

    }

    private boolean validation(File chooseFile, String name, String author) {
        boolean valid = true;
        if (chooseFile == null) {
            valid = false;
            JOptionPane.showMessageDialog(this, "Image field is empty!");
        }
        if (name.isEmpty()) {
            valid = false;
            JOptionPane.showMessageDialog(this, "Name field is empty!");
        } else {

        }
        if (author.isEmpty()) {
            valid = false;
            JOptionPane.showMessageDialog(this, "Name field is empty!");
        } else {

        }
        return valid;
    }
}
