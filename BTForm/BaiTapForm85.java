
import java.util.ArrayList;
import javax.swing.ListModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Hang
 */
public class BaiTapForm85 extends javax.swing.JFrame {

    /**
     * Creates new form BaiTapForm85
     */
    public BaiTapForm85() {
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

        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jSplitPane2 = new javax.swing.JSplitPane();
        panelsum = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtInput = new javax.swing.JTextField();
        btnAdd = new javax.swing.JButton();
        btnXoa = new javax.swing.JButton();
        btnThoat = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        listName = new javax.swing.JList<>();

        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(jList1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panelsum.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Input Name:");
        panelsum.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 13, -1, -1));
        panelsum.add(txtInput, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 10, 190, -1));

        btnAdd.setText("Add");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });
        panelsum.add(btnAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 60, 70, -1));

        btnXoa.setText("Remove");
        panelsum.add(btnXoa, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 60, -1, -1));

        btnThoat.setText("Edit");
        panelsum.add(btnThoat, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 60, 60, -1));

        jSplitPane2.setRightComponent(panelsum);

        listName.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane2.setViewportView(listName);

        jSplitPane2.setLeftComponent(jScrollPane2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jSplitPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 433, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane2)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        // TODO add your handling code here:
        //Lấy về model
        ListModel dsTen = listName.getModel();
        //từ model sang mảng
//        int i;
//        String[] mten =  new String[dsTen.getSize()+1];
//        for( i =0; i<dsTen.getSize(); i++)
//            mten[i] =dsTen.getElementAt(i).toString();
//        //thêm vào cuối
//        mten[i ] = txtInput.getText();
//        //Cập nhật JList
            //Dùng arraylist
        ArrayList<String> arrTen = new ArrayList<>();
        int i=0;
        for(i=0;i<dsTen.getSize();i++)
        {   String ten = dsTen.getElementAt(i).toString();
            arrTen.add(ten);
        }
        arrTen.add(txtInput.getText());
        //Chuyển sang kiểu mảng để đưa vào JList
        Object[] mten =arrTen.toArray();
        listName.setListData((String[]) ( mten));
    }//GEN-LAST:event_btnAddActionPerformed

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
            java.util.logging.Logger.getLogger(BaiTapForm85.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BaiTapForm85.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BaiTapForm85.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BaiTapForm85.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BaiTapForm85().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnThoat;
    private javax.swing.JButton btnXoa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JList<String> jList1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSplitPane jSplitPane2;
    private javax.swing.JList<String> listName;
    private javax.swing.JPanel panelsum;
    private javax.swing.JTextField txtInput;
    // End of variables declaration//GEN-END:variables
}
