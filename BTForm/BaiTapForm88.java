
import java.util.Vector;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Hang
 */
public class BaiTapForm88 extends javax.swing.JFrame {

    /**
     * Creates new form JTable
     */
    public BaiTapForm88() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        Years = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtFirstName = new javax.swing.JTextField();
        txtLastName = new javax.swing.JTextField();
        txtYears = new javax.swing.JTextField();
        btnAdd = new javax.swing.JButton();
        btnReMove = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtableDS = new javax.swing.JTable();
        btnSua = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("FirstName");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(56, 28, -1, -1));

        Years.setText("Years");
        getContentPane().add(Years, new org.netbeans.lib.awtextra.AbsoluteConstraints(56, 75, -1, -1));

        jLabel3.setText("LastName");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(287, 28, -1, -1));
        getContentPane().add(txtFirstName, new org.netbeans.lib.awtextra.AbsoluteConstraints(131, 25, 130, -1));
        getContentPane().add(txtLastName, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 20, 140, -1));

        txtYears.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtYearsActionPerformed(evt);
            }
        });
        getContentPane().add(txtYears, new org.netbeans.lib.awtextra.AbsoluteConstraints(131, 72, 130, -1));

        btnAdd.setText("Add Philosopher");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });
        getContentPane().add(btnAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 130, 140, -1));

        btnReMove.setText("Remove Selected Philosopher");
        btnReMove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReMoveActionPerformed(evt);
            }
        });
        getContentPane().add(btnReMove, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 130, 180, -1));

        jtableDS.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"Plato", "cvdfgfd", "428-347B.C"}
            },
            new String [] {
                "FirstName", "LastName", "Years"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jtableDS.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtableDSMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jtableDS);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 170, 550, 130));

        btnSua.setText("Edit");
        btnSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaActionPerformed(evt);
            }
        });
        getContentPane().add(btnSua, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 130, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtYearsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtYearsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtYearsActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        // TODO add your handling code here:
        //Lấy về model
        TableModel mData = jtableDS.getModel();
        //2. Chuyển sang kiểu vector cho dễ thao tác
        Vector<Vector<String>> data = new Vector<>();
        //đổ dữ liệu từ mData ->data
        int soHang = mData.getRowCount();
        int soCot = mData.getColumnCount();
        for(int i=0;i<soHang;i++)
        {
            Vector<String> hang = new Vector<>();
            for(int j =0;j<soCot;j++){
                //Kiểm tra giá trị null 
                if(mData.getValueAt(i, j) !=null)
                        {
                             hang.add(mData.getValueAt(i, j).toString());                     
                            
                        }             
            }
            data.add(hang);
        }
        //hàng mới
        Vector<String> hangmoi = new Vector<>();
        hangmoi.add(txtFirstName.getText());
        hangmoi.add(txtLastName.getText());
        hangmoi.add(txtYears.getText());
        
        //Thêm vào danh sách hàng
        data.add(hangmoi);
        
        //3. Cập nhật lại table(hiển thị lên Table)
        DefaultTableModel model = new DefaultTableModel();
        model.setColumnCount(soCot);
        //Tính toán model
        
        for(int i =0;i<data.size();i++)
        {
            Vector<String> rowData = data.get(i);
            model.addRow(rowData);
        }
        //Cập nhật
        jtableDS.setModel(model);
        
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnReMoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReMoveActionPerformed
        // TODO add your handling code here:
        //1. Lấy về model
        TableModel mData = jtableDS.getModel();
        //2. Ép kiểu DefaultTableModel để xử lí
        DefaultTableModel bang = new DefaultTableModel();
        //Tính số cột,số hàng
        int soCot = mData.getColumnCount();
        int soHang = mData.getRowCount();
        bang.setColumnCount(soCot);
        
        //Đổ dữ liệu từ tableModel -> Default...
        for(int i=0;i<soHang;i++)
        {
            Vector<String> hang = new Vector<>();
            for(int j=0;j<soCot;j++)
                hang.add(mData.getValueAt(i, j).toString());
           bang.addRow(hang);
        }
        
        ///3. Xử lý xóa
        //Lấy hàng chọn trên điều khiển JTable
        int h =jtableDS.getSelectedRow();
        //Xóa khỏi model
        bang.removeRow(h);
        //Cập nhật
        jtableDS.setModel(bang);
        
    }//GEN-LAST:event_btnReMoveActionPerformed

    private void jtableDSMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtableDSMouseClicked
        // TODO add your handling code here:
        //Lấy về Model
        TableModel mData = jtableDS.getModel();
        //Lấy dòng đc chọn
        int chon = jtableDS.getSelectedRow();
        txtFirstName.setText(mData.getValueAt(chon, 0).toString());
        txtLastName.setText(mData.getValueAt(chon, 1).toString());
        txtYears.setText(mData.getValueAt(chon, 2).toString());
    }//GEN-LAST:event_jtableDSMouseClicked

    private void btnSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaActionPerformed
        // TODO add your handling code here:
         TableModel mData = jtableDS.getModel();
        //Lấy dòng đc chọn để sửa
        int chonSua = jtableDS.getSelectedRow();
        
        //Cập nhật FirstName
        mData.setValueAt(txtFirstName.getText(), chonSua, 0);
          //Cập nhật LastName
        mData.setValueAt(txtLastName.getText(), chonSua, 1);
          //Cập nhật Years
        mData.setValueAt(txtYears.getText(), chonSua, 2);
    }//GEN-LAST:event_btnSuaActionPerformed

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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BaiTapForm88.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new BaiTapForm88().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Years;
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnReMove;
    private javax.swing.JButton btnSua;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jtableDS;
    private javax.swing.JTextField txtFirstName;
    private javax.swing.JTextField txtLastName;
    private javax.swing.JTextField txtYears;
    // End of variables declaration//GEN-END:variables
}