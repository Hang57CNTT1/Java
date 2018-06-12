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
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTable;
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
                ps = con.prepareStatement("INSERT INTO `khoahoc`(`TenKH`, `Time`) VALUES (?,?)");
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
  
static public void SuaKH(char operation,Integer id,String tenkh, Integer thoigiankh)
    {
           Connection con = DBConnect.MoKetNoi();
           java.sql.PreparedStatement ps ;
        
        
        //i 
        if(operation == 'u')
        {
            try {
                ps = con.prepareStatement("UPDATE `khoahoc` SET `TenKH`=?,`Time`=? WHERE `MaKH`= ?");
                ps.setString(1, tenkh);
                ps.setInt(2, thoigiankh);
                ps.setInt(3, id);
                if(ps.executeUpdate() > 0)
                {
                    JOptionPane.showMessageDialog(null, " Sửa Khóa Học Thành Công!");
                    con.close();
                }
            } catch (SQLException ex) {
                Logger.getLogger(KhoaHoc_DAL.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    static public void XoaKH(char operation,Integer id,String tenkh, Integer thoigiankh)
    {
           Connection con = DBConnect.MoKetNoi();
           java.sql.PreparedStatement ps ;
            if(operation == 'd')
           {
                int YESorNO = JOptionPane.showConfirmDialog(null, "Điểm của học viên có trong Khóa Học cũng sẽ bị xóa khỏi bảng","Xóa Khóa Học",JOptionPane.OK_CANCEL_OPTION,0);
                //  System.out.println(Integer.toString(YESorNO));
                if(YESorNO == JOptionPane.OK_OPTION){
               try {
                   ps = con.prepareStatement("DELETE FROM `khoahoc` WHERE `MaKH`= ?");
                   ps.setInt(1, id);
                   if(ps.executeUpdate() > 0)
                   {
                       JOptionPane.showMessageDialog(null, " Xóa Khóa Học Thành Công!");
                       con.close();
                   }
               } catch (SQLException ex) {
                   Logger.getLogger(KhoaHoc_DAL.class.getName()).log(Level.SEVERE, null, ex);
               }
                }
        }
    }
      public  boolean KiemTraTonTai(String tenkhoahoc)
      {
          boolean isexist = false;
          Connection con = DBConnect.MoKetNoi();
            java.sql.PreparedStatement ps ;
            try {
                //truy van mysql
                ps = con.prepareStatement("SELECT * FROM `khoahoc` WHERE `TenKH`= ?");
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
      public  void BangKhoaHoc(JTable table)
        {
            Connection con = DBConnect.MoKetNoi();
            java.sql.PreparedStatement ps ;
            try {
                //truy van mysql
                ps = con.prepareStatement("SELECT * FROM `khoahoc`");
                ResultSet rs = ps.executeQuery();
                //khai bao model
                DefaultTableModel model = (DefaultTableModel) table.getModel();
                Object[] row;
                //gan gia tri cho model 
                while(rs.next()){
                      row = new Object[3];
                      row[0] = rs.getInt(1);
                      row[1] = rs.getString(2);
                      row[2] = rs.getInt(3);
                      model.addRow(row);
                }
            } catch (SQLException ex) {
                Logger.getLogger(SinhVien_DAL.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
      public int LayMaKH(String laymakh)
            {
                int makh = 0;
                Connection con = DBConnect.MoKetNoi();
                  java.sql.PreparedStatement ps ;
                  try {
                      //truy van mysql
                      ps = con.prepareStatement("SELECT * FROM `khoahoc` WHERE `TenKH`= ?");
                      ps.setString(1,laymakh);
                      ResultSet rs = ps.executeQuery();

                      if(rs.next()){
                             makh = rs.getInt("MaKH");
                      }
                  } catch (SQLException ex) {
                      Logger.getLogger(SinhVien_DAL.class.getName()).log(Level.SEVERE, null, ex);
                  }
                  return makh;
            }
      public  void LoadComboKhoaHoc(JComboBox combo)
           {
              Connection con = DBConnect.MoKetNoi();
              java.sql.PreparedStatement ps ;
              try {
                  //truy van mysql
                  ps = con.prepareStatement("SELECT * FROM `khoahoc`");
                  ResultSet rs = ps.executeQuery();
                  Object[] row;
                  //gan gia tri cho model 
                  while(rs.next()){
                      //chọn đối tượng thứ 2 hiển thị
                       combo.addItem(rs.getString(2));
                  }
              } catch (SQLException ex) {
                  Logger.getLogger(SinhVien_DAL.class.getName()).log(Level.SEVERE, null, ex);
              }
          }
}
