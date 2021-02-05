/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author FİU
 */
public class Kullanici {
    private String isim;
    private String email;
    private String sifre;
    private Kullanici_Tipi tip;

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSifre() {
        return sifre;
    }

    public void setSifre(String sifre) {
        this.sifre = sifre;
    }

    public Kullanici_Tipi getTip() {
        return tip;
    }

    public void setTip(Kullanici_Tipi tip) {
        this.tip = tip;
    }
    
    
    
}
