/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author FİU
 */
//kullanici ve şifrenin birbirini sağlayıp sağlamadığını görürüz
public class GirisYap {
    
    public boolean kontrol(Kullanici kullanici, String sifre){
        return kullanici.getSifre().equals(sifre);
    }
}
