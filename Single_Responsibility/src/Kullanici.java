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
    private String mail;
    private Adres adres;
    private String sifre;

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getSifre() {
        return sifre;
    }

    public void setSifre(String sifre) {
        this.sifre = sifre;
    }

    public String getAdres() {
        return adres.toString();
    }
   
    public void adresGuncelle(Adres adres){
        this.adres = adres;
    }
    
    public String toString(){
        return getIsim()+" "+getMail()+" "+getAdres();
    }
    
    
}
