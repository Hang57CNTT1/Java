/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DTO;

/**
 *
 * @author Hang
 */
public class Nhanvien_DTO {
    private String manv;
    private  String tennv;
    private  String gt;
    private String diachi;
    private String dienthoai,ngaysinh;
    
    public Nhanvien_DTO(String MaNhanVien, String TenNhanVien, String GioiTinh, String DiaChi, String DienThoai,String NgaySinh){
        this.manv = MaNhanVien;
        this.tennv = TenNhanVien;
        this.gt = GioiTinh;
        this.diachi = DiaChi;
        this.dienthoai = DienThoai;
        this.ngaysinh = NgaySinh;
    }
    /**
     * @return the manv
     */
    public String getManv() {
        return manv;
    }

    /**
     * @param manv the manv to set
     */
    public void setManv(String manv) {
        this.manv = manv;
    }

    /**
     * @return the tennv
     */
    public String getTennv() {
        return tennv;
    }

    /**
     * @param tennv the tennv to set
     */
    public void setTennv(String tennv) {
        this.tennv = tennv;
    }

    /**
     * @return the gt
     */
    public String getGt() {
        return gt;
    }

    /**
     * @param gt the gt to set
     */
    public void setGt(String gt) {
        this.gt = gt;
    }

    /**
     * @return the diachi
     */
    public String getDiachi() {
        return diachi;
    }

    /**
     * @param diachi the diachi to set
     */
    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }

    /**
     * @return the dienthoai
     */
    public String getDienthoai() {
        return dienthoai;
    }

    /**
     * @param dienthoai the dienthoai to set
     */
    public void setDienthoai(String dienthoai) {
        this.dienthoai = dienthoai;
    }

    /**
     * @return the ngaysinh
     */
    public String getNgaysinh() {
        return ngaysinh;
    }

    /**
     * @param ngaysinh the ngaysinh to set
     */
    public void setNgaysinh(String ngaysinh) {
        this.ngaysinh = ngaysinh;
    }
}
