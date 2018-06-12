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
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Hang
 */
public class Diem_DAL {
         static public void ThemDiem(char operation,Integer mahv,Integer  makh,double diemhv,String ghichu)
    {
           Connection con = DBConnect.MoKetNoi();
           java.sql.PreparedStatement ps ;
        
        
        //i 
        if(operation == 'i')
        {
            try {
                ps = con.prepareStatement("INSERT INTO `diem`(`MaHV_ID`,`MaKH_ID`, `Diem`, `Ghi Chu`) VALUES (?,?,?,?)");
                ps.setInt(1, mahv);
                ps.setInt(2, makh);
                ps.setDouble(3, diemhv);
                ps.setString(4, ghichu);
                if(ps.executeUpdate() > 0)
                {
                    JOptionPane.showMessageDialog(null, " Thêm Điểm Thành Công!");
                    con.close();
                }
            } catch (SQLException ex) {
                Logger.getLogger(KhoaHoc_DAL.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
  
static public void SuaDiem(char operation,Integer mahv,Integer  makh,Double diemhv,String ghichu)
        {
              Connection con = DBConnect.MoKetNoi();
               java.sql.PreparedStatement ps ;


            //i 
            if(operation == 'u')
            {
                try {
                    ps = con.prepareStatement("UPDATE `diem` SET `Diem`= ?,`Ghi Chu`=? WHERE `MaHV_ID` = ?  AND `MaKH_ID` = ?");
                    ps.setDouble(1, diemhv);
                    ps.setString(2, ghichu);
                    ps.setInt(3, mahv);
                    ps.setInt(4, makh);
                    if(ps.executeUpdate() > 0)
                    {
                        JOptionPane.showMessageDialog(null, " Sửa Điểm Thành Công!");
                        con.close();
                    }
                } catch (SQLException ex) {
                    Logger.getLogger(KhoaHoc_DAL.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
    }
    static public void XoaDiem(char operation,Integer mahv,Integer  makh,Double diemhv,String ghichu)
    {
           Connection con = DBConnect.MoKetNoi();
           java.sql.PreparedStatement ps ;
        
        
        //i 
        if(operation == 'd')
        {
            try {
                ps = con.prepareStatement("DELETE FROM `diem` WHERE `MaHV_ID`=? AND `MaKH_ID`= ?");
                ps.setInt(1, mahv);
                ps.setInt(2, makh);
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
    
    public  void BangDiem(JTable table)
        {
            Connection con = DBConnect.MoKetNoi();
            java.sql.PreparedStatement ps ;
            try {
                //truy van mysql
                ps = con.prepareStatement("SELECT * FROM `diem`");
                ResultSet rs = ps.executeQuery();
                //khai bao model
                DefaultTableModel model = (DefaultTableModel) table.getModel();
                Object[] row;
                //gan gia tri cho model 
                while(rs.next()){
                      row = new Object[4];
                      row[0] = rs.getInt(1);
                      row[1] = rs.getInt(2);
                      row[2] = rs.getDouble(3);
                      row[3] = rs.getString(4);
                      model.addRow(row);
                }
            } catch (SQLException ex) {
                Logger.getLogger(SinhVien_DAL.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
}
