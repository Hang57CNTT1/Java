/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

import DTO.Nhanvien_DTO;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author Hang
 */
public class NhanVien_DAL {
    public static ArrayList<Nhanvien_DTO> getAll(){
        Connection con = DBConnect.MoKetNoi();
        if(con != null){
            try{
                Statement stmt = con.createStatement();
                String sql = "select * from NHANVIEN";
                ResultSet rs = stmt.executeQuery(sql);
                ArrayList<Nhanvien_DTO> ds = new ArrayList<>();
                while(true){
                    if(!rs.next()) break;
                    String MaNhanVien = rs.getString("MaNhanVien");
                    String TenNhanVien = rs.getString("TENNV");
                    String GioiTinh = rs.getString("GIOITINH");
                    String DiaChi = rs.getString("DIACHI");
                    String DienThoai = rs.getString("DIENTHOAI");
                    String NgaySinh = rs.getString("NGAYSINH");
                    Nhanvien_DTO NV= new Nhanvien_DTO(MaNhanVien, TenNhanVien, GioiTinh, DiaChi, DienThoai, NgaySinh);
                    ds.add(NV);
                }
                con.close();
                return ds;
            }catch(SQLException ex){
                return null;
            }
        }
        return null;
    }
    
    public static String TenNhanVien(String MaNhanVien){
        Connection con = DBConnect.MoKetNoi();
        if(con != null){
            try{
                Statement stmt = con.createStatement();
                String sql = "select TENNV from NHANVIEN where MANV='"+ MaNhanVien +"'";
                ResultSet rs = stmt.executeQuery(sql);
                String TenNhanVien = null;
                if(rs.next()){
                    return rs.getString("TENNV");
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
    
    public static int Insert(String MaNhanVien, String TenNhanVien, String GioiTinh, String DiaChi, String DienThoai,String NgaySinh){
        Connection con = DBConnect.MoKetNoi();
        if(con != null){
            try{
               Statement stmt = con.createStatement();
               String sql = "insert into NHANVIEN values ('"+ MaNhanVien +"','"+ TenNhanVien +"','"+ GioiTinh +"','"+DiaChi+"','"+ DienThoai +"','"+NgaySinh+"')";
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
    
    public static int Update(String MaNhanVien, String TenNhanVien, String GioiTinh, String DiaChi, String DienThoai,String NgaySinh){
        Connection con = DBConnect.MoKetNoi();
        if(con != null){
            try{
               Statement stmt = con.createStatement();
               String sql = "update NHAVIEN set TENNV = '"+ TenNhanVien +"', GIOITINH = '"+ GioiTinh +"',DIACHI = '"+ DiaChi +"',DIENTHOAI = '"+ DienThoai +"',NGAYSINH = '"+ NgaySinh +"' where MANV = '"+ MaNhanVien +"'";
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
    
    public static int Delete(String MaNhanVien){
        Connection con = DBConnect.MoKetNoi();
        if(con != null){
            try{
                Statement stmt = con.createStatement();
                String sql = "delete from NHANVIEN where MANV = '"+MaNhanVien+"'";
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
