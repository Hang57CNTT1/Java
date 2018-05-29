/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DTO;

import static com.sun.org.apache.xalan.internal.xsltc.compiler.util.Type.Int;

/**
 *
 * @author Hang
 */
public class ChitietHD_DTO {
    private String mahd;
    private String mahang;
    private String soluong;
    private float dongia;
    private float giamgia;
    private float thanhtien;
    
    public ChitietHD_DTO(String MaHDBan, String MaHang,String SoLuong,float DonGia,float GiamGia,float ThanhTien){
        this.mahd = MaHDBan;
        this.mahang = MaHang;
        this.soluong = SoLuong;
        this.dongia = DonGia;
        this.giamgia = GiamGia;
        this.thanhtien = ThanhTien;
    }

    /**
     * @return the mahd
     */
    public String getMahd() {
        return mahd;
    }

    /**
     * @param mahd the mahd to set
     */
    public void setMahd(String mahd) {
        this.mahd = mahd;
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
     * @return the soluong
     */
    public String getSoluong() {
        return soluong;
    }

    /**
     * @param soluong the soluong to set
     */
    public void setSoluong(String soluong) {
        this.soluong = soluong;
    }

    /**
     * @return the dongia
     */
    public float getDongia() {
        return dongia;
    }

    /**
     * @param dongia the dongia to set
     */
    public void setDongia(float dongia) {
        this.dongia = dongia;
    }

    /**
     * @return the giamgia
     */
    public float getGiamgia() {
        return giamgia;
    }

    /**
     * @param giamgia the giamgia to set
     */
    public void setGiamgia(float giamgia) {
        this.giamgia = giamgia;
    }

    /**
     * @return the thanhtien
     */
    public float getThanhtien() {
        return thanhtien;
    }

    /**
     * @param thanhtien the thanhtien to set
     */
    public void setThanhtien(float thanhtien) {
        this.thanhtien = thanhtien;
    }
}
