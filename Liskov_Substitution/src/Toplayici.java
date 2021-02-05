
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
public class Toplayici {
    
    public double alanToplayici(ArrayList<AlanHesapla> sekiller){
       double toplam = 0;
       
       for(AlanHesapla sekil : sekiller){
           toplam += sekil.alanhesapla();
       }
       return toplam;
    }
    public double cevreToplayici(ArrayList<CevreHesapla> sekiller){
        double toplam = 0;
        
        for(CevreHesapla sekil : sekiller){
            toplam += sekil.cevreHesapla();
        }
        return toplam;
    }
}
