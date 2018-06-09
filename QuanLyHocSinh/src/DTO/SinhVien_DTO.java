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
public class SinhVien_DTO {
    private int masv;
    private String hosv;
    private String tensv;
    private String gt;
    private String ns;
    private String phone;
    private String diachi;

    public SinhVien_DTO(int masv, String hosv, String tensv, String gt, String ns, String phone, String diachi) {
        this.masv = masv;
        this.hosv = hosv;
        this.tensv = tensv;
        this.gt = gt;
        this.ns = ns;
        this.phone = phone;
        this.diachi = diachi;
    }
    
    public SinhVien_DTO() {
    }

    /**
     * @return the masv
     */
    public int getMasv() {
        return masv;
    }

    /**
     * @param masv the masv to set
     */
    public void setMasv(int masv) {
        this.masv = masv;
    }

    /**
     * @return the hosv
     */
    public String getHosv() {
        return hosv;
    }

    /**
     * @param hosv the hosv to set
     */
    public void setHosv(String hosv) {
        this.hosv = hosv;
    }

    /**
     * @return the tensv
     */
    public String getTensv() {
        return tensv;
    }

    /**
     * @param tensv the tensv to set
     */
    public void setTensv(String tensv) {
        this.tensv = tensv;
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
     * @return the ns
     */
    public String getNs() {
        return ns;
    }

    /**
     * @param ns the ns to set
     */
    public void setNs(String ns) {
        this.ns = ns;
    }

    /**
     * @return the phone
     */
    public String getPhone() {
        return phone;
    }

    /**
     * @param phone the phone to set
     */
    public void setPhone(String phone) {
        this.phone = phone;
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
}
