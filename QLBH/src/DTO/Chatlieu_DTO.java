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
public class Chatlieu_DTO {
    private String macl;
    private String tencl;

       public Chatlieu_DTO(String MaChatLieu, String TenChatLieu){
            this.macl = MaChatLieu;
            this.tencl = TenChatLieu;
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
     * @return the tencl
     */
    public String getTencl() {
        return tencl;
    }

    /**
     * @param tencl the tencl to set
     */
    public void setTencl(String tencl) {
        this.tencl = tencl;
    }
    
}
