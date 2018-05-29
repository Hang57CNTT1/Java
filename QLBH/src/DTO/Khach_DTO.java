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
public class Khach_DTO {
    private String makh;
    private String tenkh;
    private String diachi;
    private String dienthoai;

    public Khach_DTO(String MaKhach,String TenKhach, String DiaChi, String DienThoai){
        this.makh = MaKhach;
        this.tenkh = TenKhach;
        this.dienthoai = DienThoai;
        this.diachi= DiaChi;
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
     * @return the tenkh
     */
    public String getTenkh() {
        return tenkh;
    }

    /**
     * @param tenkh the tenkh to set
     */
    public void setTenkh(String tenkh) {
        this.tenkh = tenkh;
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
}
