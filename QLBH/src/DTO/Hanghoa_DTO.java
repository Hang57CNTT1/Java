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
public class Hanghoa_DTO {
    private String mahang,tenhang,macl,anh,ghichu;
    private float dgnhap,soluong,dgban;
    
    public Hanghoa_DTO(String MaHang, String TenHang,String MaChatLieu,float SoLuong,float DonGiaNhap,float DonGiaBan,String Anh,String GhiChu){
        this.mahang = MaHang;
        this.tenhang = TenHang;
        this.macl = MaChatLieu;
        this.soluong = SoLuong;
        this.dgnhap = DonGiaBan;
        this.dgban = DonGiaNhap;
        this.anh = Anh;
        this.ghichu = GhiChu;
    }

    /**
     * @return the mahang
     */
    public String getMahang() {
        return mahang;
    }

    /**
     * @param mahang the mahang to set
     */
    public void setMahang(String mahang) {
        this.mahang = mahang;
    }

    /**
     * @return the tenhang
     */
    public String getTenhang() {
        return tenhang;
    }

    /**
     * @param tenhang the tenhang to set
     */
    public void setTenhang(String tenhang) {
        this.tenhang = tenhang;
    }

    /**
     * @return the macl
     */
    public String getMacl() {
        return macl;
    }

    /**
     * @param macl the macl to set
     */
    public void setMacl(String macl) {
        this.macl = macl;
    }

    /**
     * @return the anh
     */
    public String getAnh() {
        return anh;
    }

    /**
     * @param anh the anh to set
     */
    public void setAnh(String anh) {
        this.anh = anh;
    }

    /**
     * @return the ghichu
     */
    public String getGhichu() {
        return ghichu;
    }

    /**
     * @param ghichu the ghichu to set
     */
    public void setGhichu(String ghichu) {
        this.ghichu = ghichu;
    }

    /**
     * @return the dgnhap
     */
    public float getDgnhap() {
        return dgnhap;
    }

    /**
     * @param dgnhap the dgnhap to set
     */
    public void setDgnhap(float dgnhap) {
        this.dgnhap = dgnhap;
    }

    /**
     * @return the soluong
     */
    public float getSoluong() {
        return soluong;
    }

    /**
     * @param soluong the soluong to set
     */
    public void setSoluong(float soluong) {
        this.soluong = soluong;
    }

    /**
     * @return the dgban
     */
    public float getDgban() {
        return dgban;
    }

    /**
     * @param dgban the dgban to set
     */
    public void setDgban(float dgban) {
        this.dgban = dgban;
    }
}

   