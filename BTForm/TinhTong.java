
public class TinhTong extends javax.swing.JFrame {

    public TinhTong() {
           setSize(400,500);
           initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtSTN = new javax.swing.JTextField();
        txtSTH = new javax.swing.JTextField();
        txtKetQua = new javax.swing.JTextField();
        btnTong = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tổng 2 số nguyên");
        setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel1.setText("Tính tổng hai số nguyên");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 20, -1, 28));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel2.setText("Số nguyên thứ nhất:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, -1, -1));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel3.setText("Số nguyên thứ hai:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, -1, -1));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel4.setText("Kết quả: ");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, -1, -1));

        txtSTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSTNActionPerformed(evt);
            }
        });
        getContentPane().add(txtSTN, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 80, 130, -1));
        getContentPane().add(txtSTH, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 130, 130, -1));

        txtKetQua.setEnabled(false);
        getContentPane().add(txtKetQua, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 170, 130, 30));

        btnTong.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        btnTong.setText("Tổng");
        btnTong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTongActionPerformed(evt);
            }
        });
        getContentPane().add(btnTong, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 230, 90, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtSTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSTNActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSTNActionPerformed

    private void btnTongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTongActionPerformed
        // TODO add your handling code here:
        int a = Integer.parseInt(txtSTN.getText());
        int b = Integer.parseInt(txtSTH.getText());
        int tong = a + b ;
        txtKetQua.setText(String.valueOf(tong));
    }//GEN-LAST:event_btnTongActionPerformed

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
            java.util.logging.Logger.getLogger(TinhTong.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TinhTong.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TinhTong.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TinhTong.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
              
                new TinhTong().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnTong;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField txtKetQua;
    private javax.swing.JTextField txtSTH;
    private javax.swing.JTextField txtSTN;
    // End of variables declaration//GEN-END:variables
}
