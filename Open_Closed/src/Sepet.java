
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
public class Sepet {
    private ArrayList<Urun> urunler;
    
    //Urun arraylist i başta oluşsun ki urun eklemekte sıkıntı yaşamayalım
    public Sepet(){
        urunler = new ArrayList<Urun>();
    }
    
    public void urunEkle(Urun urun){
        urunler.add(urun);
    }
    
    public double Tutar(){
        double tutar=0;
        for(Urun urun : urunler){
            tutar += urun.getFiyat();
        }
        return tutar;
    }
    
    public int Adet(){
        return urunler.size();
    }
}
