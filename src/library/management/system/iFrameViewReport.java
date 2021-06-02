package library.management.system;

import java.awt.Desktop;
import java.io.File;
import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JRootPane;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import library.management.system.HelperClass.DBConnUtill;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;

public class iFrameViewReport extends javax.swing.JInternalFrame {

    public iFrameViewReport() {
        initComponents();
        removedTitle();
        date.setText(LocalDate.now().toString());

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
        jLabel8 = new javax.swing.JLabel();
        btnReset = new javax.swing.JButton();
        btnSaveOrUpdate = new javax.swing.JButton();
        lblBarcodeType = new javax.swing.JLabel();
        date = new javax.swing.JLabel();
        comboBarcodeType = new javax.swing.JComboBox<String>();
        jLabel12 = new javax.swing.JLabel();
        comboType1 = new javax.swing.JComboBox();

        setPreferredSize(new java.awt.Dimension(770, 580));

        jPanel1.setBackground(new java.awt.Color(127, 204, 204));
        jPanel1.setLayout(null);

        jLabel3.setBackground(new java.awt.Color(0, 51, 51));
        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 30)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 51, 51));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("View Report form !");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(4, 4, 750, 50);
        jPanel1.add(jSeparator1);
        jSeparator1.setBounds(0, 50, 760, 20);

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
        btnReset.setBounds(80, 410, 150, 40);

        btnSaveOrUpdate.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnSaveOrUpdate.setForeground(new java.awt.Color(153, 0, 0));
        btnSaveOrUpdate.setText("Open ");
        btnSaveOrUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveOrUpdateActionPerformed(evt);
            }
        });
        jPanel1.add(btnSaveOrUpdate);
        btnSaveOrUpdate.setBounds(420, 400, 200, 40);

        lblBarcodeType.setBackground(new java.awt.Color(153, 153, 153));
        lblBarcodeType.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblBarcodeType.setForeground(new java.awt.Color(0, 51, 102));
        lblBarcodeType.setText("Select Book Type :");
        jPanel1.add(lblBarcodeType);
        lblBarcodeType.setBounds(140, 260, 180, 30);

        date.setBackground(new java.awt.Color(153, 153, 153));
        date.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        date.setForeground(new java.awt.Color(0, 51, 102));
        date.setText("20/10/1998");
        jPanel1.add(date);
        date.setBounds(550, 60, 160, 30);

        comboBarcodeType.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        comboBarcodeType.setForeground(new java.awt.Color(0, 51, 102));
        jPanel1.add(comboBarcodeType);
        comboBarcodeType.setBounds(350, 260, 310, 30);

        jLabel12.setBackground(new java.awt.Color(153, 153, 153));
        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 51, 102));
        jLabel12.setText("Select Type :");
        jPanel1.add(jLabel12);
        jLabel12.setBounds(210, 180, 120, 30);

        comboType1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        comboType1.setForeground(new java.awt.Color(0, 51, 102));
        comboType1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Book Barcode ", "Member List", "Member Id" }));
        jPanel1.add(comboType1);
        comboType1.setBounds(350, 180, 190, 30);

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

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed


    }//GEN-LAST:event_btnResetActionPerformed

    private void btnSaveOrUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveOrUpdateActionPerformed
        String ss = "";
        String rr = "";
        if (comboBarcodeType.getSelectedIndex() == 0) {
            ss = "LMS_BOOK_BARCODE.jasper";
            rr = LocalDate.now().toString() + "(" + "Barcode" + ")";
        } else if (comboBarcodeType.getSelectedIndex() == 1) {
            ss = "LMS_MEMBER_LIST.jasper";
            rr=LocalDate.now().toString()+"("+"Member_List"+")";

        } else if (comboBarcodeType.getSelectedIndex() == 2) {
            ss = "LMS_MEMBER_ID.jasper";
            rr=LocalDate.now().toString()+"("+"Member_ID"+")";
        } else {
            JOptionPane.showMessageDialog(this, "Please ! Select Report Type.");
        }

        //
        if (!ss.isEmpty()) {
            openAndSavePDF(ss,rr);
        } else {
            JOptionPane.showMessageDialog(this, "Please ! Select Report Type.");
        }
    }//GEN-LAST:event_btnSaveOrUpdateActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnReset;
    private javax.swing.JButton btnSaveOrUpdate;
    private javax.swing.JComboBox<String> comboBarcodeType;
    private javax.swing.JComboBox comboType1;
    private javax.swing.JLabel date;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblBarcodeType;
    // End of variables declaration//GEN-END:variables

    private void openAndSavePDF(String ss,String rr) {
        Map hm = new HashMap();
        String jasperFileName = "LMS_IMAGE\\LMS_REPORT\\" + ss;
        try {
            JasperPrint jasperPrint = (JasperPrint) JasperFillManager.fillReport(jasperFileName, hm, DBConnUtill.getConn());
            JasperExportManager.exportReportToPdfFile(jasperPrint, "D:\\"+rr+".pdf");
            File myFile = new File( "D:\\"+rr+".pdf");
            Desktop.getDesktop().open(myFile);

        } catch (Exception ex) {
            Logger.getLogger(iFrameViewReport.class.getName()).log(Level.SEVERE, null, ex);
             Logger.getLogger(iFrameViewReport.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
