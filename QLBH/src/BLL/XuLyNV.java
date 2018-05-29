/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BLL;

import DAL.CTHDBan_DAL;
import DAL.ChatLieu_DAL;
import DAL.HangHoa_DAL;
import DAL.HoaDonBan_DAL;
import DAL.KhachHang_DAL;
import DAL.NhanVien_DAL;
import DTO.Chatlieu_DTO;
import DTO.HDBan_DTO;
import DTO.Hanghoa_DTO;
import DTO.Khach_DTO;
import DTO.Nhanvien_DTO;
import java.util.ArrayList;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Hang
 */
public class XuLyNV {
    //FORM CHẤT LIỆU
    
    public static ArrayList<Chatlieu_DTO> ChatLieuArray(){
        return ChatLieu_DAL.getALL();
    }
    
    public static DefaultTableModel ChatLieuModel(){
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("Mã Chất Liệu");
        model.addColumn("Tên Chất Liệu");
        try{
            for(int i = 0; i < ChatLieuArray().size(); i++){
                Vector<String> h = new Vector();
                h.add(ChatLieuArray().get(i).getMacl());
                h.add(ChatLieuArray().get(i).getTencl());
                model.addRow(h);
            }
            return model;
        }catch (Exception ex){
            System.out.println("Lỗi" + ex);
            return null;
        }
    }
    
    public static int InsertChatLieu(String MaChatLieu,String TenChatLieu){
        return ChatLieu_DAL.Insert(MaChatLieu, TenChatLieu);
    }
    
    public static int UpdateChatLieu(String MaChatLieu, String TenChatLieu){
        return ChatLieu_DAL.Update(MaChatLieu, TenChatLieu);
    }
    
    public static int DeleteChatLieu(String MaChatLieu){
        return ChatLieu_DAL.Delete(MaChatLieu);
    }
    
    public static ArrayList<Nhanvien_DTO> NhanVienArray(){
        return NhanVien_DAL.getAll();
    }
    
    public static DefaultTableModel NhanVienModel(){
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("Mã Nhân Viên");
        model.addColumn("Tên Nhân Viên");
        model.addColumn("Giới tính");
        model.addColumn("Địa chỉ");
        model.addColumn("Điện thoại");
        model.addColumn("Ngày sinh");
        try{
            for(int i = 0; i < NhanVienArray().size(); i++){
                Vector<String> h = new Vector();
                h.add(NhanVienArray().get(i).getManv());
                h.add(NhanVienArray().get(i).getTennv());
                h.add(NhanVienArray().get(i).getGt());
                h.add(NhanVienArray().get(i).getDiachi());
                h.add(NhanVienArray().get(i).getDienthoai());
                h.add(NhanVienArray().get(i).getNgaysinh());
                model.addRow(h);
            }
            return model;
        }catch (Exception ex){
            System.out.println("Lỗi" + ex);
            return null;
        }
    }
    
    public static int InsertNhanVien(String MaNhanVien, String TenNhanVien, String GioiTinh, String DiaChi, String DienThoai,String NgaySinh){
        return NhanVien_DAL.Insert(MaNhanVien, TenNhanVien, GioiTinh, DiaChi, DienThoai, NgaySinh);
    }
    
    public static int UpdateNhanVien(String MaNhanVien, String TenNhanVien, String GioiTinh, String DiaChi, String DienThoai,String NgaySinh){
        return NhanVien_DAL.Update(MaNhanVien, TenNhanVien, GioiTinh, DiaChi, DienThoai, NgaySinh);
    }
    
    public static int DeleteNhanVien(String MaNhanVien){
        return NhanVien_DAL.Delete(MaNhanVien);
    }
    
    //FORM DANH MỤC HÀNG HÓA
    
    public static ArrayList<Hanghoa_DTO> HangArray(){
        return HangHoa_DAL.getAll();
    }
    
    public static DefaultTableModel HangModel(){
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("Mã Hàng");
        model.addColumn("Tên hàng");
        model.addColumn("Mã chất liệu");
        model.addColumn("Số lượng");
        model.addColumn("Đơn giá nhập");
        model.addColumn("Đơn giá bán");
        model.addColumn("Ảnh");
        model.addColumn("Ghi chú");
        try{
            for(int i = 0; i < HangArray().size(); i++){
                Vector<String> h = new Vector();
                h.add(HangArray().get(i).getMahang());
                h.add(HangArray().get(i).getTenhang());
                h.add(HangArray().get(i).getMacl());
                h.add(String.valueOf(HangArray().get(i).getSoluong()));
                h.add(String.valueOf(HangArray().get(i).getDgnhap()));
                h.add(String.valueOf(HangArray().get(i).getDgban()));
                h.add(HangArray().get(i).getAnh());
                h.add(HangArray().get(i).getGhichu());
                model.addRow(h);
            }
            return model;
        } catch (Exception e){
            return null;
        }
    }
    
    public static int InsertHang(String MaHang,String TenHang,String MaChatLieu, float SoLuong,float DonGiaNhap,float DonGiaBan,String Anh,String GhiChu){
        try{
            return HangHoa_DAL.Insert(MaHang, TenHang, MaChatLieu, SoLuong, DonGiaNhap, DonGiaBan, Anh, GhiChu);
        } catch (Exception e){
            System.out.println("Lỗi" + e);
            return 0;
        }
    }
    
