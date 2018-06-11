/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Hang
 */
public class KhoaHoc_DAL {
      static public void ThemKH(char operation,Integer id,String tenkh, Integer thoigiankh)
    {
           Connection con = DBConnect.MoKetNoi();
           java.sql.PreparedStatement ps ;
        
        
        //i 
        if(operation == 'i')
        {
            try {
                ps = con.prepareStatement("INSERT INTO `khoahoc`(`Label`, `hours_number`) VALUES (?,?)");
                ps.setString(1, tenkh);
                ps.setInt(2, thoigiankh);
                if(ps.executeUpdate() > 0)
                {
                    JOptionPane.showMessageDialog(null, " Thêm Khóa Học Thành Công!");
                    con.close();
                }
            } catch (SQLException ex) {
                Logger.getLogger(KhoaHoc_DAL.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
  
//  static public void SuaSV(char operation,Integer id,String hosv, String tensv,
//                                    String gt,String ns, String phone, String diachi)
//    {
//           Connection con = DBConnect.MoKetNoi();
//           java.sql.PreparedStatement ps ;
//        
//        
//        //i 
//        if(operation == 'u')
//        {
//            try {
//                ps = con.prepareStatement("UPDATE `hocsinh` SET `HoHS`= ?,`TenHS`= ?,`GioiTinh`= ?,`NgaySinh`= ?,`Phone`= ?,`DiaChi`= ? WHERE MaHS = ?");
//                ps.setString(1, hosv);
//                ps.setString(2, tensv);
//                ps.setString(3, gt);
//                ps.setString(4, ns);
//                ps.setString(5, phone);
//                ps.setString(6, diachi);
//                ps.setInt(7, id);
//                if(ps.executeUpdate() > 0)
//                {
//                    JOptionPane.showMessageDialog(null, " Sửa Sinh Viên Thành Công!");
//                    con.close();
//                }
//            } catch (SQLException ex) {
//                Logger.getLogger(SinhVien_DAL.class.getName()).log(Level.SEVERE, null, ex);
//            }
//        }
//    }
//   static public void XoaSV(char operation,Integer id,String hosv, String tensv,
//                                    String gt,String ns, String phone, String diachi)
//    {
//           Connection con = DBConnect.MoKetNoi();
//           java.sql.PreparedStatement ps ;
//        
//        
//        //i 
//        if(operation == 'd')
//        {
//            try {
//                ps = con.prepareStatement("DELETE FROM `hocsinh` WHERE `MaHS` = ?");
//               ps.setInt(1, id);
//                if(ps.executeUpdate() > 0)
//                {
//                    JOptionPane.showMessageDialog(null, " Xóa Sinh Viên thành công!");
//                    con.close();
//                }
//            } catch (SQLException ex) {
//                Logger.getLogger(SinhVien_DAL.class.getName()).log(Level.SEVERE, null, ex);
//            }
//        }
//    }
      
      public  boolean KiemTraTonTai(String tenkhoahoc)
      {
          boolean isexist = false;
          Connection con = DBConnect.MoKetNoi();
            java.sql.PreparedStatement ps ;
            try {
                //truy van mysql
                ps = con.prepareStatement("SELECT * FROM `khoahoc` WHERE `Label`= ?");
                ps.setString(1,tenkhoahoc);
                ResultSet rs = ps.executeQuery();

                if(rs.next()){
                  isexist = true;
                }
            } catch (SQLException ex) {
                Logger.getLogger(SinhVien_DAL.class.getName()).log(Level.SEVERE, null, ex);
            }
                return isexist;
            }
}
