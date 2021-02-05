/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author FİU
 */
public class Main {
    public static void main(String[] args){
        Urun telefon = new Urun("Samsung",1.500);
        Urun bilgisayar = new Urun("Hp",5.000);
        
        Sepet sepet = new Sepet();
        Odeme odeme = new Odeme();
        
        Standart standartUyelik = new Standart(); 
        
        Premium premiumUyelik = new Premium();
        
        Ozel ozelUyelik = new Ozel();
        Kullanici kullanici1 = new Kullanici();
        kullanici1.setIsim("İrem");
        kullanici1.setEmail("@gmail.com");
        kullanici1.setSifre("123456");
        kullanici1.setTip(ozelUyelik);
        
        sepet.urunEkle(telefon);
        sepet.urunEkle(bilgisayar);
        
       
        
        System.out.println(kullanici1.getIsim()+" : "+odeme.fiyatHesapla(kullanici1, sepet));
        
        
        
    }
}
