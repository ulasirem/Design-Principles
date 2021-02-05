
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
public class Main {
    public static void main(String[] args){
        
        Toplayici toplayici = new Toplayici();
        
        Kare k1 = new Kare(5);
        Dikdortgen d1 = new Dikdortgen(3,5);
        Daire daire = new Daire(8);
        
        System.out.println("Kare alan : "+k1.alanhesapla()+" cevre : "+k1.cevreHesapla());
        System.out.println("Dikdörtgen alan : "+d1.alanhesapla()+" cevre : "+d1.cevreHesapla());
        System.out.println("Daire alan : "+daire.alanhesapla()+" cevre : "+daire.cevreHesapla());
    
        ArrayList<CevreHesapla> cevreHesaplaList = new ArrayList<>();
        ArrayList<AlanHesapla> alanHesaplaList = new ArrayList<>();
        
        cevreHesaplaList.add(k1);
        cevreHesaplaList.add(d1);
        cevreHesaplaList.add(daire);
        
        alanHesaplaList.add(k1);
        alanHesaplaList.add(d1);
        alanHesaplaList.add(daire);
        
        System.out.println("Toplam çevre : "+toplayici.cevreToplayici(cevreHesaplaList));
        System.out.println("Toplam alan : "+toplayici.alanToplayici(alanHesaplaList));
    }
}
