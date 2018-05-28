/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

/**
 *
 * @author Hang
 */
public class Home_GUI extends javax.swing.JFrame {

    /**
     * Creates new form Home_GUI
     */
    public Home_GUI() {
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

        jPanel1 = new javax.swing.JPanel();
        jMenuBar1 = new javax.swing.JMenuBar();
        menuDanhmuc = new javax.swing.JMenu();
        menuKhachhang = new javax.swing.JMenu();
        menuHanghoa = new javax.swing.JMenu();
        menuNhanvien = new javax.swing.JMenu();
        menuChatlieu = new javax.swing.JMenu();
        menuHoadon = new javax.swing.JMenu();
        jMenu5 = new javax.swing.JMenu();
        menuTimkiem = new javax.swing.JMenu();
        nenuTimHD = new javax.swing.JMenu();
        menuTimKH = new javax.swing.JMenu();
        menuTimhang = new javax.swing.JMenu();
        menuBaocao = new javax.swing.JMenu();
        menuHangton = new javax.swing.JMenu();
        menuDoanhthu = new javax.swing.JMenu();
        menuTrogiupngay = new javax.swing.JMenu();
        jMenu11 = new javax.swing.JMenu();
        menuGioithieu = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Home_Quản lý bán hàng");

        jPanel1.setBackground(new java.awt.Color(0, 255, 204));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 443, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 246, Short.MAX_VALUE)
        );

        menuDanhmuc.setBackground(new java.awt.Color(0, 204, 102));
        menuDanhmuc.setForeground(new java.awt.Color(255, 102, 204));
        menuDanhmuc.setText("Danh Mục ");
        menuDanhmuc.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N

        menuKhachhang.setBackground(new java.awt.Color(255, 153, 153));
        menuKhachhang.setForeground(new java.awt.Color(102, 51, 255));
        menuKhachhang.setText("Khách hàng ");
        menuKhachhang.setFont(new java.awt.Font("Times New Roman", 1, 17)); // NOI18N
        menuKhachhang.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                menuKhachhangKeyTyped(evt);
            }
        });
        menuDanhmuc.add(menuKhachhang);

        menuHanghoa.setBackground(new java.awt.Color(255, 153, 153));
        menuHanghoa.setForeground(new java.awt.Color(102, 51, 255));
        menuHanghoa.setText("Hàng hóa");
        menuHanghoa.setFont(new java.awt.Font("Times New Roman", 1, 17)); // NOI18N
        menuDanhmuc.add(menuHanghoa);

        menuNhanvien.setBackground(new java.awt.Color(255, 153, 153));
        menuNhanvien.setForeground(new java.awt.Color(102, 51, 255));
        menuNhanvien.setText("Nhân viên");
        menuNhanvien.setFont(new java.awt.Font("Times New Roman", 1, 17)); // NOI18N
        menuDanhmuc.add(menuNhanvien);

        menuChatlieu.setBackground(new java.awt.Color(255, 153, 153));
        menuChatlieu.setForeground(new java.awt.Color(102, 51, 255));
        menuChatlieu.setText("Chất liệu");
        menuChatlieu.setFont(new java.awt.Font("Times New Roman", 1, 17)); // NOI18N
        menuDanhmuc.add(menuChatlieu);

        jMenuBar1.add(menuDanhmuc);

        menuHoadon.setBackground(new java.awt.Color(0, 204, 102));
        menuHoadon.setForeground(new java.awt.Color(255, 102, 204));
        menuHoadon.setText("Hóa Đơn");
        menuHoadon.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N

        jMenu5.setForeground(new java.awt.Color(102, 51, 255));
        jMenu5.setText("Hóa đơn bán");
        jMenu5.setFont(new java.awt.Font("Times New Roman", 1, 17)); // NOI18N
        menuHoadon.add(jMenu5);

        jMenuBar1.add(menuHoadon);

        menuTimkiem.setBackground(new java.awt.Color(0, 204, 102));
        menuTimkiem.setForeground(new java.awt.Color(255, 102, 204));
        menuTimkiem.setText("Tìm kiếm");
        menuTimkiem.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N

        nenuTimHD.setForeground(new java.awt.Color(153, 51, 255));
        nenuTimHD.setText("Tìm hóa đơn");
        nenuTimHD.setFont(new java.awt.Font("Times New Roman", 1, 17)); // NOI18N
        menuTimkiem.add(nenuTimHD);

        menuTimKH.setForeground(new java.awt.Color(153, 51, 255));
        menuTimKH.setText("Tìm Khách hàng");
        menuTimKH.setFont(new java.awt.Font("Times New Roman", 1, 17)); // NOI18N
        menuTimkiem.add(menuTimKH);

        menuTimhang.setForeground(new java.awt.Color(153, 51, 255));
        menuTimhang.setText("Tìm hàng");
        menuTimhang.setFont(new java.awt.Font("Times New Roman", 1, 17)); // NOI18N
        menuTimkiem.add(menuTimhang);

        jMenuBar1.add(menuTimkiem);

        menuBaocao.setBackground(new java.awt.Color(0, 204, 102));
        menuBaocao.setForeground(new java.awt.Color(255, 102, 204));
        menuBaocao.setText("Báo cáo");
        menuBaocao.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N

        menuHangton.setForeground(new java.awt.Color(153, 51, 255));
        menuHangton.setText("Hàng tồn");
        menuHangton.setFont(new java.awt.Font("Times New Roman", 1, 17)); // NOI18N
        menuBaocao.add(menuHangton);

        menuDoanhthu.setForeground(new java.awt.Color(153, 51, 255));
        menuDoanhthu.setText("Doanh Thu");
        menuDoanhthu.setFont(new java.awt.Font("Times New Roman", 1, 17)); // NOI18N
        menuBaocao.add(menuDoanhthu);

        jMenuBar1.add(menuBaocao);

        menuTrogiupngay.setBackground(new java.awt.Color(0, 204, 102));
        menuTrogiupngay.setForeground(new java.awt.Color(255, 102, 204));
        menuTrogiupngay.setText("Trợ giúp");
        menuTrogiupngay.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N

        jMenu11.setForeground(new java.awt.Color(153, 51, 255));
        jMenu11.setText("Trơ giúp ngay");
        jMenu11.setFont(new java.awt.Font("Times New Roman", 1, 17)); // NOI18N
        menuTrogiupngay.add(jMenu11);

        menuGioithieu.setForeground(new java.awt.Color(153, 51, 255));
        menuGioithieu.setText("Giới thiệu");
        menuGioithieu.setFont(new java.awt.Font("Times New Roman", 1, 17)); // NOI18N
        menuTrogiupngay.add(menuGioithieu);

        jMenuBar1.add(menuTrogiupngay);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menuKhachhangKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_menuKhachhangKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_menuKhachhangKeyTyped

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
            java.util.logging.Logger.getLogger(Home_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home_GUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu11;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JMenu menuBaocao;
    private javax.swing.JMenu menuChatlieu;
    private javax.swing.JMenu menuDanhmuc;
    private javax.swing.JMenu menuDoanhthu;
    private javax.swing.JMenu menuGioithieu;
    private javax.swing.JMenu menuHanghoa;
    private javax.swing.JMenu menuHangton;
    private javax.swing.JMenu menuHoadon;
    private javax.swing.JMenu menuKhachhang;
    private javax.swing.JMenu menuNhanvien;
    private javax.swing.JMenu menuTimKH;
    private javax.swing.JMenu menuTimhang;
    private javax.swing.JMenu menuTimkiem;
    private javax.swing.JMenu menuTrogiupngay;
    private javax.swing.JMenu nenuTimHD;
    // End of variables declaration//GEN-END:variables
}
