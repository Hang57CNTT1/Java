/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

import DTO.Khach_DTO;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author Hang
 */
public class KhachHang_DAL {
    public static ArrayList<Khach_DTO> getAll(){
        Connection con = DBConnect.MoKetNoi();
        if(con != null){
            try{
                Statement stmt = con.createStatement();
                String sql = "select * from Khach";
                ResultSet rs = stmt.executeQuery(sql);
                ArrayList<Khach_DTO> ds = new ArrayList<>();
                while(true){
                    if(!rs.next()) break;
                    String MaKhach = rs.getString("MaKhach");
                    String TenKhach = rs.getString("TenKhach") ;
                    String DiaChi = rs.getString("DiaChi");
                    String DienThoai = rs.getString("DienThoai");
                    Khach_DTO khach= new Khach_DTO(MaKhach, TenKhach, DiaChi, DienThoai);
                    ds.add(khach);
                }
                con.close();
                return ds;
            }catch(SQLException ex){
                return null;
            }
        }
        return null;
    }
    
    public static String TenKhach(String MaKhach){
        Connection con = DBConnect.MoKetNoi();
        if(con != null){
            try{
                Statement stmt = con.createStatement();
                String sql = "select TENKH from Khach where MAKH='"+ MaKhach +"'";
                ResultSet rs = stmt.executeQuery(sql);
                String TenNhanVien = null;
                if(rs.next()){
                    return rs.getString("TENKH");
                } else {
                    return null;
                }
            } catch (SQLException ex){
                System.out.println("lỗi" + ex);
                return null;
            }
        }
        return null;
    }
    
    public static String DiaChi(String MaKhach){
        Connection con = DBConnect.MoKetNoi();
        if(con != null){
            try{
                Statement stmt = con.createStatement();
                String sql = "select DIACHI from KHACHHANG where MAKH ='"+ MaKhach +"'";
                ResultSet rs = stmt.executeQuery(sql);
                String TenNhanVien = null;
                if(rs.next()){
                    return rs.getString("DIACHI");
                } else {
                    return null;
                }
            } catch (SQLException ex){
                System.out.println("lỗi" + ex);
                return null;
            }
        }
        return null;
    }
    
    public static String DienThoai(String MaKhach){
        Connection con = DBConnect.MoKetNoi();
        if(con != null){
            try{
                Statement stmt = con.createStatement();
                String sql = "select DIENTHOAI from KHACHHANG where MAKH ='"+ MaKhach +"'";
                ResultSet rs = stmt.executeQuery(sql);
                String TenNhanVien = null;
                if(rs.next()){
                    return rs.getString("DIENTHOAI");
                } else {
                    return null;
                }
            } catch (SQLException ex){
                System.out.println("lỗi" + ex);
                return null;
            }
        }
        return null;
    }
    
    public static int Insert(String MaKhach,String TenKhach,String DiaChi,String DienThoai){
        Connection con = DBConnect.MoKetNoi();
        if(con != null){
            try{
               Statement stmt = con.createStatement();
               String sql = "insert into KHACHHANG values ('"+ MaKhach +"',N'"+ TenKhach +"','"+ DiaChi +"','"+ DienThoai +"')";
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
    
    public static int Update(String MaKhach,String TenKhach,String DiaChi,String DienThoai){
        Connection con = DBConnect.MoKetNoi();
        if(con != null){
            try{
               Statement stmt = con.createStatement();
               String sql = "update KHACHHANG set TENKH = '"+ TenKhach +"', DIACHI = '"+ DiaChi +"',DIENTHOAI = '"+ DienThoai +"' where MAKH = '"+ MaKhach +"'";
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
    
    public static int Delete(String MaKhach){
        Connection con = DBConnect.MoKetNoi();
        if(con != null){
            try{
                Statement stmt = con.createStatement();
                String sql = "delete from KHACHHANG where MAKH = '"+MaKhach+"'";
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
