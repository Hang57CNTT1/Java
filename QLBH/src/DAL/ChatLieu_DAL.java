/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

import java.sql.Connection;
import DTO.*;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author Hang
 */
public class ChatLieu_DAL {
    public static ArrayList<Chatlieu_DTO> getALL(){
        Connection con = DBConnect.MoKetNoi();
        if(con != null){
            try{
                Statement stmt = con.createStatement();
                String sql = "select * from ChatLieu";
                ResultSet rs = stmt.executeQuery(sql);
                ArrayList<Chatlieu_DTO> chat = new ArrayList<>();
                while (true){
                    if(!rs.next()) break;
                    String MaChatLieu = rs.getString("MaChatLieu");
                    String TenChatLieu = rs.getString("TenChatLieu");
                    DTO.Chatlieu_DTO chatLieu = new DTO.Chatlieu_DTO(MaChatLieu, TenChatLieu);
                    chat.add(chatLieu); 
                }
                con.close();
                return chat;
            } catch(SQLException ex){
                System.out.println(ex);
                return null;
            }
        } 
        return null;
    }
    public static ArrayList<Chatlieu_DTO> getById(int id){
        
        return null;
     }
    public static int Insert(String MaChatLieu, String TenChatLieu){
        Connection con = DBConnect.MoKetNoi();
        if(con != null){
            try{
                Statement stmt = con.createStatement();
                String sql = "insert into Chatlieu_DTO(MaChatLieu,TenChatLieu) values ('"+ MaChatLieu +"',N'"+ TenChatLieu +"')";
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
    
    public static int Update(String MaChatLieu, String TenChatLieu){
        Connection con = DBConnect.MoKetNoi();
        if(con != null){
            try{
                Statement stmt = con.createStatement();
                String sql = "update Chatlieu_DTO set TenChatLieu = N'"+ TenChatLieu +"' where MaChatLieu = '"+ MaChatLieu +"'";
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
    
    public static int Delete(String MaChatLieu){
        Connection con = DBConnect.MoKetNoi();
        if (con != null){
            try{
                Statement stmt = con.createStatement();
                String sql = "delete from Chatlieu_DTO where MaChatLieu = '"+ MaChatLieu +"'";
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
