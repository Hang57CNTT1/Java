/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

import DTO.Hanghoa_DTO;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author Hang
 */
public class HangHoa_DAL {
    public static ArrayList<Hanghoa_DTO> getAll(){
        Connection con = DBConnect.MoKetNoi();
        if(con != null){
            try{
                Statement stmt = con.createStatement();
                String sql = "select * from HANGHOA";
                ResultSet rs = stmt.executeQuery(sql);
                ArrayList<Hanghoa_DTO> ds = new ArrayList<>();
                while(true){
                    if(!rs.next()) break;
                    String MaHang = rs.getString("MAHANG");
                    String TenHang = rs.getString("TENHANG");
                    String MaChatLieu = rs.getString("MACL");
                    float SoLuong = rs.getFloat("SOLUONG");
                    float DonGiaNhap = rs.getFloat("DONGIANHAP");
                    float DonGiaBan = rs.getFloat("DONGIABAN");
                    String Anh = rs.getString("ANH");
                    String GhiChu = rs.getString("GHICHU");
                    Hanghoa_DTO mathang = new Hanghoa_DTO(MaHang, TenHang, MaChatLieu, SoLuong, DonGiaNhap, DonGiaBan, Anh, GhiChu);
                    ds.add(mathang);
                }
                con.close();
                return ds;
            }catch(SQLException ex){
                return null;
            }
        }
        return null;
    }
    
    public static String TenHang(String MaHang){
        Connection con = DBConnect.MoKetNoi();
        if(con != null){
            try{
                Statement stmt = con.createStatement();
                String sql = "select TENHANG from HANGHOA where MAHANG ='"+ MaHang +"'";
                ResultSet rs = stmt.executeQuery(sql);
                if(rs.next()){
                    return rs.getString("TENHANG");
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
    
    public static String DonGia(String MaHang){
        Connection con = DBConnect.MoKetNoi();
        if(con != null){
            try{
                Statement stmt = con.createStatement();
                String sql = "select DONGIABAN from HANGHOA where MAHANG='"+ MaHang +"'";
                ResultSet rs = stmt.executeQuery(sql);
                if(rs.next()){
                    return rs.getString("DONGIABAN");
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
    
    public static int Insert(String MaHang,String TenHang,String MaChatLieu, float SoLuong,float DonGiaNhap,float DonGiaBan,String Anh,String GhiChu){
        Connection con = DBConnect.MoKetNoi();
        if(con != null){
            try{
               Statement stmt = con.createStatement();
               String sql = "insert into HANG values ('"+ MaHang +"',N'"+ TenHang +"','"+ MaChatLieu +"',"+ SoLuong +","+ DonGiaNhap +","+ DonGiaBan +",'"+ Anh +"',N'"+ GhiChu +"')";
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
    
    public static int Update(String MaHang,String TenHang,String MaChatLieu, float SoLuong,float DonGiaNhap,float DonGiaBan,String Anh,String GhiChu){
        Connection con = DBConnect.MoKetNoi();
        if(con != null){
            try{
               Statement stmt = con.createStatement();
               String sql = "update HANG set TENHANG = N'" + TenHang + "',MACL = '" + MaChatLieu + "', SOLUONG = "+ SoLuong +",DONGIANHAP = "+ DonGiaNhap +",DONGIABAN = "+ DonGiaBan +", ANH = '" + Anh + "',GHICHU = N'" + GhiChu + "' where MAHANG = '"+ MaHang +"'";
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
    
    public static int Delete(String MaHang){
        Connection con = DBConnect.MoKetNoi();
        if(con != null){
            try{
                Statement stmt = con.createStatement();
                String sql = "delete from HANGHOA where MAHANG = '"+MaHang+"'";
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
