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
public class HDBan_DTO {
    private String mahdban;
    private String manv;
    private String ngayban;
    private String makh;
    private float tongtien;
    
     public HDBan_DTO(String maHDBan, String MaNhanVien, String NgayBan,String MaKhach,float TongTien){
        this.mahdban = maHDBan;
        this.manv = MaNhanVien;
        this.ngayban = NgayBan;
        this.makh = MaKhach;
        this.tongtien = TongTien;
    }

    /**
     * @return the mahdban
     */
    public String getMahdban() {
        return mahdban;
    }

    /**
     * @param mahdban the mahdban to set
     */
    public void setMahdban(String mahdban) {
        this.mahdban = mahdban;
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
     * @return the ngayban
     */
    public String getNgayban() {
        return ngayban;
    }

    /**
     * @param ngayban the ngayban to set
     */
    public void setNgayban(String ngayban) {
        this.ngayban = ngayban;
    }

    /**
     * @return the makh
     */
    public String getMakh() {
        return makh;
    }

    /**
     * @param makh the makh to set
     */
    public void setMakh(String makh) {
        this.makh = makh;
    }

    /**
     * @return the tongtien
     */
    public float getTongtien() {
        return tongtien;
    }

    /**
     * @param tongtien the tongtien to set
     */
    public void setTongtien(float tongtien) {
        this.tongtien = tongtien;
    }
}
