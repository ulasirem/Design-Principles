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
        
        Kullanici k1 = new Kullanici();
        Adres a = new Adres();
        
        k1.setIsim("İrem");
        k1.setMail("@gmail");
        k1.setSifre("123456");
        
        a.setUlke("Türkiye");
        a.setIl("Denizli");
        a.setIlce("Merkezefendi");
        a.setPostaKodu(20040);
        
        k1.adresGuncelle(a);
        System.out.println(k1.toString());
        
        a.setIl("Aydın");
        k1.adresGuncelle(a);
        
        System.out.println(k1.toString());
    
    }
} 
