
package DAL;

import com.mysql.jdbc.PreparedStatement;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Hang
 */
public class SinhVien_DAL {
  static public void ThemSV(char operation,Integer id,String hosv, String tensv,
                                    String gt,String ns, String phone, String diachi)
    {
        Connection con = DBConnect.MoKetNoi();
            
        
        
        //i 
        if(operation == 'i')
        {
            try {
              //  StringBuffer query = new StringBuffer();
                //query.append("");
                
                String sql = "INSERT INTO hocsinh(MaHS, HoHS, TenHS, GioiTinh, NgaySinh, Phone, DiaChi) VALUES (?,?,?,?,?,?,?)";
                java.sql.PreparedStatement ps = con.prepareStatement(sql.toString());
               // ps.executeQuery();
                ps.setString(1, hosv);
                ps.setString(2, tensv);
                ps.setString(3, gt);
                ps.setString(4, ns);
                ps.setString(5, phone);
                ps.setString(6, diachi);
                con.close();
                if(ps.executeUpdate() > 0)
                {
                    JOptionPane.showMessageDialog(null, " Thêm thành công!");
                    con.close();
                }
            } catch (SQLException ex) {
                Logger.getLogger(SinhVien_DAL.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(null, " Lỗi!");
            }
        }
    }
}
