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

public class iFrameBookCopy extends javax.swing.JInternalFrame implements MyCrud {

    private static final FileSystem fs = FileSystems.getDefault();
    private static final JFileChooser fc = new JFileChooser();
    private static File chooseFile;
    private Integer currObj;

    public iFrameBookCopy() {
        initComponents();
        removedTitle();
        loadAll(null);
        tfdate.setText(LocalDate.now().toString());
        btngenarateCopy.setVisible(false);
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
        tfdate = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        lblMamberImage = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        btnReset = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        btnSaveOrUpdate = new javax.swing.JButton();
        btngenarateCopy = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        listMember = new javax.swing.JList<Dual>();
        tfnumberofcopy = new javax.swing.JTextField();
        btnDelete = new javax.swing.JButton();
        tfName = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(770, 580));

        jPanel1.setBackground(new java.awt.Color(127, 204, 204));
        jPanel1.setLayout(null);

        jLabel3.setBackground(new java.awt.Color(0, 51, 51));
        jLabel3.setFont(new java.awt.Font("Tahoma", 3, 30)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 51, 51));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Book copy  form !");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(4, 4, 750, 50);
        jPanel1.add(jSeparator1);
        jSeparator1.setBounds(0, 50, 760, 20);

        tfCode.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        tfCode.setForeground(new java.awt.Color(0, 102, 102));
        tfCode.setToolTipText("");
        tfCode.setDisabledTextColor(new java.awt.Color(153, 153, 153));
        tfCode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfCodeActionPerformed(evt);
            }
        });
        tfCode.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tfCodeKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tfCodeKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tfCodeKeyTyped(evt);
            }
        });
        jPanel1.add(tfCode);
        tfCode.setBounds(480, 240, 100, 30);

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

        tfdate.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        tfdate.setForeground(new java.awt.Color(0, 102, 102));
        tfdate.setToolTipText("");
        tfdate.setDisabledTextColor(new java.awt.Color(153, 153, 153));
        tfdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfdateActionPerformed(evt);
            }
        });
        tfdate.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tfdateKeyTyped(evt);
            }
        });
        jPanel1.add(tfdate);
        tfdate.setBounds(550, 60, 170, 30);

        jLabel4.setBackground(new java.awt.Color(153, 153, 153));
        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 51, 102));
        jLabel4.setText("Code || Name");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(20, 110, 290, 20);

        lblMamberImage.setFont(new java.awt.Font("Tahoma", 3, 36)); // NOI18N
        lblMamberImage.setForeground(new java.awt.Color(255, 0, 0));
        lblMamberImage.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblMamberImage.setPreferredSize(new java.awt.Dimension(120, 120));
        jPanel1.add(lblMamberImage);
        lblMamberImage.setBounds(550, 110, 120, 120);

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
        jLabel9.setText("No of copy :");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(370, 320, 100, 30);

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

        btngenarateCopy.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btngenarateCopy.setForeground(new java.awt.Color(153, 0, 0));
        btngenarateCopy.setText("Genarate copy");
        btngenarateCopy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btngenarateCopyActionPerformed(evt);
            }
        });
        jPanel1.add(btngenarateCopy);
        btngenarateCopy.setBounds(400, 420, 230, 40);

        jLabel14.setBackground(new java.awt.Color(153, 153, 153));
        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 51, 102));
        jLabel14.setText("Code :");
        jPanel1.add(jLabel14);
        jLabel14.setBounds(410, 240, 60, 30);

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
        jScrollPane1.setBounds(20, 170, 290, 230);

        tfnumberofcopy.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        tfnumberofcopy.setForeground(new java.awt.Color(0, 102, 102));
        tfnumberofcopy.setToolTipText("");
        tfnumberofcopy.setDisabledTextColor(new java.awt.Color(153, 153, 153));
        tfnumberofcopy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfnumberofcopyActionPerformed(evt);
            }
        });
        tfnumberofcopy.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tfnumberofcopyKeyTyped(evt);
            }
        });
        jPanel1.add(tfnumberofcopy);
        tfnumberofcopy.setBounds(480, 320, 210, 30);

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
        tfName.setBounds(480, 280, 210, 30);

        jLabel10.setBackground(new java.awt.Color(153, 153, 153));
        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 51, 102));
        jLabel10.setText(" Name :");
        jPanel1.add(jLabel10);
        jLabel10.setBounds(400, 280, 70, 30);

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

    private void tfdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfdateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfdateActionPerformed

    private void tfdateKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfdateKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_tfdateKeyTyped

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        clear();

    }//GEN-LAST:event_btnResetActionPerformed

    private void btnSaveOrUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveOrUpdateActionPerformed
        saveOrUpdate();
    }//GEN-LAST:event_btnSaveOrUpdateActionPerformed

    private void btngenarateCopyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btngenarateCopyActionPerformed
        genCopy();
    }//GEN-LAST:event_btngenarateCopyActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void tfnumberofcopyKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfnumberofcopyKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_tfnumberofcopyKeyTyped

    private void tfnumberofcopyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfnumberofcopyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfnumberofcopyActionPerformed

    private void tfNameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfNameKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_tfNameKeyTyped

    private void tfNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfNameActionPerformed

    private void tfCodeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfCodeKeyTyped

    }//GEN-LAST:event_tfCodeKeyTyped

    private void tfCodeKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfCodeKeyReleased
        getBookIdFromCode(tfCode.getText().toString().trim());
    }//GEN-LAST:event_tfCodeKeyReleased

    private void tfCodeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfCodeKeyPressed
        getBookIdFromCode(tfCode.getText().toString().trim());
    }//GEN-LAST:event_tfCodeKeyPressed

    private void tfCodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfCodeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfCodeActionPerformed

    private void listMemberValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_listMemberValueChanged
        if (evt.getValueIsAdjusting()) {
            loadSingleObject(listMember.getSelectedValue().id);
        }
    }//GEN-LAST:event_listMemberValueChanged

    private void tfSearchKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfSearchKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_tfSearchKeyTyped

    private void tfSearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfSearchKeyReleased
        loadAll(tfSearch.getText().toLowerCase().toString().trim());
    }//GEN-LAST:event_tfSearchKeyReleased

    private void tfSearchKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfSearchKeyPressed
        loadAll(tfSearch.getText().toLowerCase().toString().trim());
    }//GEN-LAST:event_tfSearchKeyPressed

    private void tfSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfSearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfSearchActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnReset;
    private javax.swing.JButton btnSaveOrUpdate;
    private javax.swing.JButton btngenarateCopy;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblMamberImage;
    private javax.swing.JList<Dual> listMember;
    private javax.swing.JTextField tfCode;
    private javax.swing.JTextField tfName;
    private javax.swing.JTextField tfSearch;
    private javax.swing.JTextField tfdate;
    private javax.swing.JTextField tfnumberofcopy;
    // End of variables declaration//GEN-END:variables

    @Override
    public void clear() {
        tfdate.setText(LocalDate.now().toString());
        tfCode.setText("");
        btnSaveOrUpdate.setText("Save");
        tfName.setText("");
        tfnumberofcopy.setText("");
        Utill_class.setImage(-1, "LMS_MEMBER", lblMamberImage);
        btnDelete.setVisible(true);
        btnSaveOrUpdate.setVisible(true);
        tfCode.enable(true);
        tfdate.enable(true);
        tfnumberofcopy.enable(true);
        currObj=null;
    }

    @Override
    public void saveOrUpdate() {

        try {
            Statement st = DBConnUtill.getConn().createStatement();

            int ret = 0;

            String coder = tfCode.getText().toString().trim();

            String no_of_copy = tfnumberofcopy.getText().toString().trim();
            String entireDate = tfdate.getText().toString().trim();
            String name = tfName.getText();
            int bookId = getBookIdFromCode(coder);

            if (currObj == null) {

                if (!coder.isEmpty() && !no_of_copy.isEmpty() && !name.isEmpty() && !entireDate.isEmpty()) {
                    currObj = Utill_class.getMaxId("LMS_BOOK_COPY") + 1;
                    ret = st.executeUpdate("insert into lms_book_copy(id,lms_book_id,no_of_copy,entry_date,is_process) values(" + currObj + "," + bookId + "," + no_of_copy + ",'" + entireDate + "',false)");

                } else {
                    JOptionPane.showMessageDialog(this, "Empty field not allowed !");
                }

            } else {
                if (!no_of_copy.isEmpty() && !entireDate.isEmpty()) {

                    ret = st.executeUpdate("update LMS_BOOK_COPY set NO_OF_COPY=" + no_of_copy + " where id= " + currObj);

                } else {
                    JOptionPane.showMessageDialog(this, "No of coy or date field is empty field is empty !");
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
                whr = "and lower(CODE||NAME) like'%" + sch.trim().toLowerCase() + "%'";
            }

            ResultSet rs = st.executeQuery("select B.NAME,C.ENTRY_DATE,C.NO_OF_COPY,C.IS_PROCESS,C.ID FROM LMS_BOOK B,LMS_BOOK_COPY C WHERE B.ID=C.LMS_BOOK_ID " + whr + " order by C.ENTRY_DATE DESC, B.NAME ");

            DefaultListModel<Dual> model = new DefaultListModel();

            while (rs.next()) {

                int id = rs.getInt("ID");
                String display = rs.getString("ENTRY_DATE") + ":" + rs.getString("NAME") + "-" + rs.getString("NO_OF_COPY") + "(" + rs.getString("IS_PROCESS") + ")";
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

            ResultSet rs = st.executeQuery("select B.CODE,B.NAME,C.LMS_BOOK_ID,C.NO_OF_COPY,C.ID,C.IS_PROCESS from LMS_BOOK B, LMS_BOOK_COPY C where B.ID=C.LMS_BOOK_ID AND C.ID=" + id);
            if (rs.next()) {
                currObj = rs.getInt("ID");

                Utill_class.setImage(rs.getInt("LMS_BOOK_ID"), "LMS_MEMBER", lblMamberImage);

                tfCode.setText(rs.getString("CODE"));
                tfName.setText(rs.getString("NAME"));
                tfnumberofcopy.setText(rs.getString("NO_OF_COPY"));
                btnSaveOrUpdate.setText("Update");

                btngenarateCopy.setVisible(!rs.getBoolean("IS_PROCESS"));
                btnDelete.setVisible(!rs.getBoolean("IS_PROCESS"));
                btnSaveOrUpdate.setVisible(!rs.getBoolean("IS_PROCESS"));
                tfCode.enable(false);
                tfName.enable(false);
                tfdate.enable(false);
                tfnumberofcopy.enable(!rs.getBoolean("IS_PROCESS"));

            }
            rs.close();
            st.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }

    }

    private int getBookIdFromCode(String code) {
        int ret = 0;
        try {
            Statement st = DBConnUtill.getConn().createStatement();

            ResultSet rs = st.executeQuery("SELECT * from lms_book   where code='" + code + "'");

            if (rs.next()) {
                ret = rs.getInt("ID");
                tfName.setText(rs.getString("NAME"));
                Utill_class.setImage(ret, "LMS_MEMBER", lblMamberImage);
            }
            rs.close();
            st.close();

        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("err: " + e);
            tfName.setText("");
            Utill_class.setImage(-1, "LMS_MEMBER", lblMamberImage);
        }

        return ret;
    }

    private void genCopy() {
       
        int bookId = getBookIdFromCode(tfCode.getText());

        int ret = 0;
        try {
            Statement st = DBConnUtill.getConn().createStatement();

            ResultSet rs = st.executeQuery("SELECT count(*) CNT from LMS_BOOK_BARCODE where lms_book_id=" + bookId);

            if (rs.next()) {
                ret = rs.getInt("CNT");
            }
            rs.close();
            st.close();

        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("err: " + e);
        }

        ret++;

        int noCp = Integer.parseInt(tfnumberofcopy.getText());

        try {
            Statement st = DBConnUtill.getConn().createStatement();

            int cnt = 0;
            while (cnt < noCp) {

                int bcId = Utill_class.getMaxId("LMS_BOOK_BARCODE") + 1;

                String barcode = tfCode.getText() + Utill_class.lpad(ret, 3, "0");
                ret++;

                int retx = st.executeUpdate("insert into LMS_BOOK_BARCODE(id,barcode,lms_book_id,status,LMS_BOOK_COPY_ID) values(" + bcId + ",'" + barcode + "'," + bookId + ",'OK'," + currObj + ")");

                cnt++;
            }

            int retx = st.executeUpdate("update LMS_BOOK_COPY set is_process=true where id=" + currObj);

            st.close();

            loadAll(tfSearch.getText());
            btngenarateCopy.setVisible(false);

        } catch (Exception e) {
            System.out.println("err 3452: " + e);
        }

    }

}
