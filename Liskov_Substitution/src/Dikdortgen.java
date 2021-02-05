/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author FİU
 */
public class Dikdortgen implements AlanHesapla, CevreHesapla{
    private double kenar1;
    private double kenar2;

    public double getKenar1() {
        return kenar1;
    }

    public void setKenar1(double kenar1) {
        this.kenar1 = kenar1;
    }

    public double getKenar2() {
        return kenar2;
    }

    public void setKenar2(double kenar2) {
        this.kenar2 = kenar2;
    }

    public Dikdortgen(double kenar1, double kenar2) {
        this.kenar1 = kenar1;
        this.kenar2 = kenar2;
    }
    
    

    @Override
    public double alanhesapla() {
        return kenar1*kenar2;
    }

    @Override
    public double cevreHesapla() {
        return 2*(kenar1 + kenar2);
    }
    
}
