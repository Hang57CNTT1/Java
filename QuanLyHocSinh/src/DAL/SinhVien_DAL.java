
package DAL;

import com.mysql.jdbc.PreparedStatement;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import GUI.SinhVien_GUI;
import java.sql.ResultSet;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Hang
 */
public class SinhVien_DAL {

//    private static boolean txtUser;
//    private static boolean txtHoSV;
  static public void ThemSV(char operation,Integer id,String hosv, String tensv,
                                    String gt,String ns, String phone, String diachi)
    {
           Connection con = DBConnect.MoKetNoi();
           java.sql.PreparedStatement ps ;
        
        
        //i 
        if(operation == 'i')
        {
            try {
                ps = con.prepareStatement("INSERT INTO `hocvien`( `HoHV`, `TenHV`, `GioiTinh`, `NgaySinh`, `Phone`, `DiaChi`) VALUES (?,?,?,?,?,?)");
                ps.setString(1, hosv);
                ps.setString(2, tensv);
                ps.setString(3, gt);
                ps.setString(4, ns);
                ps.setString(5, phone);
                ps.setString(6, diachi);
                if(ps.executeUpdate() > 0)
                {
                    JOptionPane.showMessageDialog(null, " Thêm Sinh Viên Thành Công!");
                    con.close();
                }
            } catch (SQLException ex) {
                Logger.getLogger(SinhVien_DAL.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(null, " Lỗi!");
            }
        }
    }
  
  static public void SuaSV(char operation,Integer id,String hosv, String tensv,
                                    String gt,String ns, String phone, String diachi)
    {
           Connection con = DBConnect.MoKetNoi();
           java.sql.PreparedStatement ps ;
        
        
        //i 
        if(operation == 'u')
        {
            try {
                ps = con.prepareStatement("UPDATE `hocvien` SET `HoHV`= ?,`TenHV`= ?,`GioiTinh`= ?,`NgaySinh`= ?,`Phone`= ?,`DiaChi`= ? WHERE MaHV = ?");
                ps.setString(1, hosv);
                ps.setString(2, tensv);
                ps.setString(3, gt);
                ps.setString(4, ns);
                ps.setString(5, phone);
                ps.setString(6, diachi);
                ps.setInt(7, id);
                if(ps.executeUpdate() > 0)
                {
                    JOptionPane.showMessageDialog(null, " Sửa Sinh Viên Thành Công!");
                    con.close();
                }
            } catch (SQLException ex) {
                Logger.getLogger(SinhVien_DAL.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
   static public void XoaSV(char operation,Integer id,String hosv, String tensv,
                                    String gt,String ns, String phone, String diachi)
    {
           Connection con = DBConnect.MoKetNoi();
           java.sql.PreparedStatement ps ;
        //Thêm ràng buộc với bảng điểm
           
        //i 
            if(operation == 'd')
            {
                 int YESorNO = JOptionPane.showConfirmDialog(null, "Điểm của học viên cũng sẽ bị xóa khỏi bảng","Xóa Học Viên",JOptionPane.OK_CANCEL_OPTION,0);
                //  System.out.println(Integer.toString(YESorNO));
                if(YESorNO == JOptionPane.OK_OPTION){
                    try {
                    ps = con.prepareStatement("DELETE FROM `hocvien` WHERE `MaHV` = ?");
                   ps.setInt(1, id);
                    if(ps.executeUpdate() > 0)
                    {
                        JOptionPane.showMessageDialog(null, " Xóa Sinh Viên thành công!");
                        con.close();
                    }
                } catch (SQLException ex) {
                    Logger.getLogger(SinhVien_DAL.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }
  public  void BangSinhVien(JTable table,String valueToSearch)
  {
      Connection con = DBConnect.MoKetNoi();
      java.sql.PreparedStatement ps ;
      try {
          //truy van mysql
          ps = con.prepareStatement("SELECT * FROM hocvien WHERE CONCAT(HoHV,TenHV,Phone,DiaChi) LIKE ?");
          ps.setString(1, "%"+valueToSearch+"%");
          
          ResultSet rs = ps.executeQuery();
          //khai bao model
          DefaultTableModel model = (DefaultTableModel) table.getModel();
          Object[] row;
          //gan gia tri cho model 
          while(rs.next()){
                row = new Object[7];
                row[0] = rs.getInt(1);
                row[1] = rs.getString(2);
                row[2] = rs.getString(3);
                row[3] = rs.getString(4);
                row[4] = rs.getString(5);
                row[5] = rs.getString(6);
                row[6] = rs.getString(7);
                
                model.addRow(row);
          }
      } catch (SQLException ex) {
          Logger.getLogger(SinhVien_DAL.class.getName()).log(Level.SEVERE, null, ex);
      }
  }
 
}
