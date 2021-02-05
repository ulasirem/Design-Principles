
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author FİU
 */
public class Veritabani {
    private ArrayList<Kullanici> kullanicilar;
    private ArrayList<Urun> urunler;
    
    public Veritabani(){
        kullanicilar = new ArrayList<>();
        urunler = new ArrayList<>();
    }
    

    public ArrayList<Kullanici> getKullanicilar() {
        return kullanicilar;
    }

    public void setKullanicilar(ArrayList<Kullanici> kullanicilar) {
        this.kullanicilar = kullanicilar;
    }

    public ArrayList<Urun> getUrunler() {
        return urunler;
    }

    public void setUrunler(ArrayList<Urun> urunler) {
        this.urunler = urunler;
    }
    
    
}
