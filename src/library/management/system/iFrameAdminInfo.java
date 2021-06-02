/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package library.management.system;

import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.JRootPane;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import library.management.system.HelperClass.DBConnUtill;
import library.management.system.HelperClass.Dual;

/**
 *
 * @author RISAD'S_PC
 */
public class iFrameAdminInfo extends javax.swing.JInternalFrame {

    /**
     * Creates new form iFrameOparatorInfo
     */
    public iFrameAdminInfo() {
        initComponents();
        removedTitle();
        loadAll();
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
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        listModel = new javax.swing.JList<Dual>();
        tfPassword = new javax.swing.JPasswordField();
        tfUserName = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btnClear = new javax.swing.JButton();
        btnSaveorUpdate = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(780, 610));
        setRequestFocusEnabled(false);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 102));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Admin Information");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 20, 760, 50);
        jPanel1.add(jSeparator1);
        jSeparator1.setBounds(0, 70, 770, 10);

        listModel.setFont(new java.awt.Font("Tahoma", 3, 16)); // NOI18N
        listModel.setForeground(new java.awt.Color(102, 102, 0));
        listModel.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        listModel.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                listModelValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(listModel);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(30, 140, 280, 250);

        tfPassword.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        tfPassword.setForeground(new java.awt.Color(0, 0, 51));
        tfPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfPasswordActionPerformed(evt);
            }
        });
        jPanel1.add(tfPassword);
        tfPassword.setBounds(480, 260, 220, 31);

        tfUserName.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        tfUserName.setForeground(new java.awt.Color(0, 0, 51));
        tfUserName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfUserNameActionPerformed(evt);
            }
        });
        jPanel1.add(tfUserName);
        tfUserName.setBounds(480, 210, 220, 31);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 51, 51));
        jLabel2.setText("User Name :");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(350, 210, 123, 25);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 51, 51));
        jLabel4.setText("Password :");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(360, 260, 110, 25);

        btnClear.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        btnClear.setForeground(new java.awt.Color(0, 102, 0));
        btnClear.setText("Clear");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });
        jPanel1.add(btnClear);
        btnClear.setBounds(30, 500, 160, 33);

        btnSaveorUpdate.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        btnSaveorUpdate.setForeground(new java.awt.Color(0, 102, 0));
        btnSaveorUpdate.setText("Update");
        btnSaveorUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveorUpdateActionPerformed(evt);
            }
        });
        jPanel1.add(btnSaveorUpdate);
        btnSaveorUpdate.setBounds(530, 500, 160, 33);

        jLabel3.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 102, 102));
        jLabel3.setText("List of  admin");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(30, 114, 280, 30);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 770, 580);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void listModelValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_listModelValueChanged
         if (evt.getValueIsAdjusting()) {
            loadSingleObject(1);
        }
    }//GEN-LAST:event_listModelValueChanged

    private void tfPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfPasswordActionPerformed

    private void tfUserNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfUserNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfUserNameActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
      tfPassword.setText("");
      tfUserName.setText("");
    }//GEN-LAST:event_btnClearActionPerformed

    private void btnSaveorUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveorUpdateActionPerformed
        update(tfUserName.getText().toString().toLowerCase().trim(),new String(tfPassword.getPassword()));
    }//GEN-LAST:event_btnSaveorUpdateActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnSaveorUpdate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    public javax.swing.JList<Dual> listModel;
    private javax.swing.JPasswordField tfPassword;
    private javax.swing.JTextField tfUserName;
    // End of variables declaration//GEN-END:variables

    void loadAll(){
        try {
            Statement st=DBConnUtill.getConn().createStatement();
            
            ResultSet rs=st.executeQuery("Select * from LMS_ADMIN ");
            
             DefaultListModel<Dual> model = new DefaultListModel();

            while (rs.next()) {
                int id = rs.getInt("ID");
                String display = "USER_NAME:"+rs.getString("USER_NAME") + " && PASS: " + rs.getString("PASSWORD") ;
                model.addElement(new Dual(id, display));
            }
            listModel.setModel(model);
            
            
        } catch (Exception e) {
        }
    
    }

    private void loadSingleObject(int id) {
        try {
            Statement st=DBConnUtill.getConn().createStatement();
            
            ResultSet rs=st.executeQuery("SELECT * from LMS_ADMIN where id="+id);
            
            if(rs.next()){
            tfUserName.setText(rs.getString("USER_NAME"));
            tfPassword.setText(rs.getString("PASSWORD"));
            }
            
        } catch (Exception e) {
        }
    }
     void  update(String name,String pass){
         try {
             int ret=0;
             Statement st= DBConnUtill.getConn().createStatement();
             if(!name.isEmpty()&&!pass.isEmpty()){
             ret = st.executeUpdate("update LMS_ADMIN set USER_NAME='" + name + "' , PASSWORD='" + pass + "' where id= " + 1);
             
             if(ret==1){
                 JOptionPane.showMessageDialog(this, "Successfully Update ..");
                 tfUserName.setText("");
                 tfPassword.setText("");
                 loadAll();
             }
             }else{
                 JOptionPane.showMessageDialog(this, "Empty Fields not allowed..");
             
             }
         } catch (Exception e) {
         }
         
    }
     
     public void delete( Integer currObj,  String tabName) {
        int ret = 0;
        try {
            Statement st = DBConnUtill.getConn().createStatement();

            if (currObj != null) {
                ret = st.executeUpdate("delete from " + tabName + " where id= " + currObj);
            }
            if(ret==1){
                JOptionPane.showMessageDialog(this, "successfully deleted.. ");
                loadAll();
            }

            st.close();
        } catch (Exception e) {
            e.printStackTrace();
           }

        
    }


}
