/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author FİU
 */
public class Odeme {
    public double fiyatHesapla(Kullanici kullanici, Sepet sepet){
        return kullanici.getTip().indirimliTutar(sepet.Tutar(), sepet.Adet());
    }
}
