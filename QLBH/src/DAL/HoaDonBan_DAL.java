/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

import DTO.HDBan_DTO;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author Hang
 */
public class HoaDonBan_DAL {
    public static ArrayList<HDBan_DTO> getAll(){
        Connection con = DBConnect.MoKetNoi();
        if(con != null){
            try{
                Statement stmt = con.createStatement();
                String sql = "select * from HOADONBAN";
                ResultSet rs = stmt.executeQuery(sql);
                ArrayList<HDBan_DTO> ds = new ArrayList<>();
                while(true){
                    if(!rs.next()) break;
                    String MaHDBan = rs.getString("MAHD");
                    String MaNhanVien = rs.getString("MANV");
                    String NgayBan = rs.getString("NGAYBAN");
                    String MaKhach = rs.getString("MAKH");
                    float TongTien = rs.getFloat("TONGTIEN");
                    HDBan_DTO hoaDon = new HDBan_DTO(MaHDBan, MaNhanVien, NgayBan, MaKhach, TongTien);
                    ds.add(hoaDon);
                }
                con.close();
                return ds;
            }catch(SQLException ex){
                return null;
            }
        }
        return null;
    }
    
    public static ArrayList<HDBan_DTO> findHD( String MaHDB, String MaNV,String MaKH ){
        Connection con = DBConnect.MoKetNoi();
        if(con != null){
            try{
                Statement stmt = con.createStatement();
                String sql = "select * from HOADONBAN where MAHD = '"+ MaHDB +"' or MANV ='"+ MaNV +"' or MAKH = '"+ MaKH +"'";
                ResultSet rs = stmt.executeQuery(sql);
                ArrayList<HDBan_DTO> ds = new ArrayList<>();
                while(true){
                    if(!rs.next()) break;
                    String MaHDBan = rs.getString("MAHD");
                    String MaNhanVien = rs.getString("MANV");
                    String NgayBan = rs.getString("NGAYBAN");
                    String MaKhach = rs.getString("MAKH");
                    float TongTien = rs.getFloat("TONGTIEN");
                    HDBan_DTO hoaDon = new HDBan_DTO(MaHDBan, MaNhanVien, NgayBan, MaKhach, TongTien);
                    ds.add(hoaDon);
                }
                con.close();
                return ds;
            }catch(SQLException ex){
                return null;
            }
        }
        return null;
    }
    
    public static int Insert(String MaHDBan, String MaNhanVien, String NgayBan,String MaKhach,float TongTien){
        Connection con = DBConnect.MoKetNoi();
        if(con != null){
            try{
               Statement stmt = con.createStatement();
               String sql = "insert into HOADONBAN values ('"+ MaHDBan +"','"+ MaNhanVien +"','"+ NgayBan +"','"+ MaKhach +"',"+ TongTien +")";
               int rs = stmt.executeUpdate(sql);
               if(rs < 1){
                   con.close();
                   return 0;
               } else {
                   con.close();
                   return 1;
               }
            } catch (SQLException ex){
                return 0;
            }
        }
        return 0;
    }
    
    public static int Update(String MaHDBan, String MaNhanVien, String NgayBan,String MaKhach,float TongTien){
        Connection con = DBConnect.MoKetNoi();
        if(con != null){
            try{
               Statement stmt = con.createStatement();
               String sql = "update HDBan set MANV = '"+ MaNhanVien +"',NgayBan = '"+ NgayBan +"', MaKhach = '"+ MaKhach +"',TongTien = "+ TongTien +" where MaHDBan = '"+ MaHDBan +"' and MaNhanVien = '"+ MaNhanVien +"'";
               int rs = stmt.executeUpdate(sql);
               if(rs < 1){
                   con.close();
                   return 0;
               } else {
                   con.close();
                   return 1;
               }
            } catch (SQLException ex){
                return 0;
            }
        }
        return 0;
    }
    
    public static int Delete(String MaHDBan){
        Connection con = DBConnect.MoKetNoi();
        if(con != null){
            try{
                Statement stmt = con.createStatement();
                String sql = "delete from HOADONBAN where MAHD = '"+MaHDBan+"'";
                int rs = stmt.executeUpdate(sql);
                if(rs < 1){
                   con.close();
                   return 0;
               } else {
                   con.close();
                   return 1;
               }
            } catch (SQLException ex){
                return 0;
            }
        }
        return 0;
    }
}