    public static int UpdateHang(String MaHang,String TenHang,String MaChatLieu, float SoLuong,float DonGiaNhap,float DonGiaBan,String Anh,String GhiChu){
        try{
            return HangHoa_DAL.Update(MaHang, TenHang, MaChatLieu, SoLuong, DonGiaNhap, DonGiaBan, Anh, GhiChu);
        } catch (Exception e){
            System.out.println("Lỗi" + e);
            return 0;
        }
    }
    
    public static int DeleteHang(String MaHang){
        try {
            return HangHoa_DAL.Delete(MaHang);
        } catch (Exception e) {
            System.out.println("Lỗi:" + e);
            return 0;
        }
    }
    
    //FORM KHÁCH HÀNG
    
    public static ArrayList<Khach_DTO> KhachArray(){
        return KhachHang_DAL.getAll();
    }
    
    public static DefaultTableModel KhachModel(){
        try{
            DefaultTableModel model = new DefaultTableModel();
            model.addColumn("Mã Khách");
            model.addColumn("Tên khách");
            model.addColumn("Địa chỉ");
            model.addColumn("Điện thoại");
            for(int i = 0; i < KhachArray().size();i++ ){
                Vector<String> h = new Vector<>();
                h.add(KhachArray().get(i).getMakh());
                h.add(KhachArray().get(i).getTenkh());
                h.add(KhachArray().get(i).getDiachi());
                h.add(KhachArray().get(i).getDienthoai());
                model.addRow(h);
            }
            return model;
        } catch (Exception e){
            return null;
        }
    }
    
    public static int InsertKhach(String MaKhach,String TenKhach,String DiaChi,String DienThoai){
        return KhachHang_DAL.Insert(MaKhach, TenKhach, DiaChi, DienThoai);
    }
    
    public static int UpdateKhach(String MaKhach,String TenKhach,String DiaChi,String DienThoai){
        return KhachHang_DAL.Update(MaKhach, TenKhach, DiaChi, DienThoai);
    }
    
    public static int DeleteKhach(String MaKhach){
        return KhachHang_DAL.Delete(MaKhach);
    }
    
    //FORM HÓA ĐƠN BÁN
    
    public static ArrayList<HDBan_DTO> HDBanArray(){
        return HoaDonBan_DAL.getAll();
    }
    
    public static DefaultTableModel HDBanModel(){
        try{
            DefaultTableModel model = new DefaultTableModel();
            model.addColumn("Mã Hàng");
            model.addColumn("Tên hàng");
            model.addColumn("Số lượng");
            model.addColumn("Đơn giá");
            model.addColumn("Giảm giá");
            model.addColumn("Thành tiền");
            return model;
        } catch (Exception e){
            return null;
        }
    }
    
//    public static void RowHDBan(String MaHang,String TenHang,String SoLuong,String DonGia,String GiamGia, String ThanhTien){
//        Vector<String> h = new Vector<>();
//        h.add(MaHang);
//        h.add(TenHang);
//        h.add(SoLuong);
//        h.add(DonGia);
//        h.add(GiamGia);
//        h.add(ThanhTien);
//        HDBanModel().addRow(h);
//    }
    
    
    public static String TenNVHDBan(String MaNhanVien){
        return NhanVien_DAL.TenNhanVien(MaNhanVien);
    }
    
    public static String TenKhachHDBan(String MaKhach){
        return KhachHang_DAL.TenKhach(MaKhach);
    }
    
    public static String DTKhachHDBan(String MaKhach){
        return KhachHang_DAL.DienThoai(MaKhach);
    }
    
    public static String DCKhachHDBan(String MaKhach){
        return KhachHang_DAL.DiaChi(MaKhach);
    }
    
    public static String TenHangHDBan(String MaHang){
        return HangHoa_DAL.TenHang(MaHang);
    }
    
    public static String DonGiaHDBan(String MaHang){
        return HangHoa_DAL.DonGia(MaHang);
    }
    
    public static int InsertHDBan(String MaHDBan,String MaNhanVien, String NgayBan,String MaKhach,float TongTien){
        return HoaDonBan_DAL.Insert(MaHDBan, MaNhanVien, NgayBan, MaKhach, TongTien);
    }
    
    public static int UpdateHDBan(String MaHDBan,String MaNhanVien, String NgayBan,String MaKhach,float TongTien){
        return HoaDonBan_DAL.Update(MaHDBan, MaNhanVien, NgayBan, MaKhach, TongTien);
    }
    
    public static int DeleteHDBan(String MaHDBan){
        return HoaDonBan_DAL.Delete(MaHDBan);
    }
    
    public static int InsertChiTietHDBan(String MaHDBan, String MaHang, float SoLuong,float DonGia,float GiamGia,float ThanhTien){
        return CTHDBan_DAL.Insert(MaHDBan, MaHang, SoLuong, DonGia, GiamGia, ThanhTien);
    }
    
    //FORM TÌM HÓA ĐƠN
    
    public static DefaultTableModel TimHDBanModel(){
        try{
            DefaultTableModel model = new DefaultTableModel();
            model.addColumn("Mã HĐB");
            model.addColumn("Mã nhân viên");
            model.addColumn("Ngày bán");
            model.addColumn("Tên khách");
            model.addColumn("Tổng tiền");
            return model;
        } catch (Exception e){
            return null;
        }
    }
    
    public static ArrayList<HDBan_DTO> FindHD(String MaHoaDon,String MaNhanVien,String MaKhachHang){
        return HoaDonBan_DAL.findHD(MaHoaDon, MaNhanVien, MaHoaDon);
    }
    
}
