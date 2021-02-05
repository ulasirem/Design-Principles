/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author FİU
 */
public class Adres {
    private String ulke;
    private String il;
    private String ilce;
    private int postaKodu;

    public String getUlke() {
        return ulke;
    }

    public void setUlke(String ulke) {
        this.ulke = ulke;
    }

    public String getIl() {
        return il;
    }

    public void setIl(String il) {
        this.il = il;
    }

    public String getIlce() {
        return ilce;
    }

    public void setIlce(String ilce) {
        this.ilce = ilce;
    }

    public int getPostaKodu() {
        return postaKodu;
    }

    public void setPostaKodu(int postaKodu) {
        this.postaKodu = postaKodu;
    }
    
    public String toString(){
        return getUlke()+" "+getIl()+" "+getIlce()+" "+getPostaKodu();
    }
}
